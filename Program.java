// Подключаем библиотеки
import java.io.File; // Возможность создания файла
import java.io.IOException; // Возможность проверки
import java.util.Scanner; // Возможность ввода с клавиатуры
import java.io.PrintWriter; // Возможность записывать в файл

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Подключаем ввод текста.

        int size = 0; // Переменная через неё узнаём сколько у нас строк.
        String text = ""; // В данной переменной будем хранить наш текст.
        String nameF = "";

        System.out.print("Enter file name: "); // Просим указать имя файла.
        nameF = in.nextLine(); // Записываем имя файла.

        System.out.print("Enter line size: "); // Узнаём размер записанного текста.
        size = in.nextInt(); // Записываем сколько будет строк

        File file = new File( nameF + ".txt"); // Создаём новый файл.
        saveTextToFile(file, text, size); // Сохраняем в файл.
    }

    public static void saveTextToFile(File file, String text, int size) {
        Scanner in = new Scanner(System.in); // Подключаем ввод текста.

        try (PrintWriter pw = new PrintWriter(file)) {
            for(int i = 0; i < size; i++){
                System.out.print("Enter line text " + i + " : "); // Просим ввести текст на строку.
                text = in.nextLine(); // Записываем текст в переменную.
                pw.println(text); // Записываем переменную в текствый файл.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}