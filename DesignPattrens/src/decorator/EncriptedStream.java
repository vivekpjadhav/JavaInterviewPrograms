package decorator;

public class EncriptedStream implements Stream{

    private Stream stream;

    public EncriptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);

    }
    private String encrypt(String Data){
        return "ecryptedData";
    }



}


