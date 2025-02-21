package Esercizio1;

public class Aquila extends Animale {
    
     @Override
     public void verso(){
        System.out.println("Il verso dell'aquila è il grido detto anche strido.");
     }
     
     @Override
     public void mangia(){
        System.err.println("I'aquila mangia piccoli mammiferi.");
     }
    
}
