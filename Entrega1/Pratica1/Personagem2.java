
//ConcreteContext
public class Personagem2 extends Personagem
{
    public Personagem2(){
        setAtaque(new AtaqueMedio());
        setPulo(new PuloAlto());
        setCorrida(new CorridaRapida());
    }
}
