package com.jontxu.ForumWebApplication.data.Users;

import java.time.LocalDate;

public class Moderator extends Poster {
    private ModeratorType moderatorRoleType;
    protected Moderator(String name, LocalDate joinedDate, ModeratorType moderatorRoleType) {
        super(name, joinedDate);
        this.moderatorRoleType = moderatorRoleType;
    }

    public ModeratorType getModeratorRoleType() {
        return moderatorRoleType;
    }

    public void setModeratorRoleType(ModeratorType moderatorRoleType) {
        this.moderatorRoleType = moderatorRoleType;
    }
}
