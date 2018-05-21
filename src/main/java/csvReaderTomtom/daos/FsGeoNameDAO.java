package csvReaderTomtom.daos;


import csvReaderTomtom.model.GeoName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import csvReaderTomtom.utils.CSVReader;

import java.util.Map;

@Repository
public class FsGeoNameDAO implements GeoNameDAO {

    private Map<Integer,GeoName > geoNameMap;

    @Autowired
    private CSVReader fileReader;

    public Map<Integer,GeoName> getAllGeoName() {
        return fileReader.readFile();
    }

    public GeoName getGeoNameById(final int geoNameId) {
        geoNameMap = getAllGeoName();
        return geoNameMap.get(geoNameId);
    }
}
