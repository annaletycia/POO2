
//ConcreteHandler
public class Moeda1Real extends Moeda
{
    public void processaMoeda(double diametro){
        double moeda = 1.8;
        
        if(diametro == moeda){
            System.out.println("A moeda inserida é a de 1 real!");
        }else{
            getSucessor().processaMoeda(diametro);
        }
    }
}
