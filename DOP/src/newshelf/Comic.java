package newshelf;

public record Comic(String title, int ageRating) implements IBook<String> {

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(IBook<String> other) {
        // Compare based on the title of the Comic
        return this.title.compareTo(other.getTitle());
    }

    public int ageRating() {
        return ageRating;
    }
}
