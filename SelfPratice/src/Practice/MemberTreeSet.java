package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<MemberE> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<MemberE>();
    }

    public void addMemeber(MemberE member) {
        treeSet.add(member);
    }

    public boolean removerMemeber(int memberId){
        Iterator<MemberE> it = treeSet.iterator();

        while (it.hasNext()) {
            MemberE member = it.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMemeber() {

        for(MemberE member : treeSet) {
            System.out.println(member.getMemberName() + " 회원님의 아이디는 " + member.getMemberId() + "입니다.");
        }
        System.out.println();
    }
}
