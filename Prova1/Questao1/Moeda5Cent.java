
//ConcreteHandler
public class Moeda5Cent extends Moeda
{
    public void processaMoeda(double diametro){
        double moeda = 1.2;
        
        if(diametro == moeda){
            System.out.println("A moeda inserida é a de 5 centavos!");
        }else{
            getSucessor().processaMoeda(diametro);
        }
    }
}
