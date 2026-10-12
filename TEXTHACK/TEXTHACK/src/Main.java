import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Articlerepository repository = new Articlerepository();

        corpusloader.loadArticles("../Articles", repository);

        repository.displayArticles();
    }
}