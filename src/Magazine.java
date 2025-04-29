class Magazine extends Book {

    int issueNumber;
    String monthPublication;

    public Magazine(){
        super();
        this.issueNumber = 00000;
        this.monthPublication = "undefined";
    }

    public Magazine(String title, int pages, boolean available, int issueNumber, String monthPublication) {
        super(title, pages, available);
        this.issueNumber = issueNumber;
        this.monthPublication = monthPublication;
    }

    @Override
    public void show() {
        System.out.println("MAGAZINES:");
        super.show();
        System.out.println();
        System.out.println(title + " (issue number, " + issueNumber + "), " + pages + " pages, month published" + monthPublication + " available " + available);

    }

}