package This06;

public class Anonymous3 {

    private int field;

    public void method1(final int arg1, int arg2){
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        //일반 메서드에서는 final특성의 변수 빼고 변경이 가능하지만 
        //익명 구현객체에서는 메서드의 매개변수나 메서드의 필드를 수정한다음에는 사용할수없음
        //매개변수는 final특성이 있어서 수정불가
//        arg1 = 20;
//        arg2 = 20;

        //메서드내에 변수는 final특성때문에 수정불가
//        var1 = 30;
//        var2 = 30;

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(calc.sum());
    }
}
