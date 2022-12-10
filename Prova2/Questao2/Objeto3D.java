//concrete factory
public class Objeto3D extends ObjetoFactory
{
    public Copo fabricarCopo(){
        return new Copo3D();
    }
    
    public Prato fabricarPrato(){
        return new Prato3D();
    }
    
    public Garrafa fabricarGarrafa(){
        return new Garrafa3D();
    }
}