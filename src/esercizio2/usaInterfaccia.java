package esercizio2;

public class usaInterfaccia {

    static void faiVolare (VoloInterface a){
      a.vola();  
    }

    static void faiNuotare(NuotoInterface b){
      b.nuota();
    }
    
   public static void main(String[] args) {
      
    Aquila aquila=new Aquila();
    faiVolare(aquila);
           
    Delfino delfino=new Delfino();
    faiNuotare(delfino);

    Cane cane=new Cane();
    faiNuotare(cane);

    Passerotto passerotto=new Passerotto();
    faiVolare(passerotto);

    }
}
