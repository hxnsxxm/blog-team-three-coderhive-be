package net.blogteamthreecoderhivebe.Enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EnumJobDesign {
    UIUX("UI/UX 기획"),
    GAME("게임 기획"),
    PRODUCT("프로덕트 매니저"),
    HARDWARE("하드웨어(제품) 기획"),
    ECT("(기획) 기타");

    private String detailJobDesign;

    EnumJobDesign(String detailJobDesign) {
        this.detailJobDesign = detailJobDesign;
    }

    public String getDetailJobDesign() { return detailJobDesign; }

    public List<String> getJobDesignList() {
        List<String> list = new ArrayList<>();
        for (EnumJobDesign jobDesign : EnumJobDesign.values()) {
            list.add(jobDesign.getDetailJobDesign());
        }
        return list;
    }
}
