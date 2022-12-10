//ConcreteContext
public class Personagem3 extends Personagem
{
    public Personagem3(){
        //inicialmente o personagem está em estado normal e com 70% de life
        setEstado(new EstadoNormal(this));
        setLife(70);
        setPulo(new PuloBaixo());
    }
}
