package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String[] header = {"컴퓨터", "영어" , "수학" ,"체육"};
		
		String[][] contents= {
				{"10","88","99","88"}, 
				{"20","28","99","88"}, 
				{"30","38","99","88"}, 
				{"20","48","99","88"}, 
				{"10","58","99","88"}, 
				{"80","68","99","88"}, 
				{"70","78","99","88"}, 
				{"70","88","99","88"}, 
				{"60","98","99","88"}, 
				{"60","08","99","88"}, 
				{"50","18","99","88"}, 
				{"40","28","99","88"}, 
				{"20","38","99","88"}, 
				{"30","48","99","88"}, 
				{"30","58","99","88"}, 
				{"50","68","99","88"}, 
				{"60","78","99","88"}, 
				{"50","88","99","88"}, 
				{"40","98","99","88"}, 
				{"30","08","99","88"}, 
				{"30","18","99","88"}, 
				{"20","28","99","88"}, 
				{"98","38","99","88"} 
				
		};
		
		JTable table = new JTable(contents,header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
		
		
		
		

	}

}
