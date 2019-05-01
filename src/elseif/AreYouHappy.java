package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer = JOptionPane.showInputDialog("Are you happy?");

if(answer.equals("yes")) {
JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");	
}
else if(answer.equals("no")) {
	String hi = JOptionPane.showInputDialog("Do you want to be happy?");
	if(hi.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	else if(hi.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
}
	}

}
