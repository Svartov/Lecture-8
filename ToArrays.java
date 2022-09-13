// Подключаем библиотеки.
import  java.io.File;
import  java.io.PrintWriter;
import  java.io.IOException;
import  java.util.Random;

public class ToArrays {

    public static int[][] randomArray(int twoDimArray[][]){ // Метод который вернёт нам заполненый массив.
        Random rn = new Random(); // Подключаем рандомные цифры.
        for(int i = 0; i < twoDimArray.length; i++){
            for(int j = 0; j < twoDimArray.length; j++){
                twoDimArray[i][j] = rn.nextInt(123); // Заполняем массив максимальным числом 123.
            }
        }
        return twoDimArray; // Возвращае готовый массив.
    }

    public static void showArray(int[][] twoDimArray, File file){ // Данный метод запишет готовый массив в файл.
        try(PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам.
                for (int j = 0; j < twoDimArray.length; j++) {//идём по столбцам.
                    pw.print(" " + twoDimArray[i][j] + " "); //вывод элемента.
                }
               pw.println();//перенос строки ради визуального сохранения табличной формы.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        int[][] twoDimArray = new int[5][5]; // Создаём двухмерный массив.
        File file = new File("toarray.txt");

        randomArray(twoDimArray);

        showArray(twoDimArray, file);
    }
}
