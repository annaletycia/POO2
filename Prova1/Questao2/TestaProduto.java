
//Aplicação Cliente
public class TestaProduto
{
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        
        System.out.println("Produto 1:");
        produto1.comprar(10);
        produto1.vender(5);
        produto1.comprar(50);
        
        System.out.println("Produto 2:");
        produto2.vender(1);
        produto2.comprar(100);
        produto2.vender(70);
        produto2.vender(19);
        produto2.vender(50);
    }
}
