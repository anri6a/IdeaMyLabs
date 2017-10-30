package myLabs;

/**
 * Created by 12 on 30.10.2017.
 * Class Cat with 3 methods sleep, eat, say(smth)
 */
 class Cat {
    public int weight;
    public String color;

     void sleep() {
        System.out.println("...Hrrrrr....");
    }

     void eat() {
        System.out.println("Eating..testy");
    }

     String say(String words) {
        String text = "i say" + words;
        System.out.println(text);
        return text;
    }
}
