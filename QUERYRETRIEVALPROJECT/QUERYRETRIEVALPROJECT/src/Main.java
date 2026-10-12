import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArticleRepository repository = new ArticleRepository();

    CorpusLoader.loadCorpus("path/to/corpus/folder", repository);
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your search query: ");
        String query = scanner.nextLine();

        ArrayList<Article> results = QueryProcessor.search(query, repository);

        if (results.isEmpty()) {
            System.out.println("No articles found for the query: " + query);
        } else {
            System.out.println("Articles found for the query: " + query);
            for (Article article : results) {
                System.out.println("Title: " + article.getTitle());
                System.out.println("Content: " + article.getContent());
                System.out.println("-------------------------");
            }
        }

        scanner.close();
    }
}
