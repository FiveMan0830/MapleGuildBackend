package mgm.mapleguildmanagement.model.member;

import java.util.UUID;

public class Member {
    private UUID memberUuid;
    private String memberMapleName;
    private String memberDiscordTag;
    private Role memberRole;

    public Member(String name, String tag, Role role){
        this.memberUuid = UUID.randomUUID();
        this.memberMapleName = name;
        this.memberDiscordTag = tag;
        this.memberRole = role;
    }

    public Member(String uuid, String name, String tag, Role role){
        this.memberUuid = UUID.fromString(uuid);
        this.memberMapleName = name;
        this.memberDiscordTag = tag;
        this.memberRole = role;
    }

    public UUID getUuid(){
        return memberUuid;
    }

    public String getMemberMapleName(){
        return memberMapleName;
    }

    public String getMemberDiscordTag(){
        return memberDiscordTag;
    }

    public Role getMemberRole(){
        return memberRole;
    }

    public void setMemberRole(Role role){
        this.memberRole = role;
    }
}