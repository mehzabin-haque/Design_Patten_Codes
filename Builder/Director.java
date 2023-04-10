package Builder;

public class Director {
    public void buildBufatti(Builder builder){
        builder.brand("Bugatti")
        .color("Blue")
        .engine("8L")
        .nbrOfDoors(2)
        .height(115)
        .model("Text");
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }
}
