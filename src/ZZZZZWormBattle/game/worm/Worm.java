package ZZZZZWormBattle.game.worm;

import java.util.Scanner;

public class Worm {

	public static void main(String[] args) {

		Scanner addName = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de vie  du worm 1 : ");
		String wormName = addName.next();
		
		Scanner addHPworm1 = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de vie  du worm 1 : ");
		int wormHPworm1 = addHPworm1.nextInt();
		
		Scanner addHPworm12 = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de vie  du worm 1 : ");
		int wormHPworm12 = addHPworm1.nextInt();
		
		Scanner addDamagesworm1 = new Scanner(System.in);
		System.out.println("Veuillez saisir les degats  du worm 1 : ");
		int wormDamagesworm1 = addDamagesworm1.nextInt();
		
		Scanner addHPworm2 = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de vie du worm 2 : ");
		int wormHPworm2 = addHPworm2.nextInt();
		
		Scanner addDamagesworm2 = new Scanner(System.in);
		System.out.println("Veuillez saisir les degats du worm 2 : ");
		int wormDamagesworm2 = addDamagesworm2.nextInt();

		System.out.println(wormbattle(wormDamagesworm1, wormHPworm1, wormDamagesworm2, wormHPworm2));
	}
	
	public static String wormbattle(int damagesWorm1, int HPWorm1, int damagesWorm2, int HPWorm2) {
		String title = "le combat n'est pas terminé";
		int HP = 2;
		while(HP > 0) {
			HPWorm1 = HPWorm1 - damagesWorm2;
			HPWorm2 = HPWorm2 - damagesWorm1;
			if(HPWorm1 > HPWorm2) {
				HP = HPWorm2;
			} else {
				HP = HPWorm1;
			}
			if (HP <= 0 && HP == HPWorm2) {
				title = "le combat est terminé worm1 a gagné";

			} else if (HP <= 0 && HP == HPWorm1) {
				title = "le combat est terminé worm2 a gagné";
			}
		}
		return title;
	}
	
	public static String wormName(String wormName) {
		
		return wormName;
	}
}
