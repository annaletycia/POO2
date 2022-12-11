//ConcreteState
public class EstadoMorto extends Estado
{
    public EstadoMorto(Personagem p){
        super(p);
        
    }
    
    public void verificarEstado(){
        System.out.println("O Personagem morreu.");
        System.exit(0);
    }
    
    public void setLimites(){
        this.setLimiteInferior(0);
        this.setLimiteSuperior(0);
    }
}
