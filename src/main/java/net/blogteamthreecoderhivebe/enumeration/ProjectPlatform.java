package net.blogteamthreecoderhivebe.enumeration;

public enum ProjectPlatform {
    IOS("IOS"),
    ANDROID("안드로이드 앱"),
    NON("미정(의논 후 결정)"),
    WEB("반응형 웹(PC/모바일)"),
    PC("PC(윈도우/맥) 프로그램"),
    SOLUTION("설치형/SASS 솔루션");

    private String platform;

    ProjectPlatform(String platform) {
        this.platform = platform;
    }
}
