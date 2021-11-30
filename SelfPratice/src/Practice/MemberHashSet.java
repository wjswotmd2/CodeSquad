package Practice;

import java.util.HashSet;
import java.util.Iterator;
import Practice.*;

public class MemberHashSet {
    private java.util.HashSet<MemberE> hashSet;

    public MemberHashSet() {
        hashSet = new java.util.HashSet<>();
    }

    public void addMember(MemberE member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<MemberE> it = hashSet.iterator();

        while (it.hasNext()) {
            MemberE member = it.next();
            int tempId = member.getMemberId();

            if (0 == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {

        for(MemberE member : hashSet) {
            System.out.println(member.getMemberName() + " 회원님의 아이디는 " + member.getMemberId() + "입니다.");
        }
        System.out.println();
    }

}
