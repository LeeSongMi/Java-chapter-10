import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num2 extends JFrame {
	JLabel la = new JLabel();
	public Num2() {
		super("실습문제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.addMouseMotionListener(new MouseAdapter() {
			//드래그시 배경색이 노랑이 됨
			@Override
			public void mouseDragged(MouseEvent e) {
				Container cc = (Container) e.getSource();
				cc.setBackground(Color.YELLOW);
			}			
		});
		
		c.addMouseListener(new MouseAdapter() {
			//드래그가 끝나면 다시 배경색이 초록색이된다
			@Override
			public void mouseReleased(MouseEvent e) {
				Container cc = (Container) e.getSource();
				cc.setBackground(Color.GREEN);
			}
		});
			
		c.add(la);
		//아무것도 하지않을때의 배경색은 초록색이다.
		c.setBackground(Color.GREEN);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num2();

	}

}
