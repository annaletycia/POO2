import java.util.*;
//Composite
public abstract class ComandoComposto implements Programa
{
    private ArrayList<Programa> filhos = new ArrayList<Programa>();
    private String nome;
    public ComandoComposto(String st){
        nome = st;
    }
    
    public void add(Programa p){
        filhos.add(p);
    }
    
    public void execute(){
        System.out.print(nome + " ");
        for(Programa p: filhos){
            p.execute();
        }
    }
}

