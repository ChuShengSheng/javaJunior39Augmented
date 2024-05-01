package lesson17.threads;

import lesson15.CopyWithCommonIO;
import lesson15.CopyWithGuava;
import lesson15.CopyWithOneByte;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyFileTaskImpl("C:\\Users\\Admin\\Downloads\\Screenshot_20230912-120224_Video Player.jpg", "D:\\Avenue\\COPY\\1.jpg");
        CopyFileTask task2 = new CopyFileTaskImpl("D:\\Avenue\\Презентации\\IMG_20231007_203719_530.jpg","D:\\Avenue\\COPY\\2.jpg");
        CopyFileTask task3 = new CopyFileTaskImpl("D:\\Avenue\\Lection_Collections.ppt","D:\\Avenue\\COPY\\3.ppt");
        CopyFileTask task4 = new CopyFileTaskImpl("D:\\Avenue\\Сторонние библиотеки\\guava-32.1.3-jre.jar","D:\\Avenue\\COPY\\4.jar");
        task1.setFileCopyUtils(new CopyWithOneByte());
        task2.setFileCopyUtils(new CopyWithGuava());
        task3.setFileCopyUtils(new CopyWithCommonIO());
        task4.setFileCopyUtils(new CopyWithCommonIO());

        Task task5 = new FindFilesTaskImpl("C:\\Users\\Admin\\Downloads\\Telegram Desktop","java", System.out);
        Task task6 = new FindFilesTaskImpl("C:\\Users\\Admin\\Downloads","jar", System.out);
        Task task7 = new FindFilesTaskImpl("C:\\Users\\Admin\\Downloaaaads","jar", System.out);
        Task task8 = new FindFilesTaskImpl("C:\\Users\\Admin\\Downloads","jpg", System.out);

        TasksStorage storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task7);
        storage.add(task8);
        storage.add(task2);

        storage.add(task3);
        storage.add(task5);
        storage.add(task4);
        storage.add(task6);

        TaskExecutor executor1 = new TaskExecutorImpl();
        TaskExecutor executor2 = new TaskExecutorImpl();
        TaskExecutor executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}
