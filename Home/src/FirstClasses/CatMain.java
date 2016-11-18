package FirstClasses;

public class CatMain {

	public static void main(String[] args) {
		Cat motja=new Cat();
		motja.askPlay("Lets play");
		motja.eat();
		motja.sleap();
		//motja.speak(wordsSpeak);
		String say=motja.speak("im OK");
		System.out.println(say);
		System.out.println(motja.askPlay("Lets play now "));
	}

}
