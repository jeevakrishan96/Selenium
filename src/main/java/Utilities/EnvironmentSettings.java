package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentSettings {
    public static Properties properties ;

    public  EnvironmentSettings() {
        try {

            FileInputStream fileInputStream = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Given File Path is Wrong");
        } catch (IOException e) {
            System.out.println("Properties not loading");
        }
    }
    public static String getProperty(String propertyName){
        return properties.getProperty(propertyName);
    }
    public static void setProperty(String propertyName, String value){
         properties.setProperty(propertyName,value);
    }
}
