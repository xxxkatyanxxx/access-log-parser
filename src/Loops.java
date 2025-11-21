import java.util.Scanner;
import java.io.File;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || !isDirectory) {
                System.out.println("Указанный путь не существует или является путём к папке, а не к файлу.");
                continue;
            } else {
                FileCount++;

                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + FileCount);
            }
        }
    }
}
