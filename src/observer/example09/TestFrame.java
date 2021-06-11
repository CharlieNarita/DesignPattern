package observer.example09;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public static void main(String[] args) {
		TestFrame f = new TestFrame();
		f.launch();
	}
	
	public void launch() {
		Button btn = new Button("press me");
		btn.addActionListener(new MyActionListener());
		
		this.add(btn);
		this.pack();
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
	             System.exit(0);
	        }
		});
		
		this.setLocation(500, 500);
		this.setVisible(true);
	}
	


	private class MyActionListener implements ActionListener {	//observer
		public void actionPerformed(ActionEvent e) {
			System.out.println("button pressed!");
		}
	}
}
