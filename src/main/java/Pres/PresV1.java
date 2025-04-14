package Pres;

import Dao.DaoImpl;
import Metier.MetierImpl;
import ext.IdaoImplV2;

public class PresV1 {
    public static void main(String[] args) {
        IdaoImplV2 d = new IdaoImplV2();
        MetierImpl Metier = new MetierImpl(d);
        Metier.setDao(d);
        System.out.println("Res"+Metier.Calcul());
    }
}
