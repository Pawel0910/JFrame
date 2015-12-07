package first;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Window1 extends JFrame {

	public Window1() throws HeadlessException {
		super("Pierwsze okno");
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Window1();
	}

}
