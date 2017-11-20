import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num5 extends JFrame {
	public Num5() {
		super("�ǽ�����5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial ��Ʈ�� 10 �ȼ� ũ��
		c.add(label);
		
		
		label.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				//+�Է½� ��Ʈ ũ�� Ű��
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				//-�Է½� ��Ʈ ũ�� ����
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					//��Ʈ ũ�Ⱑ 5���ϸ� ����������
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
