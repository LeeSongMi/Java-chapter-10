import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num2 extends JFrame {
	JLabel la = new JLabel();
	public Num2() {
		super("�ǽ�����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.addMouseMotionListener(new MouseAdapter() {
			//�巡�׽� ������ ����� ��
			@Override
			public void mouseDragged(MouseEvent e) {
				Container cc = (Container) e.getSource();
				cc.setBackground(Color.YELLOW);
			}			
		});
		
		c.addMouseListener(new MouseAdapter() {
			//�巡�װ� ������ �ٽ� ������ �ʷϻ��̵ȴ�
			@Override
			public void mouseReleased(MouseEvent e) {
				Container cc = (Container) e.getSource();
				cc.setBackground(Color.GREEN);
			}
		});
			
		c.add(la);
		//�ƹ��͵� ������������ ������ �ʷϻ��̴�.
		c.setBackground(Color.GREEN);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Num2();

	}

}
