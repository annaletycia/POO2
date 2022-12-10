
//concrete composite
public class Comando2 extends ComandoComposto
{   
    public Comando2(String nome){
        super(nome);
    }
    
    public void execute(){
        System.out.print("Comando 2: ");
        super.execute();
    }
}
