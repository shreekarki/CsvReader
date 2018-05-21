package csvReaderTomtom.controller;


import csvReaderTomtom.model.GeoName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import csvReaderTomtom.service.GeoNameService;

import java.util.Map;

@RestController
@RequestMapping("/fsgeoname")
public class GeoNameController {

    @Autowired
    private GeoNameService geoNameService;

    @RequestMapping(method = RequestMethod.GET)
    public Map<Integer,GeoName> getAllGeoName() { return geoNameService.getAllGeoName();}

    @RequestMapping(value = "/{geoNameId}" , method = RequestMethod.GET)
    public GeoName getGeoNameById(@PathVariable("geoNameId") final int geoNameId) {
        return geoNameService.getGeoNameById(geoNameId);
    }
}
