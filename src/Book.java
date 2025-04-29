public class Book {

    public String title;
    public int pages;
    public boolean available;

    // default constructor 
    public Book() {
        this.title = "title";
        this.pages = 200;
        this.available = true;
    }

    public Book(String title, int pages, boolean available){
        this.title = title;
        this.pages = pages;
        this.available = available;
    }

    public void show() {
        
        String status;

        if(available == true) {
            status = "Yes";        
        } else {
            status = "No";
        }

        System.out.println(title + ", " + pages + " pages, available: " + status);
    }
}
