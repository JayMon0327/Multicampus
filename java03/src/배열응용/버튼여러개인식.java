package 배열응용;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼여러개인식 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		JButton[] b = new JButton[5];
		for (int i = 1; i < 5; i++) {
			b[i] = new JButton();
			ImageIcon icon = new ImageIcon(i+".gif");
			b[i].setIcon(icon);
			f.add(b[i]);
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					Icon icon =  b.getIcon();
					System.out.println(icon.toString());
				}
			});
			
		}
		
		
		f.setVisible(true);
	}

}
