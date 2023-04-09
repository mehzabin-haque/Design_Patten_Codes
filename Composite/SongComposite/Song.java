package Composite.SongComposite;

public class Song  implements SongComponent{
    protected String songName;
    protected String bandName;
    protected int releaseYear;

    public Song(String NewSongName, String NewBandName,int newReleaseYear){
        this.bandName = NewBandName;
        this.releaseYear = newReleaseYear;
        this.songName= NewSongName;
    }
 

  
    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;  }

    public int getRelasedYear() {
        return releaseYear;  }

    @Override
    public void displaySongInfo() {
        System.out.println(getSongName()+" was reocrded by" +
        getBandName() + " in " + getRelasedYear()); 
    }

}
