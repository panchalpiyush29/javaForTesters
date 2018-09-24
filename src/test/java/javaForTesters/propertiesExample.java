package javaForTesters;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class propertiesExample {

    @Test
    public void propertiesExample1() {
        Properties properties = new Properties();

        assertThat(properties.size(), is(0));

        properties.setProperty("browser", "firefox");
        properties.setProperty("port", "80");

        assertThat(properties.getProperty("browser"), is("firefox"));
        assertThat(properties.getProperty("port"), is("80"));
        assertThat(properties.getProperty("Missing"), is(nullValue()));

        for (String key : properties.stringPropertyNames()) {
            System.out.println("Key: " + key + " " + "Value: " + properties.getProperty(key));
        }

        properties.list(System.out);
    }

    @Test
    public void propertiesExample2() {

        String workingDirectory = System.getProperty("user.dir");
        System.out.println(workingDirectory);

        Properties sys = System.getProperties();
        sys.list(System.out);
    }

    @Test
    public void propertiesFileExample() throws IOException {
        String tempDirectory = System.getProperty("java.io.tmpdir");
        String tempResourceFilePath = new File(tempDirectory, "tempFileForPropertiesStoreTest.properties").getAbsolutePath();

        Properties saved = new Properties();
        saved.setProperty("prop1", "Hello");
        saved.setProperty("prop2", "World");

        FileOutputStream outputFile = new FileOutputStream(tempResourceFilePath);
        saved.store(outputFile, "Hello There World");
        outputFile.close();

        FileReader propertyFileReader = new FileReader(tempResourceFilePath);
        Properties loaded = new Properties();

        try {
            loaded.load(propertyFileReader);
        } finally {
            propertyFileReader.close();
        }

        assertThat(loaded.getProperty("prop1"), is("Hello"));
        assertThat(loaded.getProperty("prop2"), is("World"));

        new File(tempResourceFilePath).delete();
    }
}
