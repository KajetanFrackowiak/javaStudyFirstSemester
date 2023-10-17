package Lab10.Task2;

import java.io.File;

public class DirectoryScanner {
    public File findMostFiles(File baseDir) {
        File[] directories = baseDir.listFiles(File::isDirectory);
        if (directories == null || directories.length == 0) {
            return null;
        }

        int maxFileCount = 0;
        File directoryWithMaxFiles = null;

        for (File directory : directories) {
            int fileCount = countFiles(directory);
            if (fileCount > maxFileCount) {
                    maxFileCount = fileCount;
                    directoryWithMaxFiles = directory;
            }
        }
        return directoryWithMaxFiles;
    }
    public int countFiles(File directory) {
        File[] files = directory.listFiles();
        if (files == null) {
            return 0;
        }

        int count = 0;
        for (File file : files) {
            if (file.isFile()) {
                count++;
            } else if (file.isDirectory()) {
                count += countFiles(file);
            }
        }
        return count;
    }
}
