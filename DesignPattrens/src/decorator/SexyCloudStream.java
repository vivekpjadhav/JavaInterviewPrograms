package decorator;

public class SexyCloudStream implements Stream{

    private Stream stream;

    public SexyCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("writing the Cloude stream ");
    }
}
