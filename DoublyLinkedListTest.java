import java.util.Iterator;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		
		// Comment only the test functions you want to run
		
	    //testPrintEmptyListForward();
		// testPrintEmptyListBackward();
		// testEmptyGet();
		// testAddFirstAndGet();
		// testAddFirstForwards();
		// testAddFirstBackwards();
		// testAddLastAndGet();
		// testAddLastForwards();
		// testAddLastBackwards();
		// testIsEmpty();
		// testGetLength();
		// testRemoveFromEmptyList();
		// testRemoveFromListWithOneElementNegative();
		// testRemoveFromListWithOneElementPositive();
		// testRemoveFromListWithTwoElementNegative();
		// testRemoveFromListWithTwoElementPositive();
		// testRemoveFromListWithThreeElementNegative();
		// testRemoveFromListWithThreeElementPositive();
		// testIterator();
		

	}
	
	public static void testPrintEmptyListForward() {
		System.out.println("");
        List<String> list = new DoublyLinkedList<String>();
        list.print();   // should print nothing and NOT crash
	}
	public static void testPrintEmptyListBackward() {
		System.out.println("");
        System.out.println("-------------- testPrintEmptyListBackward ------------:");
        List<String> list = new DoublyLinkedList<String>();
        list.printBackwards();   // should print nothing and NOT crash
        System.out.println("-------------- End testPrintEmptyListBackward ------------:");
	}
	
	public static void testEmptyGet() {
		List<String> list = new DoublyLinkedList<String>();
        System.out.println("The fifth element data in an empty list is " + list.get(5));
	}
	public static void testAddFirstAndGet () {
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut"); 
		list.addFirst("End");
		
		System.out.println("The sixth element should be Apple, and it is: " + list.get(5));
		System.out.println("The fifth element should be Banana, and it is: " + list.get(4));
		System.out.println("The fourth element should be Cherry, and it is: " + list.get(3));
		System.out.println("The second element should be Donut, and it is: " + list.get(1));
		System.out.println("The first element should be End, and it is: " + list.get(0));

		
	}
	
	public static void testAddFirstForwards() {
		System.out.println("");
		System.out.println("-------------- testAppendForwards ------------:");
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut");
		list.addFirst("End");

		System.out.println("You should get the list elements in this order: End, Donut, Donut, Cherry, Banana, Apple");
		list.print();
		System.out.println("--------- End of testAppendForwards -----------:");
	}
	
	public static void testAddFirstBackwards() {
		System.out.println("");
		System.out.println("-------------- testAppendBackwards ------------:");
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addFirst("Apple");
		list.addFirst("Banana");
		list.addFirst("Cherry");
		list.addFirst("Donut");
		list.addFirst("Donut");
		list.addFirst("End");

		System.out.println("You should get the list elements in this order: Apple, Banana, Cherry, Donut, Donut, End");
		list.printBackwards();
		System.out.println("--------- End of testAppendBackwards -----------:");
	}
	
	
	public static void testIsEmpty() {
		System.out.println("");
		System.out.println("-------------- testIsEmpty ------------:");
		List<String> list = new DoublyLinkedList<String>();
		System.out.println("isEmpty() should return true, and it is returning " + list.isEmpty());
		list.addFirst("One");
		System.out.println("isEmpty() should return false, and it is returning " + list.isEmpty());
		System.out.println("--------- End of testIsEmpty -----------:");
	}
	

	public static void testGetLength() {
		System.out.println("");
		System.out.println("-------------- testGetLength ------------:");
		List<String> list = new DoublyLinkedList<String>();
		System.out.println("getLength() should return 0, and it is returning " + list.getLength());
	
		// now add several items to the List
		list.addFirst("Apple");
		System.out.println("getLength() should return 1, and it is returning " + list.getLength());
		
		list.addLast("Banana");
		System.out.println("getLength() should return 2, and it is returning " + list.getLength());

		list.addFirst("Cherry");
		System.out.println("getLength() should return 3, and it is returning " + list.getLength());
		System.out.println("--------- End of testGetLength -----------:");

	}
	
	public static void testRemoveFromEmptyList() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromEmptyList ------------:");
		List<String> list = new DoublyLinkedList<String>();
		System.out.println("Nothing to remove from an empty list, to remove() should return false, and it returns " +list.remove("something"));
		System.out.println("-------------- testRemoveFromEmptyList ------------:");
	}
    public static void testRemoveFromListWithOneElementNegative() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithOneElementNegative ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		System.out.println("remove() should return false, and it returns " +list.remove("something"));
		System.out.println("-------------- testRemoveFromListWithOneElementNegative ------------:");
	}
    public static void testRemoveFromListWithTwoElementNegative() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithTwoElementNegative ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		list.addFirst("Cherry");
		System.out.println("remove() should return false, and it returns " +list.remove("something"));
		System.out.println("-------------- testRemoveFromListWithTwoElementNegative  ------------:");
	}
    public static void testRemoveFromListWithTwoElementPositive() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithTwoElementPositive ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		list.addFirst("Cherry");
		System.out.println("remove() should return true, and it returns " +list.remove("Cherry"));
		System.out.println("You should get the list elements in this order: Apple");
		list.print();
		System.out.println("-------------- testRemoveFromListWithTwoElementPositive  ------------:");
	}
    
    public static void testRemoveFromListWithOneElementPositive() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithOneElementPositive ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addFirst("Apple");
		System.out.println("remove() should return true, and it returns " +list.remove("Apple"));
		System.out.println("You should get an empty list");
		list.print();
		System.out.println("-------------- testRemoveFromListWithOneElementPositive ------------:");
	}
    
   public static void testRemoveFromListWithThreeElementPositive() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithThreeElementPositive ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addLast("Apple");
		list.addLast("Cherry");
		list.addLast("Banana");
		System.out.println("remove() should return true , and it returns " +list.remove("Cherry"));
		System.out.println("You should get the list elements in this order: Apple, Banana");
		list.print();
		System.out.println("-------------- testRemoveFromListWithThreeElementPositive  ------------:");
	}
    public static void testRemoveFromListWithThreeElementNegative() {
		
		System.out.println("");
		System.out.println("-------------- testRemoveFromListWithThreeElementNegative ------------:");
		List<String> list = new DoublyLinkedList<String>();
		list.addLast("Apple");
		list.addLast("Cherry");
		list.addLast("Banana");
		System.out.println("remove() should return false, and it returns " +list.remove("something"));
		System.out.println("You should get the list elements in this order: Apple, Cherry, Banana");
		list.print();
		System.out.println("-------------- testRemoveFromListWithThreeElementNegative  ------------:");
	}

   
	
	public static void testAddLastAndGet () {
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut"); 
		list.addLast("End");
		
		System.out.println("The sixth element should be End, and it is: " + list.get(5));
		System.out.println("The fifth element should be Donut, and it is: " + list.get(4));
		System.out.println("The fourth element should be Donut, and it is: " + list.get(3));
		System.out.println("The second element should be Banana, and it is: " + list.get(1));
		System.out.println("The first element should be Apple, and it is: " + list.get(0));

		
	}
	
	public static void testAddLastForwards() {
		System.out.println("");
		System.out.println("-------------- testAddLastForwards ------------:");
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut");
		list.addLast("End");

		System.out.println("You should get the list elements in this order: Apple, Banana, Cherry, Donut, Donut, End");
		list.print();
		System.out.println("--------- End of testAddLastForwards -----------:");
	}
	
	public static void testAddLastBackwards() {
		System.out.println("");
		System.out.println("-------------- testAddLastBackwards ------------:");
		List<String> list = new DoublyLinkedList<String>();

		// now add several items to the List
		list.addLast("Apple");
		list.addLast("Banana");
		list.addLast("Cherry");
		list.addLast("Donut");
		list.addLast("Donut");
		list.addLast("End");

		System.out.println("You should get the list elements in this order: End, Donut, Donut, Cherry, Banana, Apple");
		list.printBackwards();
		System.out.println("--------- End of testAddLastBackwards -----------:");
	}
	
	

    public static void testIterator() {
        System.out.println("");
        System.out.println("-------------- testIterator ------------:");
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.addLast("Apple");
        list.addLast("Cherry");
        list.addLast("Banana");
        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
        System.out.println();
        System.out.println("-------------- testIterator  ------------:");
    }

}

