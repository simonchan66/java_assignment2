package StackADT;

/**
 * StackADT.java
 *
 * @author Simon, David, Suey and Harry
 * @version 1.0s
 * 
 * Class Definition: This interface represents the public contract for the
 * implementation of a Stack ADT. The implementors of this interface 
 * will be required to add all the functionality.
 */

public interface StackADT<E>
{
    /**
     * Constructor method to create a new empty stack.
     * 
     * Precondition: None.
     * 
     * Postcondition: A new empty stack is created.
     */
    public void createStack();


    /**
     * Mutator method to add ("push") an element to the top of the stack.
     * 
     * Precondition: A valid stack exists and an element is passed.
     * 
     * Postcondition: The element is added to the top of the stack.
     * 
     * @param element the element to be added to the stack.
     */
    public void push(E element);
	

    /**
     * Mutator method to remove ("pop") the topmost element from the stack.
     * 
     * Precondition: A valid stack exists and the stack is not empty.
     * 
     * Postcondition: The topmost element is removed from the stack and the element is returned.
     * 
     * @return the topmost element removed from the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    public E pop();
	
    /**
     * Accessor method to peek the topmost element in the stack without removing it.
     * 
     * Precondition: A valid stack exists and the stack is not empty.
     * 
     * Postcondition: The topmost element is returned without being removed from the stack.
     * 
     * @return the topmost element in the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    public E peek();
	
    /**
     * Accessor method to check if two stacks are equal.
     * 
     * Precondition: A valid stack exists and another stack is passed.
     * 
     * Postcondition: Returns true if the two stacks contain equal items appearing in the same order, returns false if not equal.
     * 
     * @param that the other Stack object to compare with.
     * @return true if the two stacks are equal, otherwise false.
     */
    public boolean equals(StackADT<E> that);
	
    /**
     * Accessor method to return an iterator over the items contained in the stack.
     * 
     * Precondition: A valid stack exists.
     * 
     * Postcondition: An iterator over the items in the stack is returned.
     * 
     * @return an iterator over the items in the stack.
     */
    public Iterator<E> iterator();
	
    /**
     * Accessor method to return an array containing all the items in the stack.
     * 
     * Precondition: A valid stack exists.
     * 
     * Postcondition: An array containing all the items in the stack is returned.
     * 
     * @return an array containing all the items in the stack.
     */
    public Object[] toArray();

	/**
     * Accessor method to return an array containing all the items in the stack.
     * 
     * Precondition: A valid stack exists and an array is passed.
     * 
     * Postcondition: An array containing all the items in the stack is returned.
     * 
     * @param copy the array to store the stack items.
     * @return an array containing all the items in the stack.
     */
	public E[] toArray(E[] copy);

	/**
     * Accessor method to search for an object in the stack and return its position.
     * 
     * Precondition: A valid stack exists and an object is passed.
     * 
     * Postcondition: The position of the object in the stack is returned, or -1 if not found. The top is at position 1, the next one is position 2, etc.
     * 
     * @param obj the object to search for in the stack.
     * @return the position of the object in the stack, or -1 if not found.
     */
    public int search(E obj);

	/**
     * Accessor method to check if the stack contains a specific object.
     * 
     * Precondition: A valid stack exists and an object is passed.
     * 
     * Postcondition: Returns true if the stack contains the specified object, otherwise false.
     * 
     * @param obj the object to check for in the stack.
     * @return true if the stack contains the object, otherwise false.
     */
    public boolean contains(E obj);

	    /**
     * Accessor method to return the size of the stack.
     * 
     * Precondition: A valid stack exists.
     * 
     * Postcondition: The size of the stack is returned.
     * 
     * @return the size of the stack.
     */
    public int size();

	/**
     * Accessor method to check if the stack is empty.
     * 
     * Precondition: A valid stack exists.
     * 
     * Postcondition: Returns true if the stack is empty, otherwise false.
     * 
     * @return true if the stack is empty, otherwise false.
     */
    public boolean isEmpty();
    
    /**
     * Mutator method to clear the stack.
     * 
     * Precondition: A valid stack exists.
     * 
     * Postcondition: The stack is cleared and becomes empty.
     */
    public void clear();
}
