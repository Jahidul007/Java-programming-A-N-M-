



public class TestApp  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author author =new Author("Tamim","tamim@gmail.com","M");
        Book book = new Book("cp",author,250.0,1000.0);
         System.out.println("Name of the book : "+book.getName());
         System.out.println("Name of the Author : "+book.getAuthor().getName());
         System.out.println("Price of the book : "+book.getPrice());
         System.out.println("Available in stock : "+book.getStock());
         
    }

    
}
