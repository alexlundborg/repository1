import java.util.Random;
public class SentenceGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] substantiv = {
			"gubben"
			, "presidenten"
			, "hela tjocka släkten"
			, "Mjölby kommun"
			, "60% av Tysklands befolkning"
			, "Bamse"
			, "Krakel Spektakel"
			, "Farbror Frej"
		}; //Bestämd form eller egennamn.
		String[] verb = {
			"besegrade, under första världskriget"
			, "var en gång i tiden"
			, "har förråt"
			, "åt upp"
			, "slaktade"
		}; //Dåtidsform.

		
		while(true){
		String sub1 = substantiv[rand.nextInt(substantiv.length)];
		String v = verb[rand.nextInt(verb.length)];
		String sub2 = substantiv[rand.nextInt(substantiv.length)];


		System.out.println(sub1 + " " + v + " " + sub2 + ".");
		}
	}
}