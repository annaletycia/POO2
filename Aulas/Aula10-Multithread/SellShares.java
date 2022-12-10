//Comando concreto
public class SellShares implements Command
{
    private SharesTrade shares; //receiver
    
    public SellShares (SharesTrade st){
        shares = st;
    }
    
    public String execute(){
        return shares.sell();
    }
    
    public void run(){
         execute();   
    }    
}
