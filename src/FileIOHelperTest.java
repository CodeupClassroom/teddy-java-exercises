import util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class FileIOHelperTest {

    public static void main(String[] args) {

        String filePath = "src/util/tester.txt";

        // test slurp()
//            List<String> results = FileHelper.slurp(filePath);
//            System.out.println(results);


        // test spit()

//            List<String> testEntries = new ArrayList<>();
//            testEntries.add("entry_a");
//            testEntries.add("entry_b");
//            testEntries.add("entry_c");
//            FileHelper.spit(filePath, testEntries);
//
//            List<String> results = FileHelper.slurp(filePath);
//            System.out.println(results);

//            List<String> testEntries = new ArrayList<>();
//            testEntries.add("entry_d");
//            testEntries.add("entry_e");
//            FileHelper.spit(filePath, testEntries, true);
//
//            List<String> results = FileHelper.slurp(filePath);
//            System.out.println(results);


        // test makeExciting()
            FileHelper.makeExciting(filePath);
            List<String> results = FileHelper.slurp(filePath);
            System.out.println(results);

    }

}
