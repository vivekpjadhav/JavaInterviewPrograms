package adopter;

import adopter.avaFilter.CaramalAdaptor;
import adopter.avaFilter.Caramel;

public class MainAdopter {

    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramalAdaptor(new Caramel()));
    }
}
