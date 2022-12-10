
//ConcreteHandler
public class Moeda10Cent extends Moeda
{
    public void processaMoeda(double diametro){
        double moeda = 1.4;
        
        if(diametro == moeda){
            System.out.println("A moeda inserida é a de 10 centavos!");
        }else{
            getSucessor().processaMoeda(diametro);
        }
    }
}
