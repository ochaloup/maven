package cz.chalda.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Simple class to sum two numbers.
 */
public class Calculator {
  private String propertiesFileName = "default.properties";
  
  public int add(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
  }
  
  public int addProperties() {
    Properties loadedProps = new Properties();
    InputStream in = null;
    try {
      // properties file is search on class path
      in = this.getClass().getClassLoader().getResourceAsStream(propertiesFileName);
      loadedProps.load(in);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        if (in != null) {
          in.close();
        }
      } catch (IOException e) {
        System.out.println("Troubles on closing inputstream" + e.getMessage());
      }
    }
    
    String numberOneStr = loadedProps.getProperty("number.one");
    String numberTwoStr = loadedProps.getProperty("number.two");
    
    return add(Integer.valueOf(numberOneStr), Integer.valueOf(numberTwoStr));
  }

  public String getPropertiesFileName() {
    return propertiesFileName;
  }

  public void setPropertiesFileName(String propertiesFileName) {
    this.propertiesFileName = propertiesFileName;
  }
}
