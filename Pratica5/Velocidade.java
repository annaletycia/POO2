
//ConcreteDecorator
public class Velocidade extends AtaqueDecorador
{
    public Velocidade(Ataque ataqueDecorado){
        super(ataqueDecorado);
        setNivelDano(15);
        setDescricao("Velocidade ");
    }
}
