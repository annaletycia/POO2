
//ConcreteContext
public class Personagem3 extends Personagem
{
    public Personagem3(){
        setAtaque(new AtaqueForte());
        setPulo(new PuloBaixo());
        setCorrida(new CorridaRapida());
    }
}
