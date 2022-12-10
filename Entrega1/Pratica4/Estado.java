
//State
public abstract class Estado
{
    private Personagem p;
    private int limiteInferior;
    private int limiteSuperior;
    
    public Estado(Personagem p){
        this.p = p;
        setLimites();
    }
    
    protected abstract void setLimites();
    
    public void setLimiteInferior(int li){
        this.limiteInferior = li; 
    }
    
    public void setLimiteSuperior(int ls){
        this.limiteSuperior = ls;
    }
    
    public int getLimiteSuperior(){
        return this.limiteSuperior;
    }
    
    public int getLimiteInferior(){
        return this.limiteInferior;
    }
    
    public void setPersonagem(Personagem p){
        this.p = p;
    }
    
    public Personagem getPersonagem(){
        return this.p;
    }
    
    public void ganharLife(int vida){
        this.p.setLife(this.p.getLife() + vida);
        this.verificarEstado();
    }
    
    public void sofrerAtaque(int dano){
        this.p.setLife(this.p.getLife() - dano);
        this.verificarEstado();
    }
    
    protected abstract void verificarEstado();
}
