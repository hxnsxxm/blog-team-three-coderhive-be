package net.blogteamthreecoderhivebe.enumeration;

public enum PostStatus {
    HIRING("모집중"),
    CLOSED("모집완료");

    private String status;

    PostStatus(String status) {
        this.status = status;
    }
}
