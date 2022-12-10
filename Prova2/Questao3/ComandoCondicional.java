//Composite
public abstract class ComandoCondicional implements Programa
{
    private Programa noIf;
    private Programa noElse;
    
    public ComandoCondicional(Programa noIf, Programa noElse){
        this.noIf = noIf;
        this.noElse = noElse;
    }
    
    public Programa getNoIf(){
        return this.noIf;
    }
    
    public Programa getNoElse(){
        return this.noElse;
    }
    
    public void execute(){
        if(Math.random() < 0.5){
            noIf.execute();
        }else{
            noElse.execute();
        }
    }
    
    
}
