package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    public static String url;
    public static String username;
    public static String password;
    public static String wrongUsername;
    public static String wrongPassword;
    public static String emptyPassword;
    public static String emptyUsername;
    public static String firstName;
    public static String lastName;
    public static String zipCode;


    public static PropertyManager getInstance(){

        Properties property = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi =new FileInputStream( "src/main/resources/configuration.properties");
            property.load(fi);
        }
        catch (Exception e){
             e.printStackTrace();
        }

        url = property.getProperty("url");
        username = property.getProperty("username");
        password = property.getProperty("password");
        wrongUsername = property.getProperty("wrongUsername");
        wrongPassword = property.getProperty("wrongPassword");
        emptyPassword = property.getProperty("emptyPassword");
        emptyUsername = property.getProperty("emptyUsername");
        firstName = property.getProperty("firstName");
        lastName = property.getProperty("lastName");
        zipCode = property.getProperty("zipCode");

        return instance;
    }
    public String getUrl(){return url;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getWrongUsername(){return wrongUsername;}
    public String getWrongPassword(){return wrongPassword;}
    public String getEmptyPassword(){return emptyPassword;}
    public String getEmptyUsername(){return emptyUsername;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getZipCode (){return zipCode;}
}
