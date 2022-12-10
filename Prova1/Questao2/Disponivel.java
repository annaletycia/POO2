
//Concrete State
public class Disponivel extends Estado
{
    public Disponivel(Produto produto){
        super(produto);
    }
    
    public void setLimites(){
        this.setLimiteInferior(11);
        this.setLimiteSuperior(1000);
    }
    
    public void verificarEstado(){
        if(this.getProduto().getEstoque() == 0)
            this.getProduto().setEstado(new Indisponivel(this.getProduto()));
        else if(this.getProduto().getEstoque() < this.getLimiteInferior())
            this.getProduto().setEstado(new EstoqueCritico(this.getProduto()));
    }
}
