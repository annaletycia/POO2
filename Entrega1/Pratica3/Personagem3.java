//ConcreteContext
public class Personagem3 extends Personagem
{
    private int x = 0;
    private int y = 0;
    
    public Personagem3(int x, int y){
        this.x = x;
        this.y = y;
    } 
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    
    public Personagem3(){
        //inicialmente o personagem está em estado normal e com 70% de life
        setEstado(new EstadoNormal(this));
        setLife(70);
        setPulo(new PuloBaixo());
    }
}
