package ZZZZZWormBattle.game.worm;

public class Tournament {

	public static void main(String[] args) {
		double[] groupe1HP = {100, 100, 100, 100, 100};
		double[] groupe1Damages = {5, 2, 2, 3, 5};
		double[] groupe2HP = {100, 100, 100, 100, 100};
		double[] groupe2Damages = {10, 20, 20, 3, 5};
		
		int i = 0;
		int j = 0;
		int val = 0;
		
		while (val < 5) {
			int rep = wormbattle(groupe1Damages[i], groupe1HP[i], groupe2Damages[j], groupe2HP[j]);
			
			if (rep == 1) {
				j++;
				groupe1HP[i] = groupe1HP[i] * 1.2;
			} else if (rep == 2) {
				i++;
				groupe2HP[j] = groupe2HP[j] * 1.2;
			}
			if (i<j) {
				val = j;
			} else {
				val = i;
			}
		}
		if (i == 5) {
			System.out.println("groupe2 a gagné");
		} else if (j == 5) {
			System.out.println("groupe1 a gagné");
		}
	}

	public static int wormbattle(double damagesWorm1, double HPWorm1, double damagesWorm2, double HPWorm2) {
		int title = 0;
		double HP = 2;
		while(HP > 0) {
			HPWorm1 = HPWorm1 - damagesWorm2;
			HPWorm2 = HPWorm2 - damagesWorm1;
			if(HPWorm1 > HPWorm2) {
				HP = HPWorm2;
			} else {
				HP = HPWorm1;
			}
			if (HP <= 0 && HP == HPWorm2) {
				title = 1;

			} else if (HP <= 0 && HP == HPWorm1) {
				title = 2;
			}
		}
		return title;
	}
}
