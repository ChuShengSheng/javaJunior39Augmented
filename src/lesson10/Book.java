package lesson10;

import java.util.Objects;
public class Book extends PrintEdition{
    private String autor;
    private int pages;

    public Book() {
    }

    public Book(String name, int year, String izdatelstvo, String autor, int pages) {
        super(name, year, izdatelstvo);
        this.autor = autor;
        this.pages = pages;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        return Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return " Книга {" +
                " автор = '" + autor + '\'' +
                ", кол-во страниц = " + pages + super.toString() +
                '}';
    }
}
