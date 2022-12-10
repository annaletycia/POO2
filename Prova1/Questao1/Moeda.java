
//Handler
public abstract class Moeda
{
    private Moeda sucessor;
    
    public void setSucessor(Moeda sucessor){
        this.sucessor = sucessor;
    }
    
    public Moeda getSucessor(){
        return this.sucessor;
    }
    
    public abstract void processaMoeda(double diametro);
}
