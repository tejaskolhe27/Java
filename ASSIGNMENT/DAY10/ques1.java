package ASSIGNMENT.DAY10;

import java.awt.*;

class MovingCircle extends Frame implements Runnable{
    Thread t1;
    int x1,xdirection;

    public MovingCircle(){
        x1=200;
        xdirection = 1;
        t1=new Thread(this,"oval");
        t1.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillOval(x1,300,100,100);
        
    }
    public void run(){
        while(true)
        {  
        if (Thread.currentThread() == t1) {
            x1 += xdirection;
            if (x1+100 >= this.getWidth()) { 
                xdirection = -1;
            } else if (x1 <= 0) {
                xdirection = 1;
            }
            repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
    }
}


public class ques1 {
    public static void main(String[] args) {
        MovingCircle fr = new MovingCircle();
        fr.setSize(600,600);
        fr.setVisible(true);
        fr.setBackground(Color.BLACK);
    }
}
