//ConcreteDecorator
public class Invisibilidade extends AtaqueDecorador
{
    public Invisibilidade(Ataque ataqueDecorado){
        super(ataqueDecorado);
        setNivelDano(10);
        setDescricao("Invisibilidade ");
    }
}