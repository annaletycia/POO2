
//ConcreteHandler
public class Moeda1Cent extends Moeda
{
    public void processaMoeda(double diametro){
        double moeda = 1;
        
        if(diametro == moeda){
            System.out.println("A moeda inserida é a de 1 centavo!");
        }else{
            System.out.println("Moeda rejeitada. Valor não reconhecido.");
        }
    }
}
