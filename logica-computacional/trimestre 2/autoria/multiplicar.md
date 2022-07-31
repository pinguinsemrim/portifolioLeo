package multilicar;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
	 String a1 = JOptionPane.showInputDialog("digite um numero");
	 String a2 = JOptionPane.showInputDialog("digite outro numero");
	 int a1n = Integer.parseInt(a1);
	 int a2n = Integer.parseInt(a2);
	 JOptionPane.showMessageDialog(null, multipler(a1n,a2n));
	 }
  public static int multipler (int a1,int a2) {
	  int r = 0; 
	  for(int i=0;i<a2;i++){
		   r+=a1;
	  }
	  return r;
  }
}
