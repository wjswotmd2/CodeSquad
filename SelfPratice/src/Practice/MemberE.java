package Practice;

import java.util.Objects;

public class MemberE implements Comparable<MemberE>{
        private int memberId;
        private String memberName;

        public MemberE(int memberId, String memberName) {
            this.memberId = memberId;
            this.memberName = memberName;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MemberE) {
            MemberE m = (MemberE)obj;
            if(memberId == m.memberId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compareTo(MemberE member) {
        return this.memberName.compareTo(member.memberName);
    }
}

