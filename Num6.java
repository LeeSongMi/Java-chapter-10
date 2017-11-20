import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Num6 extends JFrame {
	public Num6() {
		super("실습문제6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//배치관리자 삭제
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		c.add(la);
		//초기에는  JLabel의 위치를 100,100으로 설정
		la.setLocation(100,100);
		la.setSize(20,20);
		la.addMouseListener(new MyMouseListener());
		setSize(300,300);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel b = (JLabel) e.getSource();
			//JLabel의 위치를 랜덤으로 정함
			Random r = new Random();
			int x =  r.nextInt(200);
			int y = r.nextInt(200);
			b.setLocation(x,y);
		}
		
	}
	public static void main(String[] args) {
		new Num6();

	}

}
