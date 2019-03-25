import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

class FileRead {

    // Check the file existance
    public static Boolean doesFileExist(String filePath) {
        Path path = Paths.get(filePath);
        if (Files.exists(path)) {
            return true;
        }
        if (Files.notExists(path)) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter file name");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.next();
        scanner.close();

        if (doesFileExist(filePath) == false) {
            System.out.println("File Not Found !!!");
        } else {

            try {
                BufferedReader input = new BufferedReader(new FileReader(filePath));
                String data;
                String[] dataArray = new String[100];
                while ((data = input.readLine()) != null) {
                    dataArray = data.split("[–,]");
                    for (int i = 0; i < dataArray.length; i++)
                        System.out.println(dataArray[i]);
                }
                input.close();
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found !!!");
            } catch (Exception e) {
                System.out.print(e);
            }

        }

    }

}
