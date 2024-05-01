package lesson15;

import java.io.*;
import java.nio.channels.FileChannel;

public class CopyWithTransferTo implements CopyUtils {

    @Override
    public void copy(String from, String to) throws IOException {
        File fileFrom = new File(from);
        File fileTo = new File(to);
        FileInputStream inStream = null;

        inStream = new FileInputStream(fileFrom);

        FileOutputStream outStream = null;

        outStream = new FileOutputStream(fileTo);

        FileChannel inChannel = inStream.getChannel();
        FileChannel outChannel = outStream.getChannel();

        inChannel.transferTo(0, inChannel.size(), outChannel);

        inStream.close();

        outStream.close();
    }
}

