package csvReaderTomtom.model;

import lombok.Data;

@Data
public class GeoName {
    private int geoNameId;
    private  String name;
    private  String asciiName;
    private  String alternateNames;
    private  double latitude;
    private  double longitude;
    private  String featureClass;
    private  String featureCode;
    private  String countryCode;
    private  String cc2;
    private  String admin1Code;
    private  String admin2Code;
    private  String admin3Code;
    private  String admin4Code;
    private  String population;
    private  int elevation;
    private  String dem;
    private  String timezone;
    private  String modificationDate;
}
