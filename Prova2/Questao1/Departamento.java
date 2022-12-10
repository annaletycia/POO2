//contém um comando(pedido) e pede sua execução pelo execute()
//invoker
public class Departamento
{
    private Command slot[]= new Command[3];
    
    public void setCommand(Command command, int n){
        slot[n] = command;
    }
    public void pedirReposicao(int n){
        slot[n].execute();
    }
}
