package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        //LinkedListNode lln = new LinkedListNode("ekmek");
        ll.insertToHead("ekmek7");
        ll.insertToHead("ekmek6");
        ll.insertToHead("ekmek5");
        ll.insertToHead("ekmek4");
        ll.insertToHead("ekmek3");
        ll.insertToHead("ekmek2");
        ll.insertToHead("ekmek1");
        ll.printLinkedList(ll.head);
        System.out.println("************************");
       // ll.reversedPrintLinkList(ll.head);
       ll.sortedInsert("ekmek 1");
       ll.sortedInsert("ekmek 2");
       ll.sortedInsert("ekmek3");
       ll.sortedInsert("ekmek 4");
       ll.sortedInsert("ekmek5");
       ll.sortedInsert("aaa");


        ll.sortedInsert("ekmek8");
        ll.printLinkedList(ll.head);

        System.out.println( "************");
        ll.reversedPrintLinkList(ll.head);
    }
}
