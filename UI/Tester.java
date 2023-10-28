package UI;
import java.awt.*;

class MovingStrings extends Frame implements Runnable{
    Thread t1,t2;
    int x1,x2;
    public MovingStrings(){
        x1=200;
        x2=200;
        t1=new Thread(this,"dai");
        t2=new Thread(this,"dac");
        t1.start();
        t2.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", 50, 50));
        g.drawString("PG_DAI", x1, 200);
        g.setColor(Color.MAGENTA);
        g.drawString("PG_DAC", x2, 400);
    }
    public void run(){
        while(true)
        {
            if(Thread.currentThread()==t1)
            {
                x1++;
                if(x1==this.getWidth()+25)
                    x1=-25;
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(Thread.currentThread()==t2)
            {
                x2--;
                if(x2==-25)
                    x2=(this.getWidth()+25);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            repaint();
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        MovingStrings fr = new MovingStrings();
        fr.setSize(600, 600);
        fr.setVisible(true);
        fr.setBackground(Color.black);
    }
}