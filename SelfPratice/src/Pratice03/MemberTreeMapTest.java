package Pratice03;

public class MemberTreeMapTest {
    public static void main(String[] args) {

        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "유손");
        Member memberJeon = new Member(1003, "전재승");
        Member memberPark = new Member(1004, "박정원");
        Member memberKim = new Member(1005, "김지원");

        memberTreeMap.addMemeber(memberLee);
        memberTreeMap.addMemeber(memberSon);
        memberTreeMap.addMemeber(memberJeon);
        memberTreeMap.addMemeber(memberPark);
        memberTreeMap.addMemeber(memberKim);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);

        memberTreeMap.showAllMember();
    }
}
