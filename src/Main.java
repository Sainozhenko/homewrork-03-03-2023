import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      //Задача 1
        //Написать метод, читающий текстовый файл и возвращающий строку,
        // состояшую из всех прочитанных строчек.
        //Пример: В файле имеется
        //aaa
        //bbbb
        //cc
        //Метод вернет aaa bbbb cc
        System.out.println( readFile("file.txt"));
    }
    public static String readFile(String file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine())!= null) {
                stringBuilder.append(line+" ");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.getMessage();
        }
        return null;
    }
}