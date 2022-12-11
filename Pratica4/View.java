import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel
{
    private Personagem p;
    private Inimigo i1;
    private Inimigo i2;
    private Inimigo i3;
    
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.GREEN);
        g2d.fillOval(p.getX(), p.getY(), 20, 20);

        g2d.setColor(Color.RED);                
        g2d.fillOval(i1.getX(), i1.getY(), 20, 20);

        g2d.setColor(Color.BLUE);        
        g2d.fillOval(i2.getX(), i2.getY(), 20, 20);

        g2d.setColor(Color.MAGENTA);                        
        g2d.fillOval(i3.getX(), i3.getY(), 20, 20);
        
    }

    public void jogar(View game) throws InterruptedException {
        
        JFrame frame = new JFrame("Battle");
        frame.add(game);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        p = new Personagem1(250,250);
        i1 = new Inimigo(400,20);
        i2 = new Inimigo(50,50);
        i3 = new Inimigo(15,450);
        
        p.addObserver(i1);
        p.addObserver(i2);
        p.addObserver(i3);
        
        while (true) {
            p.show();           
            game.repaint();
            Thread.sleep(50);
        }
    }
    
}
