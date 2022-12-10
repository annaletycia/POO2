//concrete factory
public class Objeto2D extends ObjetoFactory
{
    public Copo fabricarCopo(){
        return new Copo2D();
    }
    
    public Prato fabricarPrato(){
        return new Prato2D();
    }
    
    public Garrafa fabricarGarrafa(){
        return new Garrafa2D();
    }
}