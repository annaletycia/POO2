//aplicação cliente
public class Client
{
    public static void main(){
        ObjetoFactory obj1 = new Objeto2D();
        Copo c1 = obj1.fabricarCopo();
        Garrafa g1 = obj1.fabricarGarrafa();
        Prato p1 = obj1.fabricarPrato();
        System.out.println("Apresentação dos objetos 2D:");
        c1.descrever();
        g1.descrever();
        p1.descrever();
        
        ObjetoFactory obj2 = new Objeto3D();
        Copo c2 = obj2.fabricarCopo();
        Garrafa g2 = obj2.fabricarGarrafa();
        Prato p2 = obj2.fabricarPrato();
        System.out.println("Apresentação dos objetos 3D:");
        c2.descrever();
        g2.descrever();
        p2.descrever();
    }
}
