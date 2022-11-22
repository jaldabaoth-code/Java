package ZZZZZeclipse_java;

import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;


public class Start {

	public static void main(String [] args) throws IOException {
		System.out.println(ProcessHandle.current().pid());

		JFrame jf = new JFrame("Gotcha!");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.add(new JLabel(new ImageIcon(new URL("https://images.unsplash.com/photo-1632104009230-4c927433490f?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=80"))));
		jf.pack();
		jf.setVisible(true);
	}

}
