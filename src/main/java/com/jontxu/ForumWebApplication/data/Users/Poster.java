package com.jontxu.ForumWebApplication.data.Users;

import java.time.LocalDate;

public abstract class Poster {
    private final String name;
    private final LocalDate joinedDate;

    protected Poster(String name, LocalDate joinedDate) {
        this.name = name;
        this.joinedDate = joinedDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }
}
