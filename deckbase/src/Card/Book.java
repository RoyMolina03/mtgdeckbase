package Card;

import Util.*;

public class Book {

    DoublyLinkedList Collection = new DoublyLinkedList();

    //initialize user collection with one card already
    public Book (Card data)
    {
        System.out.println("Creating Collection, adding Card");
        Collection.insertAtFront(data);
    }

    


}
