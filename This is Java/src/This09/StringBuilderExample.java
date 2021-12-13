package This09;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(stringBuilder);

        for(int i = 0; i <= 100; i++) {
            stringBuilder.append(i + " ");
        }

        System.out.println(stringBuilder);
    }
}
