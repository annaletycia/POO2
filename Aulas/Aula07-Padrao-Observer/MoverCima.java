
/**
 * Write a description of class MoverEsq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoverCima implements Command
{
    private Jogador j;
    public MoverCima(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverCima();           
    }    
    
}
