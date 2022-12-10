//Leaf
public class ComandoSimples implements Programa
{
    private String nome;
    
    public ComandoSimples(String nome){
        this.nome = nome;
    }
    
    public void execute(){
        System.out.println(nome+"");
    }
}
