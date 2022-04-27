package homework;

public class KeypadExample {

	public static void main(String[] args) {
		
		Keypad key = new RPGgame();
		key.leftUpButton();
		key.leftDownButton();
		key.changeMode();
		key.rightUpButton();
		key.rightDownButton();
		key.changeMode();
		key.rightDownButton();
		
		System.out.println("============================");
		
		Keypad key1 = new ArcadeGame();
		key1.leftUpButton();
		key1.rightUpButton();
		key1.leftDownButton();
		key1.changeMode();
		key1.rightUpButton();
		key1.leftUpButton();
		key1.rightDownButton();
			
		
		
		
		
	}
}
