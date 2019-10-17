import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameListService {

    public static String[] getAllNames(){
        List<String> result = null;
        try (Stream<String> lines = Files.lines(Paths.get("resources/names.txt"))) {
            result = lines.collect(Collectors.toList());
        }catch (IOException e) {
            e.printStackTrace();
            System.err.print("El archivo no se pudo leer");
        }
        return result.stream().toArray(n -> new String[n]);
    }

}
