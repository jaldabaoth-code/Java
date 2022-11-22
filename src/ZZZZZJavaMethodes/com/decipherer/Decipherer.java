package ZZZZZJavaMethodes.com.decipherer;

public class Decipherer {

	public static void main(String[] args) {
		String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
		String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
		String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
		
		System.out.println(decod(message1, message2, message3));		
	}
	
	public static String decod(String message1, String message2, String message3) {
		
		int keyNumber1 = message1.length()/2;
		int keyNumber2 = message2.length()/2;
		int keyNumber3 = message3.length()/2;

		message1 = message1.substring(5,(keyNumber1+5));
		message2 = message2.substring(5,(keyNumber2+5));
		message3 = message3.substring(5,(keyNumber3+5));

		message1 = message1.replace('@', ' ');
		message1 = message1.replace('?', ' ');
		message1 = message1.replace('#', ' ');

		message2 = message2.replace('@', ' ');
		message2 = message2.replace('?', ' ');
		message2 = message2.replace('#', ' ');

		message3 = message3.replace('@', ' ');
		message3 = message3.replace('?', ' ');
		message3 = message3.replace('#', ' ');
		
		message1 = new StringBuilder(message1).reverse().toString();
		message2 = new StringBuilder(message2).reverse().toString();
		message3 = new StringBuilder(message3).reverse().toString();
		String result = message1 + " " + message2 + " " + message3;
		
		return result;
	}

}


