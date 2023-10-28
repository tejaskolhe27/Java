package UI;

import java.awt.*;

class MovingCircle extends Frame implements Runnable{

    private int x1,x2,x3;
    private Thread t1,t2,t3;

    public MovingCircle(){
        x1 = x2= x3 =100;
        t1 = new Thread(this,"red");
        t2 = new Thread(this,"blue");
        t3 = new Thread(this,"green");
        t1.start();
        t2.start();
        t3.start();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.orange);
        g.fillOval(x1,100,100,100);
        g.setColor(Color.WHITE);
        g.fillOval(x2,300,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(x3,500,100,100);

    }

    public void run()
    {
        while (true) 
        {
            if (Thread.currentThread()==t1)
            {
                x1++;
                if (x1==getWidth()-100)
                {
                    synchronized(this)
                    {
                        try {
                            wait();
                        } catch (Exception e) { }

                    }
                }

                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
            }        
                    
            
            else if (Thread.currentThread()==t2)
            {
                x2++;
                if (x2==getWidth()-100)
                {
                    synchronized(this)
                    {
                        try {
                            wait();
                        } catch (Exception e) {                            
                            
                        }

                    }
                }
                

                try {
                    Thread.sleep(15);
                } catch (Exception e) { }
                    
            }
            

            else if (Thread.currentThread()==t3)
            {
                x3++;
                if (x3==getWidth()-100)
                {
                    synchronized(this)
                    {
                        try {
                            notifyAll();
                            x1=x2=x3 =0;
                        } catch (Exception e) {  
                            e.printStackTrace();                         
                            
                        }

                    }
                }

                try{
                    Thread.sleep(20);
                } catch (Exception e) { }

            }

        repaint();

                  
        }

    }
}


public class balls {
    public static void main(String[] args) {

        MovingCircle fr = new MovingCircle();
        fr.setSize(700, 700);
        fr.setVisible(true);
        
    }
    
}
