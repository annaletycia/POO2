//Classe de dados da acao (share = acao)
public class Shares {
    String name;
    Double value;
    
    public Shares(String n,Double v){
        name = n;
        value = v;
    }
    public String getName(){
        return name;
    }
    public Double getValue(){
        return value;
    }
}