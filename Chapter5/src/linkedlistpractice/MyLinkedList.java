package linkedlistpractice;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode tempNode = head;
			while(tempNode.next != null) //(tempNode.next!=null)인 동안 반복
				tempNode = tempNode.next;
			tempNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position<0 || position>count) {
			System.out.println("현재 리스트개수는 "+count+"개 이므로 수정바랍니다.");
			return null;
		}
		
		if(position==0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("현재 리스트개수는 "+count+"개 이므로 수정바랍니다.");
			return null;
		}
		if(position == 0) {
			head = tempNode.next;
		}
		else {
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position+"번째 요소 삭제");
		return tempNode;
	}
	
	public String getElement(int position) {
		int i;
		MyListNode tempNode = head;
		if(position >= count) {
			System.out.println("현재 리스트개수는 "+count+"개 이므로 수정바랍니다.");
			return null;
		}
		if(position == 0) {
			return head.getData();
		}
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode.getData();
	}
	
	public MyListNode getNode(int position) {
		int i;
		MyListNode tempNode = head;
		if(position >= count) {
			System.out.println("현재 리스트개수는 "+count+"개 이므로 수정바랍니다.");
			return null;
		}
		if(position == 0) {
			return head;
		}
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if(count == 0){
			System.out.println("출력할 내용이 없음");
			return;
		}
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
}
