package net.blogteamthreecoderhivebe.Dto;


public class LocationDto {
    private String codeLocation;
    private String koreanLocation;

    public LocationDto(String codeLocation, String koreanLocation) {
        this.codeLocation =codeLocation;
        this.koreanLocation = koreanLocation;
    }

    public String getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    public String getKoreanLocation() {
        return koreanLocation;
    }

    public void setKoreanLocation(String koreanLocation) {
        this.koreanLocation = koreanLocation;
    }


    @Override
    public String toString() {
        return "LocationDto{" +
                "codeLocation='" + codeLocation + '\'' +
                ", koreanLocation='" + koreanLocation + '\'' +
                '}';
    }
}
