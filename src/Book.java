public class Book {
    private int Number;
    public String Author;
    public String Title;
    public float Price;

    private Book(){
        this.Number = 1;
        this.Author = "Vazov";
        this.Title = "Pod igoto";
        this.Price = 26;

    }

    public Book(int number, String author, String title, float price) {
        Number = number;
        Author = author;
        Title = title;
        Price = price;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Number=" + Number +
                ", Author='" + Author + '\'' +
                ", Title='" + Title + '\'' +
                ", Price=" + Price +
                '}';
    }
}
