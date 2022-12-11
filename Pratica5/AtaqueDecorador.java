//Decorador
public abstract class AtaqueDecorador extends Ataque
{   
    private Ataque ataqueDecorado;
    
    public AtaqueDecorador(Ataque ataqueDecorado){
        this.ataqueDecorado = ataqueDecorado;
    }
    
    public int getNivelDano(){
        return ataqueDecorado.getNivelDano() + super.getNivelDano();
    }
    
    public String getDescricao(){
        return ataqueDecorado.getDescricao() + super.getDescricao();
    }
}
