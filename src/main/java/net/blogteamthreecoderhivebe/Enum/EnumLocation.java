package net.blogteamthreecoderhivebe.Enum;

import net.blogteamthreecoderhivebe.Dto.LocationDto;

import java.util.ArrayList;
import java.util.List;

public enum EnumLocation {
    NOT_SELECT("KR00", "지역 미지정"),
    SEOUL("KR01", "서울"),
    KYEONGGI("KR02", "경기도"),
    BUSAN("KR03", "부산광역시");

    private String codeLocation;
    private String koreanLocation;

    EnumLocation(String codeLocation, String koreanLocation) {
        this.codeLocation = codeLocation;
        this.koreanLocation = koreanLocation;
    }

    public String getCodeLocation() { return this.codeLocation; }
    public String getKoreanLocation() { return this.koreanLocation; }


    public List<LocationDto> getLocationList() {
        //return Arrays.asList(Location.values());
        List<LocationDto> list = new ArrayList<>();
        for (EnumLocation loc : EnumLocation.values()) {
            LocationDto locationDto = new LocationDto(loc.getCodeLocation(), loc.getKoreanLocation());
            list.add(locationDto);
        }
        return list;
    }
}
