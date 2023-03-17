package net.blogteamthreecoderhivebe.Dto;


import java.util.List;

public class JobDto {
    String jobMain;
    List<String> jobDetails;

    public JobDto(String jobMain, List<String> jobDetails) {
        this.jobMain = jobMain;
        this.jobDetails = jobDetails;
    }

    public String getJobMain() {
        return jobMain;
    }

    public void setJobMain(String jobMain) {
        this.jobMain = jobMain;
    }

    public List<String> getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(List<String> jobDetails) {
        this.jobDetails = jobDetails;
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "jobMain='" + jobMain + '\'' +
                ", jobDetails=" + jobDetails +
                '}';
    }
}
