import java.util.Observer;
import java.util.Observable;

//Observer
public class Inimigo implements Observer {
    private int x;
    private int y;
    private int life = 100;
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getLife(){
        return life;
    }
    
    public void setLife(int l){
        this.life = l;
    }
    
    public void sofrerAtaque(int dano){
        this.setLife(this.getLife() - dano);
        if(this.getLife() == 0){
            System.out.println("Inimigo neutralizado.");
        }
    }
    
    public Inimigo(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void update(Observable subject, Object arg) {

        Personagem p = (Personagem)subject; 

        if (((this.x - p.getX()) ==0) && ((this.y - p.getY()) ==0) ){
            p.sofrerAtaque(5);
            this.sofrerAtaque(10);
            if (Math.random() < 0.5){
                p.setPos(p.getX()+(int)(100*Math.random()), p.getY()-(int)(100*Math.random()));
            }
            else {
                p.setPos(p.getX()-(int)(100*Math.random()), p.getY()+(int)(100*Math.random()));
            }
                  }
        else {
           if (p.getX() > this.x) this.x = this.x+(int)(5*Math.random());
           else this.x = this.x-(int)(5*Math.random());
           //se precisa andar para tras
           if (p.getY() > this.y) this.y = this.y+(int)(5*Math.random());
           else this.y = this.y-(int)(5*Math.random());
     
        }
        
        if (p.getX() < 0) p.setX(100);
        if (p.getY() < 0) p.setY(100);

    }
}
