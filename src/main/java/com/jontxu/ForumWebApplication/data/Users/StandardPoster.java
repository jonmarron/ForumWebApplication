package com.jontxu.ForumWebApplication.data.Users;

import com.jontxu.ForumWebApplication.data.Users.Poster;

import java.time.LocalDate;

public class StandardPoster extends Poster {
    private boolean hasFilter;
    protected StandardPoster(String name, LocalDate joinedDate) {
        super(name, joinedDate);
        hasFilter = true;
    }

    public boolean getHasFilter() {
        return hasFilter;
    }

    public void removeFilter() {
        hasFilter = false;
    }

    public void setFilter() {
        hasFilter = true;
    }
}
