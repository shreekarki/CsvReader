package csvReaderTomtom.daos;

import csvReaderTomtom.model.GeoName;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface GeoNameDAO {
    Map<Integer, GeoName> getAllGeoName();
    GeoName getGeoNameById(int geoNameId);
}
