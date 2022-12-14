package db_coonect;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("a");
		names.add("b");
		names.add("c");
		System.out.println(names.indexOf("b")); //1
		
		//list.get(1)
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		
		for (int i = 0; i < 5; i++) {
			JButton b = new JButton(i+"");
			f.add(b);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b2 = (JButton)e.getSource();
					System.out.println(b2.getActionCommand());
					
				}
			});
			
		}
		
		
		
		f.setVisible(true);

	}

}
