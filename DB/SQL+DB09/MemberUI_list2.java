package 화면DB연결;



import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 자바DB연결.MemberDAO6;

//RAM에 만드는 저장공간을 만든다.
public class MemberUI_list2 {
	public static void main(String[]args) {
		//프로그램 시작하자 마자 db에서 데이터를 가지고 와서
		//화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setSize(500,700);
		MemberDAO6 dao =  new MemberDAO6();
		ArrayList<MemberVO> list= dao.list();
		String[] header = {"아이디","패스워드","이름","전화번호"};
		Object[][] all = new String[list.size()][4];
		
		
		if(list.size()==0) {
			System.out.println("검색결과없음");
			
		}else {
			System.out.println("검색결과는 전체 "+list.size()+"개 입니다.");
			for (int i = 0; i < all.length; i++) { // 13개의 가방, 13개의 
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getTel();
				
				}//for
		}//else
		JTable table = new JTable(all,header);
		JScrollPane scroll = new JScrollPane(table);
		f.setLayout(new FlowLayout());
		f.add(scroll);
		
		
		
		
		
		f.setVisible(true);
	}//main
	
}
