//ConcreteContext
public class Personagem1 extends Personagem
{
    public Personagem1(){
        //inicialmente o personagem está em estado normal e com 70% de life
        setEstado(new EstadoNormal(this));
        setLife(70);
        setPulo(new PuloAlto());
    }
}
