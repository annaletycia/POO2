//Produtor - Simulando o cliente da aplicação
//Thread produtor

public class Client implements Runnable 
{
    private SharesTrade st = new SharesTrade(); //receiver
    private Integer cont;
    private List list;

    public Client (List l){
        cont = 0; //contador de operacoes
        list = l; //buffer compartilhado entre produtor e consumidor
    }

    public void run (){
        Command c;

        System.out.println("Executando Thread Cliente "+Thread.currentThread().getName());

        for (int i=0; i<100;i++){
            try{
               Thread.sleep(2000); //Coloca a thread para dormir pelo tempo em milisegundos
            }
            catch(InterruptedException e){
            }    
            cont++;
            st = new SharesTrade("Acao "+cont.toString(), Math.random() * 10000.0);

            if ( Math.random() > 0.5)
                c = new BuyShares(st);
                else
                c = new SellShares(st);
                
            list.placeCommand(c);
            System.out.println("Ordem "+cont+" emitida pelo cliente "+Thread.currentThread().getName());
        }
        
    }
}
