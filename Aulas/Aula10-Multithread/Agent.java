import java.util.ArrayList;

//Invoker - Consumidor
//Thread consumidor
public class Agent implements Runnable{

    private ArrayList<String> log = new ArrayList<String>();
    private Integer cont = 0;
    private List list;
    
    public Agent (List l){
        this.list = l;
    }

    public void showLog(){
        cont++;
        System.out.println("\nImprimindo o log:");
        for (int i = 0;i < log.size();i++)
            System.out.println("Log "+cont.toString()+": "+log.get(i));
    }
    
    public void run(){
        String s;
        String name = Thread.currentThread().getName();
        System.out.println("Executando a thread " + name);
        
        for (int i=0; i<100;i++){
            try{
               Thread.sleep(2000); //coloca a thread para dormir pelo tempo indicado (milesegundos)
            }
            catch(InterruptedException e){
            }   
            
            Thread t = new Thread(list.get(0)); //EXECUÇÃO ASSINCRONA DO COMMAND
            t.start();
            
            s = list.get(0).execute(); //EXECUÇÃO SINCRONA DO COMMAND
            
            System.out.println("Ordem executada pelo agente "+name+" "+s);
            
            log.add(s);
            
        }
    }
}
