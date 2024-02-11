package edu.hogwarts.data;

public class TextBook extends TeachingMaterial {

  private String title;
  private String author;
  private String publisher;
  private int publishedYear;

  public TextBook(
    String title,
    String author,
    String publisher,
    int publishedYear,
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    super(name, onShoppingList, required, provided, notes);
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.publishedYear = publishedYear;
  }

  public TextBook() {}

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getPublisher() {
    return publisher;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setPublishedYear(int publishedYear) {
    this.publishedYear = publishedYear;
  }

  public String toString() {
    return (
      "title: " +
      title +
      " author: " +
      author +
      " publisher: " +
      publisher +
      " publishedYear: " +
      publishedYear +
      " Name: " +
      getName() +
      " On shopping list: " +
      isOnShoppingList() +
      " Required: " +
      isRequired() +
      " Provided: " +
      isProvided() +
      " Notes: " +
      getNotes()
    );
  }
}
