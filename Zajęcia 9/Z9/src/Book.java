import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private ArrayList<Double>reviews;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public ArrayList<Double> getReviews() {
        return reviews;
    }
    public void addReview(double review){
        reviews.add(review);
    }
    public void removeReview(double review){
        reviews.remove(review);
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" +
                author + '\'' + ", reviews=" + reviews + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(reviews, book.reviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, reviews);
    }
}
