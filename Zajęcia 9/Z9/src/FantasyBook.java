import java.util.Objects;

public class FantasyBook extends Book {
    private String fantasySub;
     public FantasyBook(String title, String author, String fantazySubgenre) {
         super(title, author);
         this.fantasySub = fantazySubgenre;
     }
     public void setFantasySub(String fantasySub) {
         this.fantasySub = fantasySub;
     }

     @Override
    public String toString() {
         return "FantasyBook{" + "title='" + getTitle() + '\''
                 + ", author='" + getAuthor() + '\''
                 + ", reviews=" + getReviews() +
                 ", fantazySubgenre='" + fantasySub + '\'' + '}';
     }

     @Override
    public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof FantasyBook)) return false;
         if (!super.equals(o)) return false;
         FantasyBook that = (FantasyBook) o;
         return Objects.equals(fantasySub, that.fantasySub);
     }

     @Override
    public int hashCode() {
         return Objects.hash(super.hashCode(), fantasySub);
     }
}
