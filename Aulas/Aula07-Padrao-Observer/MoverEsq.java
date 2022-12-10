
/**
 * Write a description of class MoverEsq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoverEsq implements Command
{
    private Jogador j;
    public MoverEsq(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverEsq();           
    }    
    
}
