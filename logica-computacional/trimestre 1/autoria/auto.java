import java.util.Scanner;
import javax.swing.JOptionPane;
public class auto
{
    public static void main(String[] args) {
     
        String nome = JOptionPane.showInputDialog("digite o seu nome");
        String idade = JOptionPane.showInputDialog("para onde deseja ir (s,n,l,o)");
        
        if(idade == "s"){
            JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
        }else if(idade == "n"){
            JOptionPane.showMessageDialog(null, "voce entrou na caverna");
            String i = JOptionPane.showInputDialog("voce vai proseguir (s/n)");
            if(i == "n"){
                JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
            }else if(i == "s"){
                JOptionPane.showMessageDialog(null, "voce envontrou um ogro gigante");
                String a = JOptionPane.showInputDialog("voce vai lutar (s/n)");
                if(a == "n"){
                    JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                }else if(a == "s"){
                    JOptionPane.showMessageDialog(null, "voce morreu fim");
                } else {
                    JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                }
            }else {
                JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
            }
        }else if(idade == "l"){
                JOptionPane.showMessageDialog(null,"voce foi para o deserto e o calor é insurportavel");
                String i = JOptionPane.showInputDialog("voce vai proseguir (s/n)");
                if(i == "s"){
                    JOptionPane.showMessageDialog(null,"voce morreu de calor");
                }else if(i == "n"){
                    JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                }else{
                    JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                }
        }else if(idade == "o"){
            JOptionPane.showMessageDialog(null,"voce encontrou uma loja");
            String i = JOptionPane.showInputDialog("voce vai entrar (s/n)");
            if(i == "s"){
                JOptionPane.showMessageDialog(null,"voce achou uma espada");
                String ia = JOptionPane.showInputDialog("voce vai rouba-la (s/n)");
                if(ia == "s"){
                    JOptionPane.showMessageDialog(null,"voce volta e encontra uma caverna");
                    String e = JOptionPane.showInputDialog("voce vai entrar (s/n)");
                    if(e == "s"){
                        JOptionPane.showMessageDialog(null, "voce envontrou um ogro gigante");
                        String a = JOptionPane.showInputDialog("voce vai lutar (s/n)");
                        if(a == "n"){
                            JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                        }else if(a == "s"){
                            JOptionPane.showMessageDialog(null, "voce achou um bau de ouro");
                            JOptionPane.showMessageDialog(null, "voce ficou louvo com o ouro");
                        }} else {
                            JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
                        }
                }else{
                    JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
               
                }
            }else{
                JOptionPane.showMessageDialog(null,"voce voltou para casa fim");
            }
        }
        
       
   }
}
