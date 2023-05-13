import exercise.MyFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        MyFile.read(list, "src/data/dataA.inp");
        MyFile.write(list, "src/data/data.out");
        List<Integer> list1 = new ArrayList<>();
        MyFile.read(list1, "src/data/data.out");
        System.out.println(list1);
    }
}