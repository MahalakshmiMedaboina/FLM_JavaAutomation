package oop_abstraction;

interface Playback {
	void Play();  // abstract method
}

//parent class

class Media{
	String title = "Media";
	
	void displayInfo() {
		System.out.println("Title: " + title);
	}
}

class VideoPlayer extends Media implements Playback{ // child class that extends Media and implements Playback

	@Override
	public void Play() {
		System.out.println("Playing video...");
	}
}

public class SameClassExtendsImplements {

	public static void main(String[] args) {
		
		VideoPlayer myPlayer = new VideoPlayer();
		myPlayer.displayInfo(); // Inherited method from Media class
		myPlayer.Play(); // Implemented method from Playback interface

	}

}
