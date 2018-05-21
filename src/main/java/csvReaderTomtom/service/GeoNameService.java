package csvReaderTomtom.service;

import csvReaderTomtom.daos.GeoNameDAO;
import csvReaderTomtom.model.GeoName;
import csvReaderTomtom.utils.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GeoNameService {

    @Autowired
    private GeoNameDAO geoNameDAO;

    public Map<Integer,GeoName> getAllGeoName() { return geoNameDAO.getAllGeoName();}

    public GeoName getGeoNameById(final int geoNameId) {
        return geoNameDAO.getGeoNameById(geoNameId);
    }
}
