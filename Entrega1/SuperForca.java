//ConcreteDecorator
public class SuperForca extends AtaqueDecorador
{
    public SuperForca(Ataque ataqueDecorado){
        super(ataqueDecorado);
        setNivelDano(20);
        setDescricao("Super Força ");
    }
}
