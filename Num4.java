import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num4 extends JFrame {
	public Num4() {
		super("�ǽ�����4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//���� ����Ű�� ������ ����
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					String t = new String(la.getText());
					//���� ���� ���ڸ� ���� �ڷ� ������
					t = t.substring(1)+t.substring(0,1);
					//����� �ؽ�Ʈ ������ set�Ѵ�.
					la.setText(t);
				}
			}
		});
		c.add(label);
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true); // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		label.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ����
	}
	public static void main(String[] args) {
		new Num4();

	}

}
