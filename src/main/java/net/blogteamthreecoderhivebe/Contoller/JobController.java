package net.blogteamthreecoderhivebe.Contoller;

import net.blogteamthreecoderhivebe.Dto.JobDto;
import net.blogteamthreecoderhivebe.Enum.EnumJob;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @RequestMapping(value="", method= RequestMethod.GET)
    public ResponseEntity<List<JobDto>> getJobList() {
        List<JobDto> jobList = EnumJob.JOB_DESIGN.getJobList();
        return new ResponseEntity<>(jobList, HttpStatus.OK);
    }
}
