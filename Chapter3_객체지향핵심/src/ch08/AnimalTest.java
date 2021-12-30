package ch08;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("이동한다");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("두 발로 이동한다");
	}

	public void read() {
		System.out.println("문자를 읽는다");
	}
}

class Lion extends Animal {
	@Override
	public void move() {
		System.out.println("네 발로 이동한다");
	}

	public void hunt() {
		System.out.println("사슴을 사냥한다");
	}
}

class Deer extends Animal {
	@Override
	public void move() {
		System.out.println("네 발로 이동한다");
	}

	public void runAway() {
		System.out.println("사자에게서 도망간다");
	}
}

public class AnimalTest {
	public static void main(String[] args) {

		// System.out.println("==매개변수를 상위클래스로 만들어서 하위클래스를 대입할 수 있다.==");
		Animal human = new Human();
		Animal lion = new Lion();
		Animal deer = new Deer();

		AnimalTest test = new AnimalTest();

//		  test.moveAnimal(human); test.moveAnimal(lion); test.moveAnimal(deer);

		// 메서드 매개변수를 상위클래스로 만들어서 하위클래스를 넣어서 다형성을 구현
		// 상위클래스로 하위클래스를 핸들링할 수 있다 = 클래스간 결합도가 높아진다
		// 위에선 animal상위클래스로 human등 하위클래스를 사용

		
//		  System.out.println("\r==하위클래스에서만 선언된 메서드를 사용하려면 형변환해야 한다.=="); Human teacher
//		  = (Human) human; teacher.read();
		 

		// System.out.println("\r==상위클래스의 ArrayList를 만들면 하위클래스들로 채울 수 있다==");
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(human);
		animalList.add(lion);
		animalList.add(deer);

		/*
		 * for(Animal animal : animalList) { animal.move(); }
		 */
		test.testDownCasting(animalList);

	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public void testDownCasting(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.read();
			} else if (animal instanceof Lion) {
				Lion lion = (Lion) animal;
				lion.hunt();
			} else if (animal instanceof Deer) {
				Deer deer = (Deer) animal;
				deer.runAway();
			} else {
				System.out.println("Animal하위클래스에 해당되지 않음");
			}

		}
	}
}
