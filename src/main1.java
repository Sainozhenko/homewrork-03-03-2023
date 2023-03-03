import java.io.*;

public class main1 {
    public static void main(String[] args) throws Exception {
        //Задача 1
        //Написать метод, читающий текстовый файл и возвращающий строку,
        // состояшую из всех прочитанных строчек.
        //Пример: В файле имеется
        //aaa
        //bbbb
        //cc
        //Метод вернет aaa bbbb cc
        System.out.println(readTextFile("file.txt"+" "));
    }

    public static String readTextFile(String file)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line ;
        String str = new String();
        while ((line = br.readLine())!=null) {
          str =str + line+" ";
        }
        return str;

    }

}