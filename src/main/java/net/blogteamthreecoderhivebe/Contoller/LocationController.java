package net.blogteamthreecoderhivebe.Contoller;


import net.blogteamthreecoderhivebe.Dto.LocationDto;
import net.blogteamthreecoderhivebe.Enum.EnumLocation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @RequestMapping(value="", method= RequestMethod.GET)
    public ResponseEntity<List<LocationDto>> getLocationList() {
        List<LocationDto> locations = EnumLocation.BUSAN.getLocationList();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}
