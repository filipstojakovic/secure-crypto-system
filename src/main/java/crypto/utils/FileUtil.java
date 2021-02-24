package crypto.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil
{
    public static File getFileIfExists(String input)
    {
        File file = new File(input);
        return (file.exists() && file.isFile()) ? file : null;
    }

    public static File createFileIfNeeded(String path)
    {
        try
        {
            if (Files.notExists(Paths.get(path)))
                Files.createFile(Paths.get(path));

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        return new File(path);
    }
}
