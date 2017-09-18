import javax.swing.*;
/*
	Emil Edberg
	Uppgift 2.8
	18/09-18
*/

public class Kapitel2{
	public static void main(String[] args){
		String a = "Programspråk";
		String b = a.charAt(1) + a.substring(5, 8) + a.charAt(5);
		JOptionPane.showMessageDialog(null,b);
	}
}