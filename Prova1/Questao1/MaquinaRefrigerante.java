
//Aplicação cliente
public class MaquinaRefrigerante
{
    public static void main(String args[]){
        //instanciando os objetos da cadeia
        Moeda moeda1R = new Moeda1Real(); //início da cadeia
        Moeda moeda50c = new Moeda50Cent(); 
        Moeda moeda10c = new Moeda10Cent(); 
        Moeda moeda5c = new Moeda5Cent(); 
        Moeda moeda1c = new Moeda1Cent(); //fim da cadeia
        
        //encadeando os objetos da cadeia
        moeda1R.setSucessor(moeda50c);
        moeda50c.setSucessor(moeda10c);
        moeda10c.setSucessor(moeda5c);
        moeda5c.setSucessor(moeda1c);
        moeda1c.setSucessor(null);
        
        //processando as moedas
        moeda1R.processaMoeda(1.0);
        moeda1R.processaMoeda(1.2);
        moeda1R.processaMoeda(1.4);
        moeda1R.processaMoeda(1.6);
        moeda1R.processaMoeda(1.8);
        moeda1R.processaMoeda(2.0);
    }
}
