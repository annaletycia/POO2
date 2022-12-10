//vinculo entre uma ação e o receiver
//executa a solicitação do invoker chamando ações do receiver
//Comando concreto
public class Pedido2 implements Command
{
    Fornecedor2 f; //receiver
    public Pedido2(Fornecedor2 f){
        this.f = f;
    }
    public void execute(){
        this.f.repor();
    }
}
