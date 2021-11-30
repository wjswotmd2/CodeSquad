package Practice;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        MemberE memberLee = new MemberE(1001, "이지원");
        MemberE memberSon = new MemberE(1002, "유손");
        MemberE memberJeon = new MemberE(1003, "전재승");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberJeon);

        memberHashSet.showAllMember();

        MemberE memberHong = new MemberE(1003, "홍길동");

        memberHashSet.addMember(memberHong);

        memberHashSet.showAllMember();
    }
}
