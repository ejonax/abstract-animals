package Esercizio1;

public class Passerotto  extends Animale{
    
    @Override
    public void verso(){
        System.out.println("Il paserotto fa cip cip!");
    }
    
    @Override
    public void mangia(){
        System.err.println("Il passerotto mangia i semi di girasole.");
    }
    
}
