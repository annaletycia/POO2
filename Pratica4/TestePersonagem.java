public class TestePersonagem
{
    
    public static void main(){
    Personagem p;
    
    System.out.println("Personagem1");
    p = new Personagem1();
    p.atacar();
    p.correr();
    p.pular();
    p.sofrerAtaque(30);
    
    System.out.println("Personagem2");
    p = new Personagem2();
    p.atacar();
    p.correr();
    p.pular();
    p.sofrerAtaque(45);
    
    System.out.println("Personagem3");
    p = new Personagem3();
    p.atacar();
    p.correr();
    p.pular();
    p.sofrerAtaque(70);
    }
}
