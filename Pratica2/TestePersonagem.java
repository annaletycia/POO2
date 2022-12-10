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
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10);
    p.ganharLife(10); //o life do personagem não passa de 100%
    
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
    p.sofrerAtaque(60);
    p.sofrerAtaque(10);
    p.sofrerAtaque(1); //nada muda pois o personagem perdeu toda sua life
    p.ganharLife(10); //nada muda pois o personagem já perdeu toda sua life
    }
}
