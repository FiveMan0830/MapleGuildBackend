package mgm.mapleguildmanagement.manager.member;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import mgm.mapleguildmanagement.model.member.Member;
import mgm.mapleguildmanagement.model.member.Role;

public class MemberManager {
    private List<Member> memberList;

    public void createMember(String name, String tag){
        memberList.add(new Member(name, tag, Role.GUEST));
    }

    public Member getMemberByUuid(UUID memberUuid){
        Iterator<Member> iterator = memberList.iterator();
        Member present = null;
        while(iterator.hasNext()){
            present = iterator.next();
            if(present.getUuid().equals(memberUuid))
                break;
        }
        return present;
    }

    public Member getMemberByName(String name){
        Iterator<Member> iterator = memberList.iterator();
        Member present = null;
        while(iterator.hasNext()){
            present = iterator.next();
            if(present.getMemberMapleName().equals(name))
                break;
        }
        return present;
    }

    public void updateMemberRole(UUID memberUuid, Role role){
        Iterator<Member> iterator = memberList.iterator();
        Member present = null;
        while(iterator.hasNext()){
            present = iterator.next();
            if(present.getUuid().equals(memberUuid))
                break;
        }

        present.setMemberRole(role);
    }
}
