package life_hub_ecosystem.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marri
 */
public class ZipcodeDataLoaderHelper {

    public static void main(String[] args) throws IOException {
        //getzipCodeDetails("02119");
        System.out.println(getzipCodeDetails("02111").get(0).toString());
          System.out.println(getzipCodeDetails("02119").get(1).toString());
    }

    public static ArrayList getzipCodeDetails(String zipCode) throws IOException {

        HashMap<String, ArrayList> zipcodeData = new HashMap<>();
        //System.out.println(System.getProperty("user.dir"));
        String csvFile = "src/health_haven_ecosystem/data/uszips.csv";

        BufferedReader reader = new BufferedReader(new FileReader(csvFile));
        String line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            ArrayList result = new ArrayList();
            String[] values = line.split(",");
            result.add(values[3].substring(1, values[3].length()-1));
            result.add(values[5].substring(1, values[5].length()-1));
            zipcodeData.put(values[0].substring(1, values[0].length()-1), result);
        }
        ArrayList resultSet = zipcodeData.get(zipCode);
//        for(String k: zipcodeData.keySet()){
//           System.out.println(k + zipcodeData.get(k) + zipcodeData.keySet().size() ); 
//        }
        reader.close();
        return resultSet;

    }
}
