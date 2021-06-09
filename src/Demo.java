import java.io.*;

public class Demo {
    public static String read(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            StringBuilder stringBuilder = new StringBuilder();
            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n ");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println("error in specifying the path " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return null;
    }    public static void main(String[] args) {
        System.out.println(read("C:\\test.txt.txt"));
    }
}