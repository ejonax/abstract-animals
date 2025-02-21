package Esercizio1;

public class usaAbstractAnimlas {
    public static void main(String[] args) {
        
        Animale cane=new Cane();
        cane.dormi();
        cane.mangia();
        cane.verso();
        
        Animale aquila=new Aquila();
        aquila.dormi();
        aquila.mangia();
        aquila.verso();

        Animale passerotto=new Passerotto();
        passerotto.dormi();
        passerotto.mangia();
        passerotto.verso();

        Animale delfino=new Delfino();
        delfino.dormi();
        delfino.mangia();
        delfino.verso();

    }
}
