// java Program to create a simple JPanel add components to it
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class solution extends JFrame {

	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1, b2;

	// label to display text
	static JLabel l;

	// main class
	public static void main(String[] args)
	{
		// create a new frame to store text field and button
		f = new JFrame("panel");

		// create a label to display text
		l = new JLabel("panel label");

		// create a new buttons
		b = new JButton("button1");
		b1 = new JButton("button2");
		b2 = new JButton("button3");

		// create a panel to add buttons
		JPanel p = new JPanel();

		// add buttons and textfield to panel
		p.add(b);
		p.add(b1);
		p.add(b2);
		System.out.println("\n");
		p.add(l);

		// setbackground of panel
		p.setBackground(Color.red);

		// add panel to frame
		f.add(p);

		// set the size of frame
		f.setSize(3000, 3000);

		f.show();
	}
}
