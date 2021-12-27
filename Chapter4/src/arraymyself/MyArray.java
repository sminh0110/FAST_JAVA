package arraymyself;

public class MyArray {
	int[] intArr;
	int count;
	public int ARRAY_SIZE;
	
	public MyArray() {
	//크기가 10인 배열을 만든다
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
		count = 0;
	}
	
	public void addElement(int num) {
	//요소 맨뒤에 num을 넣고 count++
		if(count==ARRAY_SIZE-1) {
			System.out.println("메모리 부족");
			return;
		}
		intArr[count++] = num;
	}
	 
	public void insertElement(int position, int num) {
	//intArr[count-1]부터 intArr[position]까지 앞으로 한칸씩 밀고 intArr[position]에 num 대입
		if(count==ARRAY_SIZE-1) {
			System.out.println("메모리 부족");
			return;
		}
		if(position<0|| position>=ARRAY_SIZE) {
			System.out.println("잘못된 인덱스 (정상인덱스: 0-"+(ARRAY_SIZE-1)+")");
			return;
		}
		for(int i=count-1; i>=position; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	
	public void removeElement(int position) {
	//intArr[count-1]부터 intArr[position]까지 앞으로 한칸씩 당김
		if(position<0|| position>=ARRAY_SIZE) {
			System.out.println("잘못된 인덱스 (정상인덱스: 0-"+(ARRAY_SIZE-1)+")");
			return;
		}
		for(int i=position; i<count; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
	}
	
	public int getSize() {
	//count반환
		return count;
	}
	
	public boolean isEmpty() {
	//비어 있으면 true반환
		if(count==0) return true;
		else return false;
	}
	
	public int getElement(int position) {
		if(position<0|| position>=ARRAY_SIZE) {
			System.out.println("잘못된 인덱스 (정상인덱스: 0-"+(ARRAY_SIZE-1)+")");
		}
		return intArr[position];
	}
	
	public void printAll() {
		System.out.println("===");
		for(int i: intArr) {
			System.out.print(i+" ");
		}
		System.out.println("\n===");
	}
	
	public void removeAll() {
		for(int i=0; i<count; i++) {
			intArr[i] = 0;
		}
	}
}
