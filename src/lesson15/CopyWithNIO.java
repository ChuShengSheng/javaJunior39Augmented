package lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithNIO implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        Path sourcePath = Paths.get(from);
        Path destPath = Paths.get(to);

        Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
    }
}
