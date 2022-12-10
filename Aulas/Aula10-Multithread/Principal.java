public class Principal {
    public static void main (){
        List l = new List();
        
        Client c = new Client(l);
        Client c1 = new Client(l);
        Client c2 = new Client(l);
        Client c3 = new Client(l);
        Client c4 = new Client(l);

        
        Agent a = new Agent(l);
        Agent a1 = new Agent(l);
    
        //CLIENTS
        Thread t1 = new Thread(c); 
        Thread t2 = new Thread(c1); 
        Thread t22 = new Thread(c2); 
        Thread t32 = new Thread(c3); 
        Thread t42 = new Thread(c4); 
        
    
        //AGENTS
        Thread t3 = new Thread(a); 
        Thread t4 = new Thread(a1); 

        //valores de prioridade variam de 1 a 10
        //Thread with highest priority will get execution chance prior to other threads
        t1.setPriority(2); 
        t2.setPriority(4); 
        t22.setPriority(6); 
        
        t3.setPriority(8); 
        t4.setPriority(10); 

        t1.setName("Client 1");
        t2.setName("Client 2");
        t22.setName("Client 22");        
        t32.setName("Client 32");                
        t42.setName("Client 42");        
        
        t3.setName("Agent 1");        
        t4.setName("Agent 2");        
        
        t1.start();
        t2.start();
        t22.start();
        t32.start();
        t42.start();
        
        t3.start();
        t4.start();
        
    }
}
    