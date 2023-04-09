package Composite.File;

import java.util.ArrayList;

public class CompositeFolder implements File{

    public ArrayList<File> allFile = new ArrayList<>();

    public void add(File newFile){
        allFile.add(newFile);
    }

    public void remove(File newFile){
        allFile.remove(newFile);
    }

    @Override
    public void copyFile() {
       for( File file : allFile){
        file.copyFile();
       }
    }

    @Override
    public void editFile() {
       for( File file : allFile){
        file.editFile();
       }
    }

    @Override
    public void moveFile() {
       for( File file : allFile){
        file.moveFile();
       }
    }
    
}
