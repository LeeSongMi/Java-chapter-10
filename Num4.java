import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Num4 extends JFrame {
	public Num4() {
		super("실습문제4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//왼쪽 방향키를 누를시 실행
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					String t = new String(la.getText());
					//제일 앞의 글자를 제일 뒤로 보내줌
					t = t.substring(1)+t.substring(0,1);
					//변경된 텍스트 내용을 set한다.
					la.setText(t);
				}
			}
		});
		c.add(label);
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true); // 레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); // 레이블에 키 입력 포커스 서정
	}
	public static void main(String[] args) {
		new Num4();

	}

}
