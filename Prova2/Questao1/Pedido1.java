//vinculo entre uma ação e o receiver
//executa a solicitação do invoker chamando ações do receiver
//Comando concreto
public class Pedido1 implements Command
{
    Fornecedor1 f; //receiver
    public Pedido1(Fornecedor1 f){
        this.f = f;
    }
    public void execute(){
        this.f.repor();
    }
}
