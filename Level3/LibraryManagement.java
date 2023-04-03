package Level3;
import java.util.PriorityQueue;
import java.util.Queue;
public class LibraryManagement {
		    public static void main(String[] args) {
	        Queue<Book> bookQueue = new PriorityQueue<Book>();
	        Book b1 = new Book("Java",101,1000,"Java is Strongly Typed Language");
	        Book b2 = new Book("Python",100,1200,"It is a Machine Learning");
	        Book b3 = new Book("C++",102,1500,"Object Leakage");
	        bookQueue.add(b1);
	        bookQueue.add(b2);
	        bookQueue.add(b3);
	        System.out.println("Book ID"+"Book Name"+"Book Content"+"Book Price");
	        for(Book b:bookQueue)
	        {
	            System.out.println(b.BookID+" "+b.BookName+" "+b.BookContent+" "+b.BookPrice);
	        }
	        bookQueue.remove();
	        System.out.println("\tBook ID"+"Book Name"+"Book Content"+"Book Price");
	        for(Book b:bookQueue)
	        {
	            System.out.println(b.BookID+" "+b.BookName+" "+b.BookContent+" "+b.BookPrice);
	        }


	    }
	}

	class Book  implements Comparable<Book>
	{
	    String BookName ;
	    int BookID;
	    int BookPrice;
	    String BookContent;
	    Book(String BookName,int BookID,int BookPrice,String BookContent)
	    {
	        this.BookName=BookName;
	        this.BookID=BookID;
	        this.BookPrice=BookPrice;
	        this.BookContent=BookContent;
	    }

	    public int compareTo(Book b) {
	        if(BookID>b.BookID){
	            return -1;
	        }else if(BookID<b.BookID){
	            return 1;
	        }else{
	            return 0;
	        }
	    }
	}

