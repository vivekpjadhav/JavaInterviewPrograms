package proxy;

public class EBookProxy implements EBook{
    private String fileName;
    private RealEbook realEbook ;

    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void show() {
        if(realEbook == null){
            realEbook = new RealEbook(fileName);
        }
        realEbook.show();

    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
