/**
 * Created by Reaz on 20-Sep-15.
 */
public class author {
    private String name;
    private String email;

    public author(){

    }
    public author(String name,String email){
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public author(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void print(){
        System.out.println(this.name + " at " + this.email);
    }
}
