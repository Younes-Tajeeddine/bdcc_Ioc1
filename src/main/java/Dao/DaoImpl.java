package Dao;

public class DaoImpl implements Idao{

    @Override
    public double Getdata(){
        System.out.println("Version Base de donnees");
    double temp=23;
        return temp;
    }
}
