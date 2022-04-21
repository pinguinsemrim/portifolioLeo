public class Main 
{
	public static void main(String[] args) {
	    int a1=5,n=2,r=10,an = a1 +(n-1)*r;
	    a1 = an - (n-1)*r;
	    r = (an -a1)/(n-1);
	    n = ((-an+a1-1*r)/r)*-1;
	   System.out.println("an é: "+an+" avetruz fumante(a1): "+a1 +" elefante cagão(n): "+n+" amendoin frito(r): "+r);
	   for (int i =0;i < 10;i--){
	   tick();}
	}
	public static void tick(){
	   for (long i =0;i < 10;i-=1000000000){
	       i=i;
	  System.out.println(i*-1);}
	    return;
	}}
