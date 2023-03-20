package net.blogteamthreecoderhivebe.enumeration;

public enum PostCategory {
    PROJECT("project"),
    STUDY("study");

    private String category;

    PostCategory(String category) {
        this.category = category;
    }
}
