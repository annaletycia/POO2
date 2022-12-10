//criação do comando concreto e definição do receiver
//aplicação cliente
public class Client
{   
    public static void main(){
        
        Fornecedor1 f = new Fornecedor1();
        Pedido1 p = new Pedido1(f);
        
        Departamento d = new Departamento();
        d.setCommand(p,0);
        System.out.println("Pedido de reposição do Estoque1!");
        d.pedirReposicao(0);
        
        Fornecedor2 f2 = new Fornecedor2();
        Pedido2 p2 = new Pedido2(f2);
        
        d.setCommand(p2,1);
        System.out.println("Pedido de reposição do Estoque2!");
        d.pedirReposicao(1);
    }
}
