package javaForTesters;

import org.junit.Test;

import java.io.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class fileExample {

    @Test
    public void createATempFile() throws IOException {
        File aTempFile = new File("/Users/piyushpanchal/tempJavaForTesters.txt");
        assertThat(aTempFile.exists(), is(false));

        aTempFile.createNewFile();
        assertThat(aTempFile.exists(), is(true));

        aTempFile.delete();
        assertThat(aTempFile.exists(), is(false));
    }

    //Create a file and add text to the file verify text written to the file
    @Test
    public void createAFileWithUniqueName() throws IOException {
        long currentTime = System.currentTimeMillis();
        String fileName = Long.toString(currentTime);
        File myFirstFile = new File("/Users/piyushpanchal/" + "auto" + fileName + ".txt");

        myFirstFile.createNewFile();
        assertThat(myFirstFile.exists(), is(true));

        FileWriter writer = new FileWriter(myFirstFile);
        writer.write("Hello World");
        writer.close();

        FileReader reader = new FileReader(myFirstFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        assertTrue(line.contains("Hello World"));

        System.out.println("file located at " + myFirstFile.getAbsolutePath());
        myFirstFile.delete();
        assertThat(myFirstFile.exists(), is(false));
    }

    @Test
    public void createBufferWriterExample() throws IOException {
        File outputFile = File.createTempFile("printWriter", null);
        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter buffer = new BufferedWriter(writer);
        PrintWriter print = new PrintWriter(buffer);

        writer = new FileWriter(outputFile, true);

        writer.write("Simple Print to Buffered Writer");
        writer.write("===============================");
        writer.close();
    }
}
