

public class TestaAtaqueP
{
    public static void main(){
        
        System.out.println("-------------------------------");
        Ataque ataque = new AtaqueSimples();
        System.out.println(ataque.getDescricao());
        System.out.println("Nível do dano:" + ataque.getNivelDano());
        ataque = new Invisibilidade(ataque);
        System.out.println(ataque.getDescricao());
        System.out.println("Nível do dano:" + ataque.getNivelDano());
        
        ataque = new Velocidade(ataque);
        System.out.println(ataque.getDescricao());
        System.out.println("Nível do dano:" + ataque.getNivelDano());
        
        ataque = new SuperForca(ataque);
        System.out.println(ataque.getDescricao());
        System.out.println("Nível do dano:" + ataque.getNivelDano());
        System.out.println("-------------------------------");
    }
}
