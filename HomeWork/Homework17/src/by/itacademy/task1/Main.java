package by.itacademy.task1;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, ArrayList<String>> filesMap = new HashMap();

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            File dir = new File(args[i]);
            fileSearcher(dir);
        }
        XmlCreator creator = new XmlCreator();
        creator.create(filesMap);
    }

    public static void fileSearcher(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                fileSearcher(file);
            } else {
                addFile(file);
            }
        }
    }

    public static void addFile(File file) {
        String ext = null;
        String s = file.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }

        if (filesMap.get(ext) == null) {
            ArrayList<String> files = new ArrayList<>();
            files.add(file.getName());
            filesMap.put(ext, files);
        } else {
            filesMap.get(ext).add(file.getName());
        }
    }
}
