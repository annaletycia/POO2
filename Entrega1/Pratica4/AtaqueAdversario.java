
//Handler
public abstract class AtaqueAdversario{
    private AtaqueAdversario sucessor;
    private int nivelDano;
    
    public void setSucessor(AtaqueAdversario sucessor){
        this.sucessor = sucessor;
    }
    
    public AtaqueAdversario getSucessor(){
        return this.sucessor;
    }
    
    public abstract void processaDano(Personagem p,int valor);
    
    public void setNivelDano(int nD){
        this.nivelDano = nD;
    }
    
    public int getNivelDano(){
        return this.nivelDano;
    }
}
