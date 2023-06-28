package com.jontxu.ForumWebApplication.logic;

import com.jontxu.ForumWebApplication.data.Comment;
import com.jontxu.ForumWebApplication.data.Topic;
import com.jontxu.ForumWebApplication.data.Users.Moderator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumService {
    private final List<Topic> topics;

    public ForumService(List<Topic> topics) {
        this.topics = topics;
    }

    /*public Optional<Moderator> getModeratorMostComments(){
        Map<Moderator, Long> moderatorCounts = collectModeratorAndCount();

        return moderatorCounts.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }*/

    public List<Moderator> getModeratorsWithMostModeratedComments(){
        Map<Moderator, Long> moderatorCounts = collectModeratorAndCount();

        long maxCount = getMaxCount(moderatorCounts);

        return moderatorCounts.entrySet().stream()
                .filter(moderator -> moderator.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .toList();
    }

    private Map<Moderator, Long> collectModeratorAndCount() {
        return topics.stream()
                .flatMap(topic -> topic.comments().stream())
                .collect(Collectors.groupingBy(Comment::moderator, Collectors.counting()));
    }

    private Long getMaxCount(Map<Moderator, Long> moderatorCounts) {
        return moderatorCounts.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getValue)
                .orElse(0L);
    }
}
