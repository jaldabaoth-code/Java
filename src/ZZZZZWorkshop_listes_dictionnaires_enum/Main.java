package ZZZZZWorkshop_listes_dictionnaires_enum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("");
        System.out.println("");

        Utilisateur u1 = new Utilisateur("Dupont", "Jean", Civilite.Mr);
        Utilisateur u2 = new Utilisateur("Dupond", "Thierry", Civilite.Mr);
        Utilisateur u3 = new Utilisateur("Moreau", "Jeanne", Civilite.Mme);
        Utilisateur u4 = new Utilisateur("Delacompta", "Jeannine", Civilite.Mme);
        Utilisateur u5 = new Utilisateur("Toto", "Titi", Civilite.Autre);

        List<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

        listeUtilisateurs.add(u1);
        listeUtilisateurs.add(u2);
        listeUtilisateurs.add(u3);
        listeUtilisateurs.add(u4);
        listeUtilisateurs.add(u5);

        Map<Civilite, List<Utilisateur>> utilisateursParCivilite = new HashMap<Civilite, List<Utilisateur>>();

        for (Utilisateur utilisateur : listeUtilisateurs) {
            // Si la clé n'existe pas, on la crée
            if (!utilisateursParCivilite.containsKey(utilisateur.Civilite)) {
                utilisateursParCivilite.put(utilisateur.Civilite, new ArrayList<Utilisateur>());
            }

            // On ajoute l'utilisateur à la liste correspondante
            List<Utilisateur> utilisateursDeCetteCivilite = utilisateursParCivilite.get(utilisateur.Civilite);
            utilisateursDeCetteCivilite.add(utilisateur);
        }

        for (Map.Entry<Civilite, List<Utilisateur>> entry : utilisateursParCivilite.entrySet()) {
            Civilite civ = entry.getKey();
            List<Utilisateur> utilisateurs = entry.getValue();

            System.out.println("Civilité : " + civ);
            System.out.println("Nombre d'utilisateurs : " + utilisateurs.size());

            for (Utilisateur utilisateur : utilisateurs) {
                System.out.println("\t" + utilisateur.Nom + " " + utilisateur.Prenom);
            }
        }
    }
}
