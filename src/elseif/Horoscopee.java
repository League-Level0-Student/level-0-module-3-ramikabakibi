package elseif;

import javax.swing.JOptionPane;

public class Horoscopee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer = JOptionPane.showInputDialog("What is your star sign?");
if(answer.equals("Aries")) {
	JOptionPane.showMessageDialog(null, "You are Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
}
else if(answer.equals("Taurus")) {
	JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
}
else if(answer.equals("Gemini")) {
	JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
}
	}

}
