import java.io.*;

class Book{
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;
    

    public Book(String bookName, String isbnNumber,String authorName, String publisher){
        this.bookName=bookName;
        this.isbnNumber=isbnNumber;
        this.authorName=authorName;
        this.publisher=publisher;
    }
    
    public void setbookName(String bookName){
        this.bookName=bookName;
    }
    public void setisbnNumber(String isbnNumber){
        this.isbnNumber=isbnNumber;
    }
    public void setauthorName(String authorName){
        this.authorName=authorName;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    
    
    
    public String getbookName (){
        return bookName;
    }
    public String getisbnNumber (){
        return isbnNumber;
    }
    public String getauthorName (){
        return authorName;
    }
    public String getpublisher (){
        return publisher;
    }
    
    
    
    public void changebookName(String bName){
        this.bookName=bName;
    }
    public void changeisbnNumber(String iSBNNumber){
        this.isbnNumber=iSBNNumber;
    }
    public void changeauthorName(String aName){
        this.authorName=aName;
    }
    public void changepublisher(String chgdpublisher){
        this.publisher=chgdpublisher;
    }
    
    public String getBookInfo(){
        String val="Book Name is "+this.bookName+","+"ISBN nunber is "+this.isbnNumber+","+"Author Name is "+this.authorName+","+"Publisher is "+this.publisher+".";
        return val;   
    }
    



         public static void main(String []args){
             Book BookTest[] = new Book[30];
             BookTest[0]= new Book("java","18937jkd","name1","name2");
             BookTest[0].changeauthorName("name3");
             System.out.println(BookTest[0].getBookInfo());
         }
}