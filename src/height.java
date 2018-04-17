import javax.swing.JOptionPane;

public class height {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int height40 = Integer.parseInt(height);
		if (height40> 60) {
		JOptionPane.showMessageDialog(null, "you can ride the roller coaster");
	} else {
		JOptionPane.showMessageDialog(null, "You are too short to ride the roller coaster");
	}
		
		}

		

	}