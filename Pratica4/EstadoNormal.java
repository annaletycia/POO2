//ConcreteState
public class EstadoNormal extends Estado
{
    public EstadoNormal(Personagem p){
        super(p);
        p.setAtaque(new AtaqueMedio());
        p.setCorrida(new CorridaMedia());
        
    }
    
    public void verificarEstado(){
        if(this.getPersonagem().getLife() < this.getLimiteInferior()){
            this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
            if(this.getPersonagem().getLife() == 0){
                this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));}
        }else if(this.getPersonagem().getLife() > this.getLimiteSuperior()){
            this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
        }
    }
    
    public void setLimites(){
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }
}
