package mugueso;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mugueso implements KeyListener {   
    public static int px = 0,py = 0;
    public static int spx = px*3,spy = py*3;
    public static int npx = 0,npy = 0;
    public static void main(String[] args) {
     
     String nome = JOptionPane.showInputDialog("fala ai teu nome");
     String idade = JOptionPane.showInputDialog("fala ai tua idade");
     
     if(Integer.parseInt(idade) > 110){
     JOptionPane.showMessageDialog(null, "carvalho "+nome+" e voce tem "+idade+ " tu é um vapiro então");
     JOptionPane.showMessageDialog(null, "espera ai to chegado com umas trinta estaca de madeira");
    }
     else{
         JOptionPane.showMessageDialog(null, "du bist gut "+nome+" e voce tem "+idade);
     }
     jane(nome);
}
 
    
 public static void jane(String a){
     JFrame mugue = new JFrame("ola " + a);
                mugue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mugue.setSize(400, 400);
                mugue.setVisible(true);
                mugue.createBufferStrategy(3);
                while(true){
                BufferStrategy bs = mugue.getBufferStrategy();
                render(bs.getDrawGraphics(),a);
                bs.show();
                tick();}}
 public static  void tick(){
    int pxx = npx+=spx;
    int pyy = npx+=spx;
 }
 public static void render(Graphics g, String a){
     g.setColor(Color.green);
     g.fillRect(0, 0, 400, 400);
     g.setColor(Color.red);
     g.fillRect(npx+=spx, npx+=spx, 40, 40);
     
 }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //To change body of generated methods, choose Tools | Templates.
           if(ke.getKeyCode() == KeyEvent.VK_W){
              px = -1; 
              spx = px*3;
           }
           if(ke.getKeyCode() == KeyEvent.VK_S){
               px = 1;
               spx = px*3;
           }
           if(ke.getKeyCode() == KeyEvent.VK_D){
               py = -1;
               spy = py*3;
           }
           if(ke.getKeyCode() == KeyEvent.VK_A){
               py = 1;
               spy = py*3;
           }
    
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       if(ke.getKeyCode() == KeyEvent.VK_W){
               px = 0;
           }
           if(ke.getKeyCode() == KeyEvent.VK_S){
               px =0;
           }
           if(ke.getKeyCode() == KeyEvent.VK_D){
               py = 0;
           }
           if(ke.getKeyCode() == KeyEvent.VK_A){
               py = 0;
           } //To change body of generated methods, choose Tools | Templates.
    }
}
