/**
 * Created by Reaz on 20-Sep-15.
 */
public class testbook {
    public static void main(String[] args) {
        author schildt = new author("Herbert Schildt", "herbert@schildt.com");
        System.out.println(schildt.getName() + " at " + schildt.getEmail());

        author bjarne = new author("Bjarne Stroustrup");
        bjarne.setEmail("bjarne@bjarne.com");
        bjarne.print();

        book b1 = new book("Teach Yourself C++", schildt);
        b1.setPrice(150.5);
        b1.setStock(50);
        System.out.println("author: " + b1.getauthorName() + " Name: " + b1.getName() + " Price: " + b1.getPrice() + " Stock: " + b1.getStock());
        b1.borrowbook(20);
        b1.returnbook(10);
        System.out.println("author: " + b1.getauthorName() + " Name: " + b1.getName() + " Price: " + b1.getPrice() + " Stock: " + b1.getStock());

        book b2 = new book("The C++ Programming Language", bjarne, 200, 20);
        b2.print();
        b2.returnbook(10);
        b2.borrowbook(50);
        b2.print();

        b1.getauthor().print();
        b2.getauthor().print();
    }
}