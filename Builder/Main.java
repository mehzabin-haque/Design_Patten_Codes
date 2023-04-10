package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBufatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());
    }
}
