
//Concrete State
public class EstoqueCritico extends Estado
{
    public EstoqueCritico(Produto produto){
        super(produto);
    }
    
    public void setLimites(){
        this.setLimiteInferior(1);
        this.setLimiteSuperior(10);
    }
    
    public void vender(int qtd){
        this.getProduto().setEstoque(this.getProduto().getEstoque() - qtd);
        System.out.println("Atenção! Reposição de estoque necessária!");
        this.verificarEstado();
    }
    
    public void verificarEstado(){
        if(this.getProduto().getEstoque() < this.getLimiteInferior())
            this.getProduto().setEstado(new Indisponivel(this.getProduto()));
        else if(this.getProduto().getEstoque() > this.getLimiteSuperior())
            this.getProduto().setEstado(new Disponivel(this.getProduto()));
    }
}
