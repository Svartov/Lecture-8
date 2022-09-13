// Подключаем библиотеки.
import  java.util.Arrays;
import  java.io.File;
import  java.io.PrintWriter;
import  java.io.IOException;
import  java.util.Random;

public class ToArrays {

    public static int[][] randomArray(int twoDimArray[][]){
        Random rn = new Random(); // Подключаем рандомные цифры.
        for(int i = 0; i < twoDimArray.length; i++){
            for(int j = 0; j < twoDimArray.length; j++){
                twoDimArray[i][j] = rn.nextInt(123);
            }
        }
        return twoDimArray;
    }

    public static int[][] showArray(int twoDimArray[][], File file){
        try(PrintWriter pw = new PrintWriter(file)) {
            for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам
                for (int j = 0; j < twoDimArray.length; j++) {//идём по столбцам
                    pw.print(" " + twoDimArray[i][j] + " "); //вывод элемента
                }
               pw.println();//перенос строки ради визуального сохранения табличной формы
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return twoDimArray;
    }


    public static void main(String[] args) {

        int[][] twoDimArray = new int[5][5]; // Создаём двухмерный массив.
        File file = new File("toarray.txt");

        randomArray(twoDimArray);

        showArray(twoDimArray, file);
    }
}