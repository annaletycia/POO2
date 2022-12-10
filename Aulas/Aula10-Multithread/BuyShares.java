//Comando concreto
public class BuyShares implements Command
{
    private SharesTrade shares; //receiver
    
    public BuyShares(SharesTrade st){
        shares = st;
    }
    
    public String execute(){
        return shares.buy();
    }
    
    public void run(){
        execute();
    }    
}
