import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("src", "util", "Input.java");
//        System.out.println(path);
//        System.out.println(Files.exists(path));
//        System.out.println(Files.exists(Paths.get(".GITIGNORE")));
//        System.out.println(Files.exists(Paths.get("src", "NonExistant.java")));

        if (Files.notExists(Paths.get("README.md"))) {
            Files.createFile(Paths.get("README.md"));
        }

//        ArrayList<String> readmeContents = new ArrayList<>();
//        readmeContents.add("# Teddy Java Exercises");
//        readmeContents.add("");
//        readmeContents.add("This is the repository for the teddy cohort's java exercises.");
//
//        Files.write(
//            Paths.get("README.md"),
//            readmeContents,
//            StandardOpenOption.APPEND
//        );
//
//        System.out.println("Wrote lines to README.md");

//        // File will be created if it doesn't exist
//        Files.write(
//            Paths.get("another-file.md"),
//            Arrays.asList("some content")
//        );

//        List<String> bobClass = Files.readAllLines(Paths.get("src", "Bob.java"));
//        // add line numbers to the Bob.java file
//        for(int i = 0 ; i < bobClass.size() ; ++i) {
//            String line = bobClass.get(i);
//            System.out.printf("%s: %s\n", i + 1, line);
//        }

        // transform a text file -- create a new file based on another one
        // Create a new class that lowercases all the lines in a file
        List<String> readme = Files.readAllLines(Paths.get("README.md"));
        ArrayList<String> lowerCasedReadme = new ArrayList<>();
        for (String line : readme) {
            lowerCasedReadme.add(line.toLowerCase());
        }
        Files.write(Paths.get("README-lowercased.md"), lowerCasedReadme);
    }

    public static void slideshowExample() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }
        Files.write(Paths.get("data", "groceries.txt"), newList);
    }
}
