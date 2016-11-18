package FirstClasses;

public class Cat {
	private String name;
	private String color;
	private int weight;
	private int edge;

	public void eat() {
		System.out.println("Eating...\n");
	}

	public void sleap() {
		System.out.println("Sleeping...zzz..zz..z\n");
	}

	public String speak(String wordsSpeak) {
		String phraseSpeak = wordsSpeak + "...miauu...\n";
		return phraseSpeak;
	}
	public String askPlay(String wordsPlay) {
		String phrasePlay=wordsPlay+"outside, please...miauuu...";		
		return phrasePlay;
	}
}
