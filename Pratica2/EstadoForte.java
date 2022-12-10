//ConcreteState
public class EstadoForte extends Estado
{
    public EstadoForte(Personagem p){
        super(p);
        p.setAtaque(new AtaqueForte());
        p.setCorrida(new CorridaRapida());
        
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getLife() < this.getLimiteInferior()){
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.verificarEstado();
        }else if(this.getPersonagem().getLife() > this.getLimiteSuperior()){
            //não permite que a life de um personagem ultrapasse seu limite inferior
            this.getPersonagem().setLife(100);
        }
    }
    
    public void setLimites(){
        this.setLimiteInferior(70);
        this.setLimiteSuperior(100);
    }
}
