package exercise;

import java.io.*;
import java.util.List;

public class MyFile {
    public static List<Integer> read(List<Integer> list,String path) throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader(path));
        String line;
        while ((line = readFile.readLine()) != null){
            list.add(Integer.parseInt(line));
        }
        readFile.close();
        return list;
    }

    public static void write(List<Integer> list, String path) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i).toString());
            writer.newLine();
        }
        writer.close();
    }

}
