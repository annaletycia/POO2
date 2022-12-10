import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel {

    private static Bola bola;
    private static Robo j1;
    private static Robo j2;
    private static Robo j3;
    private static Robo j4;
    private static Robo j5;
    private static Robo j6;
    private static Robo j7;
    private static Jogador j8;
    private static Controle c; 
    
    public Bola getBola(){return this.bola;}
    
    public Game() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true); //So that the JPanel object receives the keyboard notifications it is necessary to include the instruction setFocusable(true), which allows KeyboardExample to receive the focus.

        bola = new Bola(512,384);
        j1 = new Robo(10,450);
        j2 = new Robo(400,20);
        j3 = new Robo(50,50);
        j4 = new Robo(100,100);
        j5 = new Robo(350,100);
        j6 = new Robo(20,300);
        j7 = new Robo(400,400);
        j8 = new Jogador(100,400, "FABIANO");
        
        c = new Controle();
        c.setCommand(new MoverEsq(j8),0);
        c.setCommand(new MoverDir(j8),1);
        c.setCommand(new MoverCima(j8),2);
        c.setCommand(new MoverBaixo(j8),3);
        c.setCommand(new Chutar(bola, j8),4);
        
        Macro m = new Macro();
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new MoverEsq(j8));
        m.add(new Chutar(bola, j8));        

        c.setCommand(m,5);
        
        
        bola.addObserver(j1);
        bola.addObserver(j2);
        bola.addObserver(j3);        
        bola.addObserver(j4);        
        bola.addObserver(j5);        
        bola.addObserver(j6);        
        bola.addObserver(j7);        
    
    }       
    
    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT){                
                c.pressionar(0);    
        }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                c.pressionar(1);    
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
                c.pressionar(2);    
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                c.pressionar(3);    
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE)
                c.pressionar(4);    

            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                c.pressionar(5);    

            if (e.getKeyCode() == KeyEvent.VK_R)
                c.replay();    
                
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
}    
    
    public void paint(Graphics g) {
        super.paint(g); //The call to "super.paint(g)", cleans the screen 

        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(bola.getX(), bola.getY(), 20, 20);

        g2d.setColor(Color.GREEN);        
        g2d.fillOval(j1.getX(), j1.getY(), 20, 20);

        g2d.setColor(Color.RED);                
        g2d.fillOval(j2.getX(), j2.getY(), 20, 20);

        g2d.setColor(Color.WHITE);        
        g2d.fillOval(j3.getX(), j3.getY(), 20, 20);

        g2d.setColor(Color.BLUE);        
        g2d.fillOval(j4.getX(), j4.getY(), 20, 20);

        g2d.setColor(Color.DARK_GRAY);                
        g2d.fillOval(j5.getX(), j5.getY(), 20, 20);

        g2d.setColor(Color.CYAN);                
        g2d.fillOval(j6.getX(), j6.getY(), 20, 20);

        g2d.setColor(Color.MAGENTA);                        
        g2d.fillOval(j7.getX(), j7.getY(), 20, 20);

        g2d.setColor(Color.ORANGE);                        
        g2d.fillOval(j8.getX(), j8.getY(), 20, 20);
               
    }

}
