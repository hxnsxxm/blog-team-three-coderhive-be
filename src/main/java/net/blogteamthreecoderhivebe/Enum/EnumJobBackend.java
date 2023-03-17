package net.blogteamthreecoderhivebe.Enum;

import java.util.ArrayList;
import java.util.List;

public enum EnumJobBackend {
    WEBSERVER("웹 서버"),
    BLOCKCHAIN("블록체인"),
    AI("AI"),
    DB_BIGDATA_DS("DB/빅데이터/DS"),
    GAMESERVER("게임 서버");

    private String detailJobBackend;

    EnumJobBackend(String detailJobBackend) {
        this.detailJobBackend = detailJobBackend;
    }

    public String getDetailJobBackend() { return detailJobBackend; }

    public List<String> getJobBackendList() {
        List<String> list = new ArrayList<>();
        for (EnumJobBackend jobBackend : EnumJobBackend.values()) {
            list.add(jobBackend.getDetailJobBackend());
        }
        return list;
    }
}
