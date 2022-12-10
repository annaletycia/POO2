public class Principal{

public static void main(){

    
Component labirinto = new Sala(new Abismo(), new Sala(new Sala(new Abismo(), new Sala(new Abismo(), new Saida(),"Sala3"),"Sala4"), new Saida(),"Sala2"),"Sala1");

Personagem p1 = new Personagem("Rambo");
Personagem p2 = new Personagem("Stallone Cobra");
Personagem p3 = new Personagem("John Macclane");


Thread t1 = new Thread(new Game(labirinto, p1));
Thread t2 = new Thread(new Game(labirinto, p2));
Thread t3 = new Thread(new Game(labirinto, p3));

t1.start();
t2.start();
t3.start();
}

}