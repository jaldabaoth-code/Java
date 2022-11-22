package ZZZZZboucles;

public class boucles {

	public static void main(String[] args) {
		var first = 1;
		var second = 1;

		while(first < 11)
		{
			while(second < 11)
			{
			    System.out.println(first + " " + second);
			    second++;
			}
			first++;
			second = 1;
		}
	}
}

