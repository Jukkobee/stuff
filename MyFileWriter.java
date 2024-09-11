import java.io.*; 
public class MyFileWriter{
    public static void main (String [] args)
    {
        new File(".secretFolder").mkdirs();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".secretFolder/thePassword.dat"))) {
            bufferedWriter.write("kevinsFeet");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printFileSize(".secretFolder/thePassword.dat");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".mariahsInfo.txt"))) {
            bufferedWriter.write("banana123");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printFileSize(".mariahsInfo.txt");
    }

    public static void printFileSize(String file)
    {
        System.out.println(file.length());
    }
}