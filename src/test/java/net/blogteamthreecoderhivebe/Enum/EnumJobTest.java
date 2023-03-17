package net.blogteamthreecoderhivebe.Enum;

import org.junit.jupiter.api.Test;

class EnumJobTest {
    @Test
    public void getEnumJobDesignList() {
        System.out.println(EnumJobDesign.ECT.getJobDesignList());
    }
    @Test
    public void getEnumJobArtList() {
        System.out.println(EnumJobArt.ECT.getJobArtList());
    }

    @Test
    public void getEnumJobFrontendList() {
        System.out.println(EnumJobFrontend.IOS.getJobFrontendList());
    }

    @Test
    public void getEnumJobBackendList() {
        System.out.println(EnumJobBackend.AI.getJobBackendList());
    }

    @Test
    public void getJobList() {
        System.out.println(EnumJob.JOB_DESIGN.getJobList());
    }

}