package java8.MethodReference.ReferenceToAConstructor;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ReferringConstructorWithTheHelpOfFunctionalInterface {
	public static void main(String[] args) {
		Messageable hello= Message::new; 
        hello.getMessage("Hii guys!!");
	}
}
