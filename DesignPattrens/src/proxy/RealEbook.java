package proxy;

public class RealEbook implements EBook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the file " + fileName);
    }

    @Override
    public void show() {
        System.out.println("shoing ghe file name "+ fileName);
    }

    @Override
    public String getFileName() {
        return null;
    }
}
