/*
NAME: Carter Brezinski
SID: 200391111
DATE: 10/3/2019
ASSIGNMENT: Lab2 - phase1
*/

public class ListElement
{

	private ListElement next;
	private int data;

	public ListElement()
	{
		this.data = 0;
		this.next = null;
		//this.previous = null;
	}

	//Set the value in the linked list 
	public void setData(int data)
	{
		this.data = data;
	}

	public int getData(int data)
	{
		return this.data;
	}

	//this is acting as the getElement
	//Return the value in the linked list at a specific index
	public ListElement retrieve(int index)
	{
		ListElement nextObject;
		ListElement pointer = this;
		ListElement nextPointer = this;
		int counter = 0;
		int countNodes = 0;

		//The purpose of this counter is to count how many 
		//nodes are present in the linked list, this will
		//be used for comparison in the next if statement.
	while(nextPointer.next != null)
		{
			countNodes++;
			nextObject = nextPointer.next;
			nextPointer = nextObject;
		}

	if(index > countNodes)
		{
			//If the counter that checks through the length of the 
			//Linked list is less than the index entered
			//it will return this out of scope message.
			System.out.println("Index is out of scope.");
			return null;
		}		
	else
		{
			while(counter < index)
			{
				//counts up to the position
				//Then proceeds to take the data
				counter++;
				nextObject = pointer.next;
				pointer = nextObject;
			}
			return nextPointer;
		}

	}

	public ListElement remove(int index)
	{
		//if the head, the next in list will become the head	
		//if the tail, the one before it will become the tail
		//if in the center, you'll have to link the two on either end
		ListElement nextObject = this;
		ListElement pointer = this;
		int counter = 0;
		int counter2 = 0;
		
		if(index == 0)
		{
			//assign pointer to the next position in the list
			//return that pointer
			pointer = this.next;
			return pointer;
		}
		//The purpose of this is to never actually delete a node
		//In the linked list, just to stop pointing to it in the list.
		else
		{
			//while the counter is less than the index it will
			//work towards both ends of the index point, so it can join the gap after
			//'removing' the node (it never actually removes the node.)
			while (counter < index)
			{
				counter++;
				pointer = pointer.next;
				nextObject = pointer.next;
			}
			//reset the pointer and move to before the positioning
			pointer = this;
			while (counter2 < index-1)
			{
				counter2++;
				pointer = pointer.next;
			}
			//merge together.
			pointer.next = nextObject;
		}
		return this;
	}

	public void addElement(ListElement le)
	{	
		//Traverse all the way to the tail, then adds:
		ListElement pointer = this;

		//if the next position is null, then set the next position as 
		//the given ListElement.
		if (this.next == null)
		{
			this.next = le;
		}
		else
		{
			//otherwise it will step through the list until it hits that point.
			while (pointer.next != null)
			{
			ListElement nextObject = pointer.next;
			pointer = nextObject;
			}
		pointer.next = le;
		}
	}
	
	//This will go through the necessary steps to print any linked list length.
	public void printList()
	{
		//set the current linked list to the pointer ListElement.
		ListElement pointer = this;

		//while the next value isnt the end of the linked list
		//it will print the current data value and set the pointer to the 
		//next available object.
		while(pointer.next != null)
		{
			System.out.println(pointer.data);
			ListElement nextObject = pointer.next;
			pointer = nextObject;
		}
		//if the next value is null then it will print the current data and finish printing
		if(pointer.next == null)
		{
			System.out.println(pointer.data);
		}
	}
}
