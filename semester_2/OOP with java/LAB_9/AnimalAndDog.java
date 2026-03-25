class Animal{
	String name;
	String sound;
	Animal(){}
	Animal(String name){
		this.name = name;
	}
	void setSound(String sound){
		this.sound = "Twinkle Twinkle little star";
	}
}
class Dog extends Animal{
	private String breed;
	Dog(String name,String breed){
		super(name);
		this.breed = breed;
	}
	@Override
	void setSound(String sound){
		super.setSound(sound);
		this.sound = sound;
	}
	void display(){
		System.out.printf("Name of dog: %s\nBreed of dog: %s",name,breed);
	}
}
class Main{
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("puppy","german");
		dog.display();
	}
}