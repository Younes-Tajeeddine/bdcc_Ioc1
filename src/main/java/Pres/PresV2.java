package Pres;

import Dao.Idao;

import java.io.File;
import java.util.Scanner;

public class PresV2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Config.txt"));
            String daoClassname = sc.nextLine();
            Class cDao = Class.forName(daoClassname);
            Idao idao = (Idao) cDao.getConstructor().newInstance();
            System.out.println(idao.Getdata());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
