package Composite.SongComposite;

public class Main {
    public static void main(String[] args) {
        SongGroup idM = new SongGroup("Industrial", "is baal");
        SongGroup tdM = new SongGroup("Melody", "is sweet");

        SongGroup everySong = new SongGroup("List", "All avail");
        everySong.add(idM);
        idM.add(new Song("Hello There","Vallage na",1233));
        tdM.add(new Song("Hello There11111111","Vallage na11111111",12233));
        idM.add(tdM);
        Concert concert = new Concert(everySong);
        concert.getSongList();
    }
}
