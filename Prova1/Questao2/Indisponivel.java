
//Concrete State
public class Indisponivel extends Estado
{
    public Indisponivel(Produto produto){
        super(produto);
    }
    
    public void setLimites(){
        this.setLimiteInferior(0);
        this.setLimiteSuperior(0);
    }
    
    public void vender(int qtd){
        System.out.println("Não existe estoque disponível para venda!");
    }
    
    public void verificarEstado(){
        if(this.getProduto().getEstoque() > this.getLimiteSuperior()){
            this.getProduto().setEstado(new EstoqueCritico(this.getProduto()));
            this.getProduto().getEstado().verificarEstado();
        }
    }
}
