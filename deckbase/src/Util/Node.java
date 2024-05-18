package Util;
import Card.Card;

public class Node {
    Card data = new Card();
    Node prev;
    Node next;

    public Node(Card data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
