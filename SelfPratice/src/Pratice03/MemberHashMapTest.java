package Pratice03;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "유손");
        Member memberJeon = new Member(1003, "전재승");
        Member memberPark = new Member(1004, "박정원");
        Member memberKim = new Member(1005, "김지원");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberJeon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberKim);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);

        memberHashMap.showAllMember();
    }
}
