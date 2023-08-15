package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(300,320);
		f.getContentPane().setBackground(Color.green);
		//배치해주는 부품-FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //추가한 순서대로 f에 붙는다.
		Font font = new Font("d2cording",1,20);
		Font font2 = new Font("d2cording",1,40);
		JLabel result = new JLabel("결과 보이는곳");
		result.setForeground(Color.red);
		result.setFont(font2);
		//예약 여부를 저장하는 배열을 만들어 줍시다 !! 
		int[] seat = new int[10]; //{0,0,0,0,0,0,0,0,0,0,0,0,0...}
		//각 자리에 저장된 값이 0이면 아직 예약 안되었음. 예약되면 1로 바꿈 ! 
		//버튼 배열 많이 만들어서 집어 넣을 배열 생성
		//반복해서 f에 붙여주세요
		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(i+""); // 버튼은 String만 !!!!! 공백넣어서 강제 스트링만들어주자
			btn[i].setFont(font);
			f.add(btn[i]);
			f.add(result);
			//버튼에 액션기능 add 해보자
			//1)액션 기능 추가
			//2) 클릭했을 때 어떤 부품이 담당할지 부품 생성
			//3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//e.getActionCommand();  클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand(); // 0
					System.out.println(text);
					int no = Integer.parseInt(text); // 인덱스 값은 숫자여야 하니 integer로 형변환 시켜준거임
					//이미 해당 좌석 번호가 1로 저장되어 있는지 확인 하고, 1이 아니면 예약 가능!!
					if (seat[no]==1) { //이미 예약되어 1이 들어잇음. 예약불가
						result.setText( "예약불가");
						result.setForeground(Color.blue);
						
					}else { // 아직 예약이 안되어서 0이 들어있음
						seat[no] = 1; // 예약좌석은 1로 변경 !! 
						result.setText(text + "번 예약 완료");
						
					}
					
				}
			});
		}
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 내용넣기
				// 배열안에 저장된 수 몇개가 1인지 더해줌.
				// 영화 예매비 1장당 1만원, 결제금액 프린트 (joptionpane)
				int count = 0;
				int count2 = 0;
				for (int x : seat) {
					if (x ==1) {
						count++;
					}else {
						count2++;
					}
				}
				JOptionPane.showMessageDialog(f, "남은좌석" +count2+ "금액"+ count*10000+ "원 결제 하시면 됩니다.");
				
			}
		});
		
		
		f.add(total);
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
