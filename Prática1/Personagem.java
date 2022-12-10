//Context
public abstract class Personagem
{
    private Ataque a;
    private Pulo p;
    private Corrida c;
    
    public void setAtaque(Ataque a){
        this.a = a;
    }
    
    public void setPulo(Pulo p){
        this.p = p;
    }
    
    public void setCorrida(Corrida c){
        this.c = c;
    }
    
    public Personagem(){
        
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
