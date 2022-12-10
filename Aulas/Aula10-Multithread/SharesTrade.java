//Receiver - implementa os comandos de compra e venda
public class SharesTrade
{
  String name;
  Double value;
  
  public SharesTrade(){}
  public SharesTrade(String name,Double value){
        this.name = name;
        this.value = value;
   }
   public String buy(){
       return name+" comprada por "+value;
    }
   public String sell(){
       return name+" vendida por "+value;
    }
}
