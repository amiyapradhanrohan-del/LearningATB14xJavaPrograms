package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab250_REAL_EXAMPLE {
    public static void main(String[] args) {
        // MAP is basically used for storing the environment variables
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");

        //MAP also used to store the Credentials/ Managing user credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
        credentials.put("user", null);//It can have multiple null values but different keys
        credentials.put("user2", null);

        //Generally HashMap and MAP are used for sending the data from Map to JSON, JSON to Map - API Automation


    }
}
