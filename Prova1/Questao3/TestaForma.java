
public class TestaForma
{
    public static void main(){
        FormaGeometrica forma = new Quadrado();
        System.out.println(forma.desenhar());
        
        forma = new Preenchimento(forma);
        System.out.println(forma.desenhar());
        
        forma = new Luz(forma);
        System.out.println(forma.desenhar());
        
        forma = new Sombreamento(forma);
        System.out.println(forma.desenhar());
    }
}
