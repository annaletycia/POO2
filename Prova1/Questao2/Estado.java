
//State
public abstract class Estado
{
    private Produto produto;
    private int limiteInferior;
    private int limiteSuperior;
    
    public Estado(Produto produto){
        this.produto = produto;
        setLimites();
    }
    
    protected abstract void setLimites();
    
    public void comprar(int qtd){
        this.produto.setEstoque(this.produto.getEstoque() + qtd);
        this.verificarEstado();
    }
    
    public void vender(int qtd){
        int quantidade = this.produto.getEstoque() - qtd;
        if(quantidade>=0)
            this.produto.setEstoque(this.produto.getEstoque() - qtd);
        else{
            this.produto.setEstoque(0);
        }
        this.verificarEstado();
    }
    
    protected abstract void verificarEstado();
    
    //getters e setters
    public void setLimiteInferior(int li){
        this.limiteInferior = li; 
    }
    
    public int getLimiteInferior(){
        return this.limiteInferior;
    }
    
    public void setLimiteSuperior(int ls){
        this.limiteSuperior = ls;
    }
    
    public int getLimiteSuperior(){
        return this.limiteSuperior;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
}
