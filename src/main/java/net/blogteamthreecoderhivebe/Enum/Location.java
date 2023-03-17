package net.blogteamthreecoderhivebe.Enum;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public enum Location {
    NOT_SELECT("KR00", "지역 미지정"),
    SEOUL("KR01", "서울"),
    KYEONGGI("KR02", "경기도"),
    BUSAN("KR03", "부산광역시");

    private String codeLocation;
    private String koreanLocation;

    Location(String codeLocation, String koreanLocation) {
        this.codeLocation = codeLocation;
        this.koreanLocation = koreanLocation;
    }

    public List<Location> getLocationList() {
        return Arrays.asList(Location.values());
    }
}
