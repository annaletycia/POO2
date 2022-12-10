
public class Chutar implements Command
{
    Bola b;
    Jogador j;

    public Chutar(Bola b, Jogador j){
       this.b = b;
       this.j = j;
    }    
    public void execute(){
      j.chuta(b);        

        
    }    
}
