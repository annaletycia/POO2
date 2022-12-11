//ConcreteHandler
public class Escudo5 extends AtaqueAdversario
{   
    public void processaDano(Personagem p, int valor){
        
        if (valor > 0){
            System.out.println("Ataque de valor:" + valor);
            int resto = valor - 5;
            if(resto <= 0){
                System.out.println("Ataque contido");
            }else{
                System.out.println("Ataque sofrido!");
                p.sofrerAtaque(resto);
                this.setNivelDano(p.getLife());
            }
        } else {
            System.out.println("Ataque contido");
        }
        
    }
}
