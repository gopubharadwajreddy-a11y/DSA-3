import java.util.ArrayList;

public class Articlerepository {

    private ArrayList<Article> articles;

    public Articlerepository() {
        articles = new ArrayList<>();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void displayArticles() {

        System.out.println("----------- Article Repository -----------");

        for (Article article : articles) {

            System.out.println("Title : " + article.getTitle());
            System.out.println(article.getContent());

            System.out.println("------------------------------------------");
        }
    }
}