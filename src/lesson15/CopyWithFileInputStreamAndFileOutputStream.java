package lesson15;

import java.io.*;
public class CopyWithFileInputStreamAndFileOutputStream implements CopyUtils{
    @Override
    public void copy(String from, String to) throws IOException {
        File fileFrom = new File(from);
        File fileTo = new File(to);

        InputStream input = null;
        OutputStream output = null;


            input = new FileInputStream(fileFrom);
            output = new FileOutputStream(fileTo);
            byte[] buf = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        }
    }

