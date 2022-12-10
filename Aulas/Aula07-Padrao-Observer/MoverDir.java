
/**
 * Write a description of class MoverEsq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoverDir implements Command
{
    private Jogador j;
    public MoverDir(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverDir();           
    }    
    
}
