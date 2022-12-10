
/**
 * Write a description of class MoverEsq here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoverBaixo implements Command
{
    private Jogador j;
    public MoverBaixo(Jogador j){
        this.j = j;
    }    
    
    public void execute(){
        j.moverBaixo();           
    }    
    
}
