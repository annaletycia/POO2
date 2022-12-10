
//Concrete Decorator
public class Preenchimento extends FormaDecorator
{
    public Preenchimento(FormaGeometrica formaDecorada){
        super(formaDecorada);
        setDescricao("preenchido");
    }
}
