import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num5 extends JFrame {
	public Num5() {
		super("실습문제5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial 폰트로 10 픽셀 크기
		c.add(label);
		
		
		label.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				//+입력시 폰트 크기 키움
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				//-입력시 폰트 크기 줄임
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					//폰트 크기가 5이하면 줄이지않음
					if(size <= 5)
						la.setFont(new Font("Arial", Font.PLAIN, size));
					else
						la.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(300,150);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
	}
	public static void main(String[] args) {
		new Num5();

	}

}
