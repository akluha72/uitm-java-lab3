public class Library {
    public static void main(String[] args) {
        System.out.println("\n");
        Book item1 = new Book("To Kill a Mockingbird", 120, true);
        Book item2 = new Book("The Fellowship of the ring", 200, false);

        Novel novel1 = new Novel("lutfi", "self-help", "The subtle art of not giving a fuck", 432, true );

        // System.out.println(title + " (Novel, " + issueNumber + "), " + pages + " pages, month published" + monthPublication + " available " + available);

        // Magazine mag1 = new Magazine("lutfi"  );
        Magazine mag1 = new Magazine("Lutfi Monthly", 50, true, 12, "April");


        item1.show();
        item2.show();
        novel1.show();
        mag1.show();
    }
}
