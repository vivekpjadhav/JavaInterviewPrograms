package decorator;

public class CompressedCloudStream implements Stream{
private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = compressed(data);
        stream.write(encrypted);

    }
    private String compressed(String Data){
        return "compressedData";
    }
}
