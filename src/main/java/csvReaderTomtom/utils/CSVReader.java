package csvReaderTomtom.utils;

import csvReaderTomtom.model.GeoName;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Component
public class CSVReader {
    private final String filePath ="/home/karki/Documents/AND /";

    public  Map<Integer , GeoName> readFile() {
        BufferedReader bufferedReader = null;
        String line = "";
        Map<Integer , GeoName> geoNameMap = new HashMap<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(filePath,"AD.txt" )));
            line = bufferedReader.readLine();

            while(line != null) {
                String[] geoName = line.split("\\t");
                GeoName geoName1 = new GeoName();
                geoName1.setGeoNameId(Integer.valueOf(geoName[0]));
                geoNameMap.put(geoName1.getGeoNameId(), geoName1);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader !=null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  geoNameMap;
    }
}
