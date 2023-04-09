package Composite.File;

public class TextFile implements File {
    protected String info;

    public TextFile(String info){
        this.info = info;
    }
    @Override
    public void copyFile() {
        System.out.println("------------------------");
        System.out.println("Copying " + info + " file");
    }

    @Override
    public void editFile() {
        System.out.println("------------------------");
        System.out.println("Editing " + info + " file");
    }
    @Override
    public void moveFile() {
        System.out.println("------------------------");
        System.out.println("Moving " + info + " file");
    }
}