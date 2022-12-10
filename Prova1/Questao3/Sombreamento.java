
//Concrete Decorator
public class Sombreamento extends FormaDecorator
{
    public Sombreamento(FormaGeometrica formaDecorada){
        super(formaDecorada);
        setDescricao("sombreado");
    }
}
