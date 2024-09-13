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
        printTotalFileSize(".mariahsInfo.txt", ".secretFolder", ".gitignore");
    }

    public static void printFileSize(String file)
    {
        System.out.println(file.length());
    }
    private static void printTotalFileSize(String... fileNames) {
        long totalSize = 0;
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists()) {
                totalSize += file.length();
            }
        }
        System.out.println("Total size of all files: " + totalSize + " bytes");
    }
    
}