import javax.swing.*;
/*
	Emil Edberg
	Uppgift 2.3
	18/09-18
*/

public class Kapitel2{
	public static void main(String[] args){
		String Firstname = JOptionPane.showInputDialog(null,"Ditt f" + '\u00F6' + "rnamn?" );
		String Lastname = JOptionPane.showInputDialog(null, "Ditt efternamn?");
		String Fullname = Firstname + " " + Lastname;
		JOptionPane.showMessageDialog(null, "Du heter " + Fullname);
	}
}