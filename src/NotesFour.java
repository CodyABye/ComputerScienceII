
public class NotesFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//design document
		//mention issues related to second assignment. Don't mention database et cetera.
		//Write about the classes you'll be using and how they'll be used.
		//create parser objects to read data from flat files.
		//generate instances of application objects.
		//export the objects to an interchange format.
		//project is about reading and writing to files via OOP
		//Electronic data interchange
		//program should be able to read from dat file and export to json and xml files.
		//first identify entities, and design classes based on those entities. Customers, products, and 
		//create separate address class
		
		//first line in products.dat is the number of products
		//; delimited
		//for address, pull string that's delimited by ;, and treat it as , delimited string for each attribute.
		//will be using subclasses for products
		//product superclass. Lease agreements, Sale agreements, parkingpass, and amenity are subclasses.
		//parkingpass extends product, in order to inherit all product methods and attributes.
		
		//design a DataConverter class
		//reads files and writes files.
		//DataConverter class should have a main?
		//FileReaderWriter.zip in assignment 2 discussion is an example.
		//lib folder has .jar files
		//data folder has .dat files
		
		//^^THIS INFORMATION DIRECTLY CONTRIBUTES TO DESIGN FILE^^
		
		//xstream is a java library that will serialize java objects
		//create xstream object XStream xstream = new XStream();
		//the toXML method to write to file
		//xstream.alias("person", Person.class);
		
		//Gson gson = new Gson(); for Json writing
		//for pretty printing Gson gson = newGsonBuilder().setPrettyPrinting().create() check lecture slide
		//organize into packages
		//look at example.
		//sc.hasnext method to go through list with line = sc.nextLine();
		//line.split(";"); ; delimiter split
		//file reader class
		//two file writer classes for json and xml each
		
		
		
		
	}

}
