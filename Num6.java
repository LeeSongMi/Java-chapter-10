import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Num6 extends JFrame {
	public Num6() {
		super("�ǽ�����6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//��ġ������ ����
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		c.add(la);
		//�ʱ⿡��  JLabel�� ��ġ�� 100,100���� ����
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
			//JLabel�� ��ġ�� �������� ����
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
