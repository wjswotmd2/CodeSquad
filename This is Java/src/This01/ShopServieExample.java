package This01;

public class ShopServieExample {

    public static void main(String[] args) {

        ShopServie obj1 = ShopServie.getInstance();
        ShopServie obj2 = ShopServie.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService객체 입니다.");
        }
        else {
            System.out.println("다른 ShopService객체 입니다.");

        }
    }
}
