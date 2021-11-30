package Practice;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        MemberE memberPark = new MemberE(1003, "박주영");
        MemberE memberSon = new MemberE(1002, "유손");
        MemberE memberJeon = new MemberE(1001, "전재승");


        memberTreeSet.addMemeber(memberJeon);
        memberTreeSet.addMemeber(memberSon);
        memberTreeSet.addMemeber(memberPark);

        memberTreeSet.showAllMemeber();

        MemberE memberHong = new MemberE(1003, "홍길동");

        memberTreeSet.addMemeber(memberHong);
        memberTreeSet.showAllMemeber();
    }
}
