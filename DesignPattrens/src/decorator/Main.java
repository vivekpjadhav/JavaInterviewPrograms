package decorator;

public class Main {


    public static void main(String[] args) {
     // var cloudStream = new CloudStream();
        storeCCData(new CompressedCloudStream(new CloudStream()));

    }

    public static void storeCCData(Stream stream) {
            stream.write("1234-1232-1231-5454");
    }
}
