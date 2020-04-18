package adopter;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("applyingnthe vivid filter");
    }
}
