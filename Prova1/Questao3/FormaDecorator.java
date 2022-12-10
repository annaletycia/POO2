
//Decorador
public abstract class FormaDecorator extends FormaGeometrica
{
    private FormaGeometrica formaDecorada;
    
    public FormaDecorator(FormaGeometrica formaDecorada){
        this.formaDecorada = formaDecorada;
    }
    
    public String desenhar(){
        return formaDecorada.desenhar() + "," + super.desenhar();
    }
}
