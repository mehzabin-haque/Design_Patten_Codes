package Composite.File;

public abstract class FileManager implements File{
    @Override
    public void copyFile() {
        System.out.println("File is copied.");
    }

    @Override
    public void moveFile() {
        System.out.println("File is moved.");
    }

    @Override
    public void editFile() {
        System.out.println("File is edited.");
    }
}
