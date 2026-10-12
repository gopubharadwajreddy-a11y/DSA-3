
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CorpusLoader {

    public static void loadCorpus(String folderPath, ArticleRepository repository) {
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Corpus folder not found or is not a directory.");
            return;
        }

        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the corpus folder.");
            return;
        }

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try {
                    String content = Files.readString(file.toPath());
                    Article article = new Article(file.getName(), content);
                    repository.addArticle(article);
                } catch (IOException e) {
                    System.out.println("Error reading file: " + file.getName());
                    e.printStackTrace();
                }
            }
        }
    }
}
