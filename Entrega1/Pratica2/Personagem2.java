//ConcreteContext
public class Personagem2 extends Personagem
{ 
    public Personagem2(){
        //inicialmente o personagem está em estado normal e com 70% de life
        setEstado(new EstadoNormal(this));
        setLife(70);
        setPulo(new PuloMedio());
    }
}
