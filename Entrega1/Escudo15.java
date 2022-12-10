//ConcreteHandler
public class Escudo15 extends AtaqueAdversario
{
    public void processaDano(Personagem p,int valor){
        
        if (valor > 0){
            System.out.println("Ataque de valor:" + valor);
            int resto = valor - 15;
            getSucessor().processaDano(p,resto);
        } else {
            System.out.println("Ataque contido");
        }
        
    }
}
