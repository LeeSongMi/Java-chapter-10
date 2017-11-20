import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Num1 extends JFrame {
	public Num1() {
		super("실습문제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 컨텐트팬에 붙이기
		
		label.addMouseListener(new MouseAdapter() {
			//마우스가 올라오면 love java가 보인다
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			//마우스가 위에 있지 않을 때에는 사랑해가 출력된다
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});

		setSize(300,200);
		setVisible(true);
	}
	static public void main(String [] args) {
		new Num1();
	}
}
