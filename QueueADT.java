package QueueADT;

/**
 * QueueADT.java
 *
 * @author Simon, David, Suey and Harry
 * @version 1.0s
 * 
 * Class Definition: This interface represents the public contract for the
 * implementation of a Queue ADT. The implementors of this interface 
 * will be required to add all the functionality.
 */

public interface QueueADT<E>
{

    /**
     * Constructor method to create a new empty queue.
     * 
     * Precondition: None.
     * 
     * Postcondition: A new empty queue is created.
     */
    public void createQueue();


    /**
     * Mutator method to add an element to the end of the queue.
     * 
     * Precondition: A valid queue exists and an element is passed.
     * 
     * Postcondition: The element is added to the end of the queue.
     * 
     * @param element the element to be added to the queue.
     */
    public void enqueue(E element);


    /**
     * Mutator method to remove the first element from the queue.
     * 
     * Precondition: A valid queue exists and the queue is not empty.
     * 
     * Postcondition: The first element is removed from the queue and the element is returned.
     * 
     * @return the first element removed from the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public E dequeue();


    /**
     * Accessor method to peek the first element in the queue without removing it.
     * 
     * Precondition: A valid queue exists and the queue is not empty.
     * 
     * Postcondition: The first element is returned without being removed from the queue.
     * 
     * @return the first element in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public E peek();


    /**
     * Accessor method to check if two queues are equal.
     * 
     * Precondition: A valid queue exists and another queue is passed.
     * 
     * Postcondition: Returns true if the two queues contain equal items appearing in the same order, returns false if not equal.
     * 
     * @param that the other QueueADT object to compare with.
     * @return true if the two queues are equal, otherwise false.
     */
    public boolean equals(QueueADT<E> that);


    /**
     * Accessor method to return an iterator over the items contained in the queue.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: An iterator over the items in the queue is returned.
     * 
     * @return an iterator over the items in the queue.
     */
    public Iterator<E> iterator();


    /**
     * Accessor method to return an array containing all the items in the queue.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: An array containing all the items in the queue is returned.
     * 
     * @return an array containing all the items in the queue.
     */
    public Object[] toArray();


    /**
     * Accessor method to return an array containing all the items in the queue.
     * 
     * Precondition: A valid queue exists and an array is passed.
     * 
     * Postcondition: An array containing all the items in the queue is returned.
     * 
     * @param copy the array to store the queue items.
     * @return an array containing all the items in the queue.
     */
    public E[] toArray(E[] copy);


    /**
     * Accessor method to check if the queue is full.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: Returns true if the queue is full, otherwise false.
     * 
     * @return true if the queue is full, otherwise false.
     */
    public boolean isFull();


    /**
     * Accessor method to return the size of the queue.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: The size of the queue is returned.
     * 
     * @return the size of the queue.
     */
    public int size();


    /**
     * Accessor method to check if the queue is empty.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: Returns true if the queue is empty, otherwise false.
     * 
     * @return true if the queue is empty, otherwise false.
     */
    public boolean isEmpty();


    /**
     * Mutator method to clear the queue.
     * 
     * Precondition: A valid queue exists.
     * 
     * Postcondition: The queue is cleared and becomes empty.
     */
    public void dequeueAll();
    
}