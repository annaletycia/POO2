//Strategy & Component
public abstract class Ataque
{   
    public void atacar(){
        System.out.println("Implementa ataque.");
    }
    
    private int nivelDano;
    private String descricao;
    
    public int getNivelDano(){
        return this.nivelDano;
    }
    
    public void setNivelDano(int nivelDano){
        this.nivelDano = nivelDano;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
