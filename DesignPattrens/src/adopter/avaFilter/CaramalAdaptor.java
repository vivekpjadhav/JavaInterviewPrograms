package adopter.avaFilter;

import adopter.Filter;
import adopter.Image;

public class CaramalAdaptor implements Filter {
   Caramel caramel ;

    public CaramalAdaptor(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
