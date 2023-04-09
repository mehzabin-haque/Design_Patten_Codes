package Composite.SongComposite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup implements SongComponent{

    protected ArrayList songComponents = new ArrayList<>();
    protected String groupName;
    protected String groupDesc;

    public SongGroup(String newGroupName,String newGroupDesc){
        groupName = newGroupName;
        groupDesc = newGroupDesc;
        // newGroupDesc = this.groupDesc;
    }

    public String getGroupName(){
        return groupName;
    }

    public String getGroupDesc(){
        return groupDesc;
    }

   
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

   
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

   
    public SongComponent getComponent(int componentIndex) {
        return (SongComponent)songComponents.get(componentIndex);
    }

    @Override
    public void displaySongInfo(){
        System.out.println(getGroupName()+" " +
        getGroupDesc()+"\n");

        Iterator songIterator = songComponents.iterator();
        while(songIterator != null){
            SongComponent songInfo=(SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
    
}
