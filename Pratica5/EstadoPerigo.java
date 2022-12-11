//ConcreteState
public class EstadoPerigo extends Estado
{
    public EstadoPerigo(Personagem p){
        super(p);
        p.setAtaque(new AtaqueFraco());
        p.setCorrida(new CorridaDevagar());
        
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getLife() == this.getLimiteInferior()){
            this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
        }else if(this.getPersonagem().getLife() > this.getLimiteSuperior()){
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.verificarEstado();
        }
    }
    
    public void setLimites(){
        this.setLimiteInferior(0);
        this.setLimiteSuperior(30);
    }
}
