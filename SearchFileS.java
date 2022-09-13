// Подключаем библиотеки
import java.io.File;
import java.util.Scanner;


public class SearchFileS {

    public  static void  searFile(File workFolder){ // Данный метод будет искать в нашем запросе папки и файлы
        File[] folder = workFolder.listFiles();
        String type = "";
        for (File file : folder) {
            type = "File";
            long fileSize = file.length();
            if (file.isDirectory()) {
                type = "Folder";
            }
            if(type.equals("Folder")){
                System.out.println(file + "\t" + type + "\t" + fileSize);
            }else{
                System.out.println("Folder not found!");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String wont = "";

        System.out.print("Введите адресс для поиска: ");
        wont = in.nextLine();

        File workFolder = new File(wont);

        searFile(workFolder);

    }

}