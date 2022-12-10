import javax.swing.*; 

public class Principal{
    public static void main(String[] args) throws InterruptedException {
        int x = 1024;
        int y = 768;  
        
        JFrame frame = new JFrame("RoboCup");
        Game game = new Game();
        
        ImageIcon background = new ImageIcon("campo.jpg");

        JLabel label = new JLabel();
        
        label.setBounds(0, 0, x, y);
        label.setIcon(background);

        game.setLayout(null);
        game.add(label);
        
        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        Bola bola = game.getBola();
        
        while (true) {
            bola.show();           
            game.repaint();
            Thread.sleep(50);
        }
    }
}