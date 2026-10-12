import java.util.ArrayList;

public class QueryProcessor {

    public static ArrayList<Article> search(String query, ArticleRepository repository) {
        ArrayList<Article> results = new ArrayList<>();

        if (query == null || query.isEmpty()) {
            System.out.println("Query cannot be null or empty.");
            return results;
        }

        query = query.toLowerCase();

        for (Article article : repository.getArticles()) {
            if (article.getContent() != null &&
                article.getContent().toLowerCase().contains(query)) {
                results.add(article);
            }
        }

        return results;
    }
}
