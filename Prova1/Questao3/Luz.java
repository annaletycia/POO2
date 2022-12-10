
//Concrete Decorator
public class Luz extends FormaDecorator
{
    public Luz(FormaGeometrica formaDecorada){
        super(formaDecorada);
        setDescricao("iluminado");
    }
}
