class Novel extends Book {
    
    public String author;
    public String genre;

    //default Constructor
    public Novel(){
        super();
        this.author = "undefined";
        this.genre = "undefined";
    }

    //normal Constructor 
    public Novel(String author, String genre, String title, int pages, boolean available){
        super(title, pages, available);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(title + " (Novel, " + genre + "), " + pages + " pages, available " + available);
    }
}