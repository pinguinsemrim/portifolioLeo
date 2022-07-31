package fatorar;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
	  String a = JOptionPane.showInputDialog("ola, digite um numero");
	  int res = fatora(a);

	  JOptionPane.showMessageDialog(null, res);
  }

   public static int fatora(String a) {
	   int an = Integer.parseInt(a);
		  int res = 0;
		  while(an > 1) {
			 if(an%2 == 0) {
				 res+=2;
				 an/=2;
			 }else if(an%3==0) {
				 res+=3;
				 an/=3;
			 }else if(an%5==0) {
				 res+=5;
				 an/=5;
			 }else if(an%7==0) {
				 res+=7;
				 an/=7;
			 }else if(an%11==0) {
				 res+=11;
				 an/=11;
			 }else {
			JOptionPane.showMessageDialog(null, "esse numero provavelmente é primo");	 
			 }
		 }
	return res;	  
   }

} 