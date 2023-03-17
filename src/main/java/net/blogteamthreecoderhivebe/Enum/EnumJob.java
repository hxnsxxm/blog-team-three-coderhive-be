package net.blogteamthreecoderhivebe.Enum;

import net.blogteamthreecoderhivebe.Dto.JobDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public enum EnumJob {
    JOB_DESIGN("기획", new ArrayList<String>(EnumJobDesign.ECT.getJobDesignList())),
    JOB_ART("디자인", new ArrayList<String>(EnumJobArt.ECT.getJobArtList())),
    JOB_FRONTEND("프론트엔드", new ArrayList<String>(EnumJobFrontend.IOS.getJobFrontendList())),
    JOB_BACKEND("백엔드", new ArrayList<String>(EnumJobBackend.AI.getJobBackendList()));

    private String jobMain;
    private List<String> jobDetails;

    EnumJob(String jobMain, List<String> jobDetails) {
        this.jobMain = jobMain;
        this.jobDetails = jobDetails;
    }


    public String getJobMain() {
        return jobMain;
    }

    public List<String> getJobDetails() {
        return jobDetails;
    }

    public List<JobDto> getJobList() {
        List<JobDto> list = new ArrayList<>();
        for (EnumJob job : EnumJob.values()) {
            JobDto jobDto = new JobDto(job.getJobMain(), job.getJobDetails());
            list.add(jobDto);
        }
        return list;
    }

}
