package net.blogteamthreecoderhivebe.Enum;

import java.util.ArrayList;
import java.util.List;

public enum EnumJobArt {
    UIUX("UI/UX 디자인"),
    GRAPHIC("그래픽 디자인"),
    DDD("3D 디자인"),
    HARDWARE("하드웨어(제품) 디자인"),
    ECT("(디자인) 기타");

    private String detailJobArt;

    EnumJobArt(String detailJobArt) {
        this.detailJobArt = detailJobArt;
    }

    public String getDetailJobArt() { return detailJobArt; }

    public List<String> getJobArtList() {
        List<String> list = new ArrayList<>();
        for (EnumJobArt jobArt : EnumJobArt.values()) {
            list.add(jobArt.getDetailJobArt());
        }
        return list;
    }
}
