import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Num1 extends JFrame {
	public Num1() {
		super("�ǽ�����1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // ����Ʈ�ҿ� ���̱�
		
		label.addMouseListener(new MouseAdapter() {
			//���콺�� �ö���� love java�� ���δ�
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			//���콺�� ���� ���� ���� ������ ����ذ� ��µȴ�
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});

		setSize(300,200);
		setVisible(true);
	}
	static public void main(String [] args) {
		new Num1();
	}
}
