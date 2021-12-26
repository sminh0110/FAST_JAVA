package arrayprac;

public class MyArray {
	int[] intArr; //배열
	int count;    //요소가 얼마나 들어갔는지 카운트
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999;
	
	public MyArray(){ //매개변수가 없으면 크기가 10인 배열을 만든다
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) { //크기를 받아서 생성할 수 있다
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) { //요소를 추가
		if(count >= ARRAY_SIZE) { //요소가 꽉차면 크기를 바꿀 수 없음
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num; //요소를 추가하면 count++
	}
	
	public void insertElement(int position, int num) {
		int i;
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		if(position < 0 || position >count) {
			System.out.println("Insert Error");
			return;
		}
		for( i=count-1; i>=position; i--) {
			intArr[i+1] = intArr[i];
		}
		
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		if(isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		if(position < 0 || position>=count) {
			System.out.println("remove Error");
			return ret;
		}
		ret = intArr[position];
		for(int i =position; i <count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() { //배열에 값이 없으면 true를 반환하는 메서드
		if(count==0) {
			return true;
		}
		else return false;
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없음");
			return;
		}
		for(int i=0; i<count; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	
	public void removeAll() {
		for(int i: intArr) {
			i = 0;
		}
		count = 0;
	}
}
