package Metier;

import Dao.DaoImpl;
import Dao.Idao;

import java.util.Set;

public class MetierImpl implements Imetier{
    private Idao dao;
    public MetierImpl(Idao dao) {
        this.dao = dao;
    }
    @Override
    public double Calcul() {
        double t= dao.Getdata();
        double res=t+23;
        return res;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
