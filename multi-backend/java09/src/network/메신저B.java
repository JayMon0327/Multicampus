package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {
	private JTextField input;
	private JTextArea list;
	DatagramSocket socket, socket2;
	InetAddress ip;
	public 메신저B() throws Exception {
		socket = new DatagramSocket(6000);
		socket2 = new DatagramSocket();
		
		 ip = InetAddress.getByName("127.0.0.1");
		
		setTitle("메신저 B");
		setSize(300, 500);
		
		list = new JTextArea();
		list.setFont(new Font("궁서", Font.PLAIN, 30));
		list.setBackground(Color.PINK);
		getContentPane().add(list, BorderLayout.CENTER);
		
		input = new JTextField();
		input.setFont(new Font("궁서", Font.BOLD, 30));
		input.setBackground(Color.BLUE);
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);
		list.setEditable(false);
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				//입력한 값 가지고 와서, list up!
				list.append("나>>" + data + "\n");
				input.setText("");
				try {
					//상대방에게 네트워크 전송! 
					
					byte[] data2 = data.getBytes();
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket2.send(packet);
//					socket.close();
				} catch (Exception e2) {
					System.out.println("데이터 보내는 중 에러발생!");
				}
				
			}
		});
		
		setVisible(true);
	}
	
	public void process() {
		while (true) {
			try {
				//빈 패킷 필요
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("너>>" + new String(data) + "\n");
			} catch (Exception e) {
				System.out.println("데이터 받는 도중 에러발생!!");
			} 
		}
	}
	
	public static void main(String[] args) throws Exception {
		메신저B m = new 메신저B();
		m.process();
	}

}
