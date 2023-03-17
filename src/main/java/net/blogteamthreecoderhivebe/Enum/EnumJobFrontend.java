package net.blogteamthreecoderhivebe.Enum;

import java.util.ArrayList;
import java.util.List;

public enum EnumJobFrontend {
    IOS("IOS"),
    ANDROID("안드로이드"),
    WEBFRONTEND("웹프론트엔드"),
    WEBPUBLISHER("웹퍼블리셔"),
    CROSSPLATFORM("크로스플랫폼"),
    EMBEDDED("임베디드SW");

    private String detailJobFrontend;

    EnumJobFrontend(String detailJobFrontend) {
        this.detailJobFrontend = detailJobFrontend;
    }

    public String getDetailJobFrontend() { return detailJobFrontend; }

    public List<String> getJobFrontendList() {
        List<String> list = new ArrayList<>();
        for (EnumJobFrontend jobFrontend : EnumJobFrontend.values()) {
            list.add(jobFrontend.getDetailJobFrontend());
        }
        return list;
    }
}
