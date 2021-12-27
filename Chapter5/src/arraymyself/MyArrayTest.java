package arraymyself;

public class MyArrayTest {
	public static void main(String[] args) {
		System.out.println("int[] array = {10, 50, 20, 30} 생성");
		MyArray array = new MyArray();
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1, 50);
		array.printAll();
		
		System.out.println("\n*array[1] 제거");
		array.removeElement(1);
		array.printAll();
			
		System.out.println("\n*70을 추가");
		array.addElement(70);
		array.printAll();
		
		System.out.println("\n*array[1] 제거");
		array.removeElement(1);
		array.printAll();
		
		System.out.println("\n*array[2]출력");
		System.out.println(array.getElement(2));
		
		System.out.println("\n*모든 요소 제거");
		array.removeAll();
		array.printAll(); 
	}
}
