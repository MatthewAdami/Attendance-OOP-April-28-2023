package Attendance2;

public class ElectronicBook {
	private String title;
    private String author;
    private int copiesAvailable;

    public ElectronicBook(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void rentBook() {
        copiesAvailable--;
    }
}