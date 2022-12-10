import java.util.ArrayList;

//Buffer de solicitacoes do(s) cliente(s) - recurso compartilhado
public class List {
    private static final int maxSize = 10;
    private static ArrayList<Command> commandQueue = new ArrayList<Command>();
    
    //Método synchronized: garantirá que apenas uma thread de cada vez acesse tal método. 
    //Se outras threads tentarem fazer o mesmo, elas serão colocadas em espera até que 
    //a thread atual finalize seu trabalho e libere o método.
    public synchronized void placeCommand(Command c){
      
       while(commandQueue.size() == maxSize) {
           try {
               System.out.println(">>>>>>> Cliente dormiu...buffer cheio <<<<<<<<<");
               wait(); //coloca o thread que está acessando esta área para dormir
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        commandQueue.add(c);
        System.out.println("Carga do Buffer: "+commandQueue.size());      
        notifyAll(); //"acorda" todos os threads que estão em wait neste objeto
    }

    public synchronized Command get(int i){ 
       Command c = null;
       while (commandQueue.size() == 0){
           try {
               System.out.println(">>>>>> Agent dormiu...buffer vazio <<<<<<<<");
               wait();
             
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
       }
       c = commandQueue.get(i);
       commandQueue.remove(i);
       notifyAll();
       return c;
    }             
}
/*Observação:
notify
public final void notify()
Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened. The choice is arbitrary and occurs at the discretion of the implementation. A thread waits on an object's monitor by calling one of the wait methods.

notifyAll
public final void notifyAll()
Wakes up all threads that are waiting on this object's monitor. A thread waits on an object's monitor by calling one of the wait methods.

wait
public final void wait(long timeout)
                throws InterruptedException
Causes the current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.

*/