package Esercizio1;

public class Cane extends Animale {

    @Override
    public void verso(){
        System.out.println("Il cane fa bau bau!");
    }
    
    @Override
    public void mangia(){
        System.err.println("Il cane mangia della carne.");
    }

}
