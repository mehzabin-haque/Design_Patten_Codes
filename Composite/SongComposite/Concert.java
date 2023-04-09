package Composite.SongComposite;

public class Concert {
    protected SongComponent songList;
    public Concert(SongComponent newSongList){
        this.songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
