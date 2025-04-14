package ext;

import Dao.Idao;

public class IdaoImplV2 implements Idao {
    @Override
    public double Getdata() {
        System.out.println("Version Web Service");
        double t=11;
        return t;
    }
}
