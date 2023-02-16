package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;

    public Properties read_Properties() throws IOException {
        prop=new Properties();
        FileInputStream fl = new FileInputStream("./src/test/resources/Config/Config.properties");
        prop.load(fl);
        System.out.println(prop.getProperty("browser"));
        return prop;

    }
}
