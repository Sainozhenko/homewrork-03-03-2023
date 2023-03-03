import java.io.*;

public class main1 {
    public static void main(String[] args) {
        //Задача 1
        //Написать метод, читающий текстовый файл и возвращающий строку,
        // состояшую из всех прочитанных строчек.
        //Пример: В файле имеется
        //aaa
        //bbbb
        //cc
        //Метод вернет aaa bbbb cc
        System.out.println(readTextFile("file.txt" + " "));
    }

    public static String readTextFile(String file) {
        String str = null;
        try (
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            str = new String();
            while ((line = br.readLine()) != null) {
                str = str + line + " ";
            }

        } catch (Exception e) {
            e.getMessage();
        }
        return str;
    }
}



