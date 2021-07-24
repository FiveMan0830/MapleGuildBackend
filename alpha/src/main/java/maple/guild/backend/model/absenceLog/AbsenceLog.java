package mgm.mapleguildmanagement.model.absenceLog;

import java.util.Date;
import java.util.UUID;

public class AbsenceLog {
    private UUID logUuid;
    private String reason;
    private UUID memberUuid;
    private Date absentFrom;
    private Date absentTo;

    public AbsenceLog(String reason, UUID memberUuid, Date absentFrom, Date absentTo){
        this.logUuid = UUID.randomUUID();
        this.reason = reason;
        this.memberUuid = memberUuid;
        this.absentFrom = absentFrom;
        this.absentTo = absentTo;
    }

    public AbsenceLog(String logUuid, String reason, UUID memberUuid, Date absentFrom, Date absentTo){
        this.logUuid = UUID.fromString(logUuid);
        this.reason = reason;
        this.memberUuid = memberUuid;
        this.absentFrom = absentFrom;
        this.absentTo = absentTo;
    }

    public UUID getLogUuid(){
        return logUuid;
    }

    public String getReason(){
        return reason;
    }

    public UUID getMemberUuid(){
        return memberUuid;
    }

    public Date getAbsentFrom(){
        return absentFrom;
    }

    public Date getAbsentTo(){
        return absentTo;
    }
}
