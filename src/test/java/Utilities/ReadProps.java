package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProps {



    public static String readAttr(String propName) throws IOException {
            Properties obj = new Properties();
            //FileInputStream objfile = new FileInputStream(System.getProperty("C:\\Users\\Ashwini\\Downloads\\IdeaProjects\\IdeaProjects\\Intelli Docs\\IntelliDocs\\Object_Repository.properties"));
            if (System.getProperty("env")!= null && System.getProperty("env").equals("CI")){
                FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\Object_Repository_CI.properties");
                obj.load(objfile);
            }
            else{
                FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\Object_Repository.properties");
                obj.load(objfile);
            }

            String propValue = obj.getProperty(propName);
            return propValue;






        }
    }


