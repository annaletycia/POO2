
//concrete composite
public class Comando1 extends ComandoComposto
{   
    public Comando1(String nome){
        super(nome);
    }
    
    public void execute(){
        System.out.print("Comando 1: ");
        super.execute();
    }
}
