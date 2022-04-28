import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void writeFile(String path, String message) {
        try {
            PrintWriter printWriter = new PrintWriter(path);
            printWriter.println(message);
            printWriter.write(message);

//            printWriter.close();
            printWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
//            System.out.println(Files.readAllLines(Paths.get(path)));
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file1 = new File("data/newFile.txt");
        File file2 = new File("data/data2");
        File file3 = new File("data1/data2/data3/data4");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("File exists? " + file1.exists());
        System.out.println("File is normal? " + file1.isFile());
        System.out.println("File name: " + file1.getName());
        System.out.println("File can be read? " + file1.canRead());
        System.out.println("File can be written? " + file1.canWrite());
        System.out.println("File length: " + file1.length() + " bytes");
        System.out.println("Name's parent directory: " + file1.getParent());
        System.out.println("File last modified (milliseconds): " + df.format(file1.lastModified()));
        System.out.println("Create folder 'data2'? " + file2.mkdir());
        System.out.println("Create folder 'data1'? " + file3.mkdirs());

        System.out.println();
        writeFile(file1.getPath(), "Good afternoon, everybody!");
//        writeFile(file1.getPath(), "I'm Triet. I'm presenting how to read and write a file in Java.");
//        writeFile(file1.getPath(),"Firstly, I'm showing ...");
        readFile(file1.getPath());
    }
}
