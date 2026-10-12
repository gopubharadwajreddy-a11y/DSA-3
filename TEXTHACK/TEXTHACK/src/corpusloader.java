import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class corpusloader {

    public static void loadArticles(String folderPath,
                                    Articlerepository repository)
            throws IOException {

        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        if (files == null)
            return;

        for (File file : files) {

            if (file.getName().endsWith(".txt")) {

                String content = Files.readString(file.toPath());

                Article article = new Article(file.getName(), content);

                repository.addArticle(article);
            }
        }
    }
}