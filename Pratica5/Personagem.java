import java.util.Observable;
//Context
public abstract class Personagem extends Observable
{
    private Ataque a;
    private Pulo p;
    private Corrida c;
    private Estado e;
    private int life;
    private int x = 0;
    private int y = 0;
    
    public Personagem(int x, int y){
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
    
    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;        
        System.out.println("Posicao do Personagem: ("+this.x+","+this.y+")");
    }
    
    public void show(){
        setChanged();
        notifyObservers();
    }
    
    public void setAtaque(Ataque a){
        this.a = a;
    }
    
    public void setPulo(Pulo p){
        this.p = p;
    }
    
    public void setCorrida(Corrida c){
        this.c = c;
    }
    
    public void setLife(int l){
        this.life = l;
    }
    
    public void setEstado(Estado e){
        this.e = e;
    }
    
    public Ataque getAtaque(){
        return a;
    }
    
    public Pulo getPulo(){
        return p;
    }
    
    public Corrida getCorrida(){
        return c;
    }
    
    public int getLife(){
        return life;
    }
    
    public Estado getEstado(){
        return e;
    }
    
    public Personagem(){
        //inicialmente o personagem está em estado normal e com 70% de life
        setEstado(new EstadoNormal(this));
        setLife(70);
    }
    
    public void sofrerAtaque(int dano){
        //retorna o estado do personagem após sofrer um ataque
        e.sofrerAtaque(dano);
        System.out.println("Dano: " + dano);
        System.out.println("Life total: " + this.getLife());
        System.out.println("Estado: " + this.e.getClass().getName());
    }
    
    public void ganharLife(int vida){
        e.ganharLife(vida);
        System.out.println("Vida ganha: " + vida);
        System.out.println("Life total: " + this.getLife());
        System.out.println("Estado: " + this.e.getClass().getName());
    }
    
    public void atacar(){
        //delegação de responsabilidade
        a.atacar();
    }
    
    public void pular(){
        //delegação de responsabilidade
        p.pular();
    }
    
    public void correr(){
        //delegação de responsabilidade
        c.correr();
    }
}
