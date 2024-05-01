package lesson15;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        long time1 = System.currentTimeMillis();
        copyWithOneByte.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test1.ppt");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2 - time1));

        CopyWithGuava copyWithGuava = new CopyWithGuava();
        long time3 = System.currentTimeMillis();
        copyWithGuava.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test2.ppt");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Guava: " + (time4 - time3));

        CopyWithCommonIO copyWithCommonIO = new CopyWithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWithCommonIO.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test3.ppt");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Apache CommonIO: " + (time6 - time5));

        CopyWithNIO copyWithNIO = new CopyWithNIO();
        long time7 = System.currentTimeMillis();
        copyWithNIO.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test4.ppt");
        long time8 = System.currentTimeMillis();
        System.out.println("Копирование с помощью NIO: " + (time8 - time7));

        CopyWithTransferTo copyWithTransferTo = new CopyWithTransferTo();
        long time9 = System.currentTimeMillis();
        copyWithTransferTo.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test5.ppt");
        long time10 = System.currentTimeMillis();
        System.out.println("Копирование с помощью FileChannel TransferTo: " + (time10 - time9));

        CopyWithFileInputStreamAndFileOutputStream copyWithFileInputStreamAndFileOutputStream = new CopyWithFileInputStreamAndFileOutputStream();
        long time11 = System.currentTimeMillis();
        copyWithFileInputStreamAndFileOutputStream.copy("D:\\Avenue\\Презентации\\Lection_Collections.ppt","test6.ppt");
        long time12 = System.currentTimeMillis();
        System.out.println("Копирование с помощью FileInputStream и FileOutputStream: " + (time12 - time11));
    }
}
