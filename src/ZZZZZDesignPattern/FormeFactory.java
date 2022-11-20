package ZZZZZDesignPattern;

import java.util.Date;

public class FormeFactory {

    private Date instanceDate;

    private static FormeFactory instance;

    private FormeFactory() {
        System.out.println("Appel du constructeur de la factory");
        instanceDate = new Date();
    }

    public static FormeFactory getInstance() {
        if (instance == null) {
            instance = new FormeFactory();
        }

        return instance;
    }

    public Forme getForme(String forme, int taille) {

        System.out.println("Instanciation de la factory à " + instanceDate.getTime());

        if (forme.equals("carre")) {
            if (taille > 25)
                return new CarreRouge();
            else
                return new CarreBleu();
        } else if (forme.equals("rond")) {
            if (taille > 25)
                return new RondBleu();
            else
                return new RondRouge();
        }
        return null;
    }

    public Forme getForme(int taille) {
        if (taille < 10)
            return new CarreRouge();
        else if (taille < 20)
            return new CarreBleu();
        else if (taille < 30)
            return new RondBleu();
        else
            return new RondRouge();

    }
}
