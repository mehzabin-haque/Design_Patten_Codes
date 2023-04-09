package Composite.File;

public class Main {
    public static void main(String[] args) {
        File pdf1 = new PdfFile("Pdf1");
        File text1 = new TextFile("Text1");
        File pdf2 = new PdfFile("Pdf2");
        File text2 = new TextFile("Text2");

        CompositeFolder compositeFolder1 = new CompositeFolder();
        CompositeFolder compositeFolder2 = new CompositeFolder();
        compositeFolder1.add(pdf1);
        compositeFolder1.add(text2);
        compositeFolder2.add(pdf2);
        compositeFolder2.add(text1);

        CompositeFolder compositeFolder = new CompositeFolder();
        compositeFolder.add(compositeFolder1);
        compositeFolder.add(compositeFolder2);

        compositeFolder.copyFile();
        compositeFolder.editFile();
        compositeFolder.moveFile();
    }
}
