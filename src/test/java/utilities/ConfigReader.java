package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //1-Properties objesi olustyuracagiz

    static Properties properties;


    //2-Bu class'in amaci configuratian.properties dosyasini okumak
    //  ve oradaki key value ikililerini kullanmak istedigimiz key'e ait value'yu bize getirmek

    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //3- test class'lardan configReader class;ina ulasip yukaridaki islemleri
    //   yapmamizi saglayarak bir methot olusturacagiz
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }



}
