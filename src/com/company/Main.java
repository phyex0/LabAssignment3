//Halit Burak Yeşildal 18050111043
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        System.out.println("Inserting to head...");
        ll.insertToHead("ekmek7");
        ll.insertToHead("ekmek6");
        ll.insertToHead("ekmek5");
        ll.insertToHead("ekmek4");
        ll.insertToHead("ekmek3");
        ll.insertToHead("ekmek2");
        ll.insertToHead("ekmek1");
        ll.printLinkedList(ll.head);
        System.out.println("************************");

        System.out.println("Sorted inserting....");
        ll.sortedInsert("ekmek 1");
        ll.sortedInsert("ekmek 2");
        ll.sortedInsert("ekmek3");
        ll.sortedInsert("ekmek 4");
        ll.sortedInsert("ekmek5");
        ll.sortedInsert("aaa");
        ll.sortedInsert("ekmek8");
        ll.sortedInsert("ekmek2");
        ll.sortedInsert("ekmek3");
        ll.printLinkedList(ll.head);
        System.out.println("************************");

        System.out.println("Inserting to random positions..");
        ll.insertToSpecificPosition("ekmekKral1",16);//end
        ll.insertToSpecificPosition("ekmekKral2",0);//head
        ll.insertToSpecificPosition("ekmekKral3",4);//mid
        ll.insertToSpecificPosition("ekmekKral4",25);//out of list
        ll.printLinkedList(ll.head);
        System.out.println("************************");

        System.out.println("Printing all items end to begin..");
        ll.reversedPrintLinkList(ll.head);
    }
}
