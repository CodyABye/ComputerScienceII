
public class NotesTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//submit code, rubric, and test cases via webhandin
		//assignment 1 discussion slides. Valuable resource
		
		NotesTwoObjectClass dog = new NotesTwoObjectClass();
		dog.setAge(9);
		dog.setName("Fido");
		dog.setColor("Red");
		
		NotesTwoObjectClass dogTwo = new NotesTwoObjectClass("John", "Yellow", 12);
		
		
		System.out.println(dog.toString());
		System.out.println(dogTwo.toString());
	}

}
