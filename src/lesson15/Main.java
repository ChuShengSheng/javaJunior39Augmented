package lesson15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Main {

    public static void main(String[] args) {
        try {

            // полный путь
            // относительный путь
            
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Avenue\\Презентации\\Lection_IO (6).pdf"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("qwerty.pdf"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }

            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
