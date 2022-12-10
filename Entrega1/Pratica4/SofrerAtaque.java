//Aplicação cliente
public class SofrerAtaque
{
    public static void main(String args[]){
        Personagem p = new Personagem1();
        
        //instanciando objetos da cadeia
        AtaqueAdversario escudo15 = new Escudo15();//inicio da cadeia
        AtaqueAdversario escudo10 = new Escudo10();
        AtaqueAdversario escudo5 = new Escudo5();//final da cadeia
        
        //criar cadeia - encadear os objetos da cadeia
        escudo15.setSucessor(escudo10);
        escudo10.setSucessor(escudo5);
        escudo5.setSucessor(null);
        
        //processar os danos do ataque
        escudo15.processaDano(p,30);
        escudo15.processaDano(p,10);
        escudo15.processaDano(p,50);
    }
}
