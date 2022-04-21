import java.util.Scanner;
public class Main{
  public static void main (String[]args){
    Scanner aveztruz = new Scanner (System.in);//Scanner
    //digitando o numero
      System.out.println ("anote um numero");
      int a = aveztruz.nextInt();
      System.out.println("aveztruz");
      //listando os numeros
      int i =0;
      while(i < a){
          i++;
          //filtrando
          boolean be= Resto(i);
          if(div(i)){System.out.println(i);}}
      //fala final
      System.out.println ("o seu numero é " + a);
      boolean b = Resto(a);
      System.out.println("parabens "+ a + " é "+ mostrar(b));
      boolean c = Resto(a);}

//filtro par
public static boolean Resto(int a){
    if(a % 2 == 0){return true;}else{return false;}}
//lista par
public static String mostrar(boolean b){
    String res ="";
    if(b){res = "par"; }else{res = "impar";}
    return res;}    
//filtro primo
public static boolean div(int i){
    int d =0;
    int j =i;
    while(j>0){if(i%j == 0){d++;}j--;}
    if(d ==2){return true;}else{return false;}}}    
    
    
    
    


