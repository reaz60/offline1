/**
 * Created by Reaz on 20-Sep-15.
 */
public class book {
    private String name;
    private  author author;
    private double price;
    private int stock;

    public book(String name,   author author) {
        this.name = name;
        this.author = author;
    }


    public void setPrice(double price){
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public String getauthorName(){
        return this.author.getName();
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public void borrowbook(int amount){
        if (amount>stock) System.out.println("Borrowing amount exceeds the current stock!");
        else stock-=amount;
    }
    public void returnbook(int amount){
        this.stock+=amount;
    }
    public book(String name,  author author,double price,int stock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }
    public void print(){
        System.out.println( "author: "+ this.getauthorName()+" Name: "+name+" Price: "+price+" Stock: "+stock);
    }
    public String getName(){
        return name;
    }
    public  author getauthor(){
        return author;
    }

}