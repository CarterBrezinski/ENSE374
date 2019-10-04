/*
NAME: Carter Brezinski
SID: 200391111
DATE: 10/3/2019
ASSIGNMENT: Lab2 - phase1
*/

public class phase1Test
{
/* 
Processes that need to be achieved in this
main method:
- add a node to the linked list
- retrieve a node from the linked list
- delete a node from the linked list
- print list from head -> tail, since this is only phase 1
*/

	public static void main(String args[])
	{
		
	//The following processes will need to be coded:
	//Creating an object of the class ListElement
	ListElement object1 = new ListElement();
	ListElement object2 = new ListElement();
	ListElement object3 = new ListElement();
	ListElement object4 = new ListElement();
	
	//Give a value to each of the individual objects.
	object1.setData(5);
	object2.setData(10);
	object3.setData(15);
	object4.setData(20);
	
	//Add an element onto the pre-existing LinkedList named 'ListElement
	object1.addElement(object2);
	object1.addElement(object3);
	object1.addElement(object4);

	//Retrieve an element from the pre-existing LinkedList named 'ListElement'
	ListElement retrivalTest = object1.retrieve(2);
	System.out.println("Should print the 20 as it is the third position in the array, ie index 2.\n");
	retrivalTest.printList();
	System.out.println("");
	
	//Delete an item from the LinkedList 'ListElement'
	ListElement newList = object1.remove(2);

	//Print the linked list from head -> tail
	object1.printList();
	System.out.println("");
	System.out.println("If done correctly, the linked list should be printed like the following: 5, 10, 20.\nAs the 15 was removed. ");
	}
}