
public class NotesTwoObjectClass {
	private String name;
	private String color;
	private int age;
	
	public NotesTwoObjectClass() {
		this.name = null;
		this.color = null;
		this.age = 0;
	}

	public NotesTwoObjectClass(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Hello, my name is " + name + ". I am a " + color + " dog, who's " + age + " years old.";
	}
	
	
}
