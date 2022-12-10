
//ConcreteHandler
public class Moeda50Cent extends Moeda
{
    public void processaMoeda(double diametro){
        double moeda = 1.6;
        
        if(diametro == moeda){
            System.out.println("A moeda inserida é a de 50 centavos!");
        }else{
            getSucessor().processaMoeda(diametro);
        }
    }
}
