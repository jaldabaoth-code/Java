package ZZZZZIndiana.com.wildcodeschool;

public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] films = new String[] {"Les Aventuriers de l'Arche perdue", "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade"};
		String[][] acteurs = new String[][] {
			{"Harrison Ford", "Karen Allen", "Paul Freeman"},{"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"},{"Harrison Ford", "Sean Connery", "Denholm Elliott"}
		};
		for (int i = 0; i < films.length; i++) {
			System.out.println("Dans le film " + films[i] + ", les principaux acteurs sont : " + String.join(", ", acteurs[i]));
		}
	}
}
