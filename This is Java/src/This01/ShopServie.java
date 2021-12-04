package This01;

public class ShopServie {

    private static ShopServie instance = new ShopServie();

    private ShopServie() {};

    public static ShopServie getInstance() {
        if(instance == null) {
            instance = new ShopServie();
            return instance;
        }
        return null;
    }
}
