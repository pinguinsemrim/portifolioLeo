import java.util.Scanner;
public class automat
{
	public static void main(String[] args) {
	    Scanner mugue = new Scanner(System.in);
		System.out.println("digite seu capital inicial: ");
		double c = mugue.nextDouble();
		System.out.println("digite seu juros: ");
		double i = mugue.nextDouble();
		System.out.println("digite seu tempo: ");
		double t = mugue.nextDouble();
	    double ie = i/100;
	    double m = c*Math.pow(1+ie,t);
	    double j = m-c;
	    System.out.println("aqui seu montante: "+m+" e seu juros: "+j);
	    
	    
	}
}
