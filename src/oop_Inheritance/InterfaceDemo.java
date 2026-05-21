package oop_Inheritance;

interface camera{
	void takePhoto();
}

interface musicPlayer{
	void playMusic();
}


class smartphone implements camera, musicPlayer{ // to use multiple interface we need to use implements keyword and separate them with comma

	public void takePhoto() {
		System.out.println("Taking a photo...");
	}

	public void playMusic() {
		System.out.println("Playing music...");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		smartphone myPhone = new smartphone();
		
		myPhone.takePhoto();
		
		myPhone.playMusic();
		

	}

}
