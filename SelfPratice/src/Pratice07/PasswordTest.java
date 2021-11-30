package Pratice07;

public class PasswordTest {

    private String userPass;

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) throws PassWordException {
        if(userPass == null) {
            throw new PassWordException("비밀번호는 null일 수 없습니다.");
        }
        else if(userPass.length() <= 5) {
            throw new PassWordException("5자 이하인경우 패스워드로 사용할수 없습니다.");
        }
        else if(userPass.matches("[a-zA-Z]+")) {
            throw new PassWordException("패스워드는 문자열로만 만들수 없습니다.");
        }


        this.userPass = userPass;
    }

    public static void main(String[] args) {

        PasswordTest test = new PasswordTest();
        String password = null;
        try {
            test.setUserPass(password);
            System.out.println("오류 없음1");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";
        try {
            test.setUserPass(password);
            System.out.println("오류 없음2");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcdef";
        try {
            test.setUserPass(password);
            System.out.println("오류 없음3");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde1";
        try {
            test.setUserPass(password);
            System.out.println("오류 없음4");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
