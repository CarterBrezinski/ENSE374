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
	
	//Retrieve an element from the pre-existing LinkedList named 'ListElement'
	int print1 = object1.getData();
	System.out.println("the value contained inside object1 is: " + print1);
	object2.getData();
	object3.getData();
	object4.getData();
	
	//Add an element onto the pre-existing LinkedList named 'ListElement
	object1.addElement(object2);
	object1.addElement(object3);
	object1.addElement(object4);
	
	//Delete an item from the LinkedList 'ListElement'

	//Print the linked list from head -> tail

	object1.printList();
	}
}