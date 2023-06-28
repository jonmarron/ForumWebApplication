package com.jontxu.ForumWebApplication.data;

import java.util.List;

public record Topic(String Title, List<Comment> comments) {
}
