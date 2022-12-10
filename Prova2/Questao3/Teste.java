
//Client
public class Teste
{
    public static void main(){
        
        Programa p1 = new ComandoSimples("estrutura1");
        p1.execute();
        Programa p2 = new ComandoSimples("estrutura2");
        p2.execute();
        
        Comando1 c1 = new Comando1("novo comando");
        Comando2 c2 = new Comando2("novo comando");
        
        c1.add(p1);
        c1.add(p2);
        c1.execute();
        
        Programa p3 = new If(p1,p2);
        System.out.println("Comando condicional: ");
        p3.execute();
    }
}
