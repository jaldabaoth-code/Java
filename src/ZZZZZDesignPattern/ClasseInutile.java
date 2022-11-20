package ZZZZZDesignPattern;

public class ClasseInutile {
    
    public ClasseInutile(){}

    public void MethodeInutile() {
        FormeFactory ff = FormeFactory.getInstance();

        Forme carre = ff.getForme("carre", 12);
        
        carre.QuiSuisJe();
    }
}
