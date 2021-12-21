package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("도로헤도로1");
		bookQueue.enQueue("도로헤도로2");
		bookQueue.enQueue("도로헤도로3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
	
}
