import javax.swing.*;
/*
	Emil Edberg
	Uppgift 2.8
	18/09-18
*/

public class Kapitel2{
	public static void main(String[] args){
		String a, b;
		a = "Erik Andersson 860314-2714";
		int d1 = a.indexOf('1');
		int d2 = a.indexOf('-');
		int m1 = a.indexOf('0');
		b = a.substring(d1,d2) + "/" + a.substring(m1, d1);
		JOptionPane.showMessageDialog(null,b);
	} 
}