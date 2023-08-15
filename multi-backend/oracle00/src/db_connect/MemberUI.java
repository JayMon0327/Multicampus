package db_connect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
    private static JTextField t1;
    private static JTextField t2;
    private static JTextField t3;
    private static JTextField t4;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(Color.GREEN);
        f.setSize(500, 700);
        f.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("아이디");
        lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
        lblNewLabel_1.setBounds(22, 255, 142, 40);
        f.getContentPane().add(lblNewLabel_1);
        
        JLabel label = new JLabel("패스워드");
        label.setFont(new Font("굴림", Font.BOLD, 30));
        label.setBounds(22, 318, 142, 40);
        f.getContentPane().add(label);
        
        JLabel label_1 = new JLabel("이름");
        label_1.setFont(new Font("굴림", Font.BOLD, 30));
        label_1.setBounds(22, 388, 142, 40);
        f.getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("전화번호");
        label_2.setFont(new Font("굴림", Font.BOLD, 30));
        label_2.setBounds(22, 456, 142, 40);
        f.getContentPane().add(label_2);
        
        t1 = new JTextField();
        t1.setFont(new Font("굴림", Font.BOLD, 30));
        t1.setBounds(176, 248, 260, 47);
        f.getContentPane().add(t1);
        t1.setColumns(10);
        
        t2 = new JTextField();
        t2.setFont(new Font("굴림", Font.BOLD, 30));
        t2.setColumns(10);
        t2.setBounds(176, 316, 260, 45);
        f.getContentPane().add(t2);
        
        t3 = new JTextField();
        t3.setFont(new Font("굴림", Font.BOLD, 30));
        t3.setColumns(10);
        t3.setBounds(176, 385, 260, 47);
        f.getContentPane().add(t3);
        
        t4 = new JTextField();
        t4.setFont(new Font("굴림", Font.BOLD, 30));
        t4.setColumns(10);
        t4.setBounds(176, 456, 260, 47);
        f.getContentPane().add(t4);
        
        JButton btnNewButton = new JButton("회원탈퇴 처리");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = t1.getText();
                String pw = t2.getText();
                String name = t3.getText();
                String tel = t4.getText();
                
                DAO dao = new DAO();
        		try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
            }
        });
        btnNewButton.setBackground(Color.MAGENTA);
        btnNewButton.setFont(new Font("굴림", Font.BOLD, 45));
        btnNewButton.setBounds(93, 599, 365, 67);
        f.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("회원가입화면");
        btnNewButton_1.setBackground(SystemColor.info);
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
        btnNewButton_1.setBounds(61, 25, 365, 185);
        f.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("회원가입 처리");
        btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 45));
        btnNewButton_2.setBackground(Color.MAGENTA);
        btnNewButton_2.setBounds(93, 530, 365, 67);
        f.getContentPane().add(btnNewButton_2);
        f.setVisible(true);
    }
}
