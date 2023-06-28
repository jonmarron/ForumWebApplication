package com.jontxu.ForumWebApplication.data;

import com.jontxu.ForumWebApplication.data.Users.Moderator;

import java.time.LocalDate;

public record Comment(int id, LocalDate creationDate, String message, Moderator moderator, boolean isSafe) {
}
