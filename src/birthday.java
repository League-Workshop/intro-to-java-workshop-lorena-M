import javax.swing.JOptionPane;

public class birthday {
public static void main(String[]args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int age2 = Integer.parseInt(age);
	if(age2> 17) {
		JOptionPane.showMessageDialog(null, "Welcom to rated R movies...");
	}
	}
	
	
}
