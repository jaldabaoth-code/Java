package ZZZZZWorkshopDesignPattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("");

        FormeFactory ff = FormeFactory.getInstance();
        Forme carreBleu = ff.getForme("carre", 12);
        carreBleu.QuiSuisJe();

        ff = FormeFactory.getInstance();
        Forme carreRouge = ff.getForme("carre", 30);
        carreRouge.QuiSuisJe();

        ff = FormeFactory.getInstance();
        Forme rondBleu = ff.getForme("rond", 30);
        rondBleu.QuiSuisJe();

        ff = FormeFactory.getInstance();
        Forme rondRouge = ff.getForme("rond", 12);
        rondRouge.QuiSuisJe();

        try {
            Forme triangle = ff.getForme("triangle", 12);
            triangle.QuiSuisJe();
        } catch (Exception e) {
            System.out.println("le triangle n'existe pas");
        }

        Forme formeInconnue = ff.getForme(12);
        formeInconnue.QuiSuisJe();

        ClasseInutile ci = new ClasseInutile();
        ci.MethodeInutile();
    }
}