public class Sala implements Component{

    private Component caminho1;
    private Component caminho2;
    private String nome;
    
    public Sala(Component c1, Component c2, String nome){
        this.caminho1 = c1;
        this.caminho2 = c2;
        this.nome = nome;
        }

        public void andar(Personagem p){
            try{
              Thread.sleep(2000);
            }
            catch(Exception e){
            }    
        System.out.println("Personagem "+p.getNome()+" entrou na sala "+this.nome);

        double valor = Math.random();


        if (valor < 0.5) {
            System.out.println("Personagem "+p.getNome()+" pegou caminho 1"); 
            caminho1.andar(p);
                }
        else {

            System.out.println("Personagem "+p.getNome()+" pegou caminho 2");   
            caminho2.andar(p);

                }

    }
}
