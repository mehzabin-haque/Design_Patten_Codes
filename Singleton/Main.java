package Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Singleton singleton = Singleton.getInstance("Mehzabin Haque");
        Singleton singleton2 = Singleton.getInstance("Kichu ekta");
        System.out.println(singleton.name);
        System.out.println(singleton2.name);
    }
}
