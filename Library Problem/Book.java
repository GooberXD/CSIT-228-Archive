public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private int copiesAvailable;
    private String status;

    public Book(String title, String author, int yearPublished, int copiesAvailable) {
        this.title = title;
        this.author = author;

        setYearPublished(yearPublished);
        setCopiesAvailable(copiesAvailable);

        this.status = "Available";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        if (title.trim().isEmpty()) {
            System.out.println("Title cannot be empty.");
            return;
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author.trim().isEmpty()) {
            System.out.println("Author cannot be empty.");
            return;
        }
        this.author = author;
    }

    public void setYearPublished(int year) {
        if (year < 1000 || year > 2025) {
            System.out.println("Invalid year. Must be between 1000 and 2025.");
            return;
        }
        this.yearPublished = year;
    }

    public void setCopiesAvailable(int copies) {
        if (copies < 0) {
            System.out.println("Copies cannot be negative.");
            return;
        }
        this.copiesAvailable = copies;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        if (newStatus.equalsIgnoreCase("Available")
                || newStatus.equalsIgnoreCase("Unavailable")) {
            setStatus(newStatus);
        } else {
            System.out.println("Invalid status.");
        }
    }

    public void displayBook() {
        System.out.println("Title           : " + title);
        System.out.println("Author          : " + author);
        System.out.println("Year Published  : " + yearPublished);
        System.out.println("Copies Available: " + copiesAvailable);
        System.out.println("Status          : " + status);
        System.out.println("----------------------------");
    }
}