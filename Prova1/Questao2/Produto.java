
//Context
public class Produto
{
    private Estado estado;
    private int estoque;
    
    //Construtor
    public Produto(){
        this.estoque = 0;//estado inicial dos produtos: "indisponível"
        this.estado = new Indisponivel(this);
    }

    public void setEstoque(int qtd){
        this.estoque = qtd;
    }
    
    public int getEstoque(){
        return this.estoque;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public Estado getEstado(){
        return this.estado;
    }
    
    public void comprar(int qtd){
        estado.comprar(qtd);
        System.out.println("Estoque = " + this.getEstoque());
        System.out.println("Estado = " + this.estado.getClass().getName());
    }
    
    public void vender(int qtd){
        estado.vender(qtd);
        System.out.println("Estoque = " + this.getEstoque());
        System.out.println("Estado = " + this.estado.getClass().getName());
    }
}
