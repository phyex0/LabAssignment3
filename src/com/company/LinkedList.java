//Halit Burak Yeşildal 18050111043
package com.company;

public class LinkedList {

    public LinkedListNode head;
    public LinkedListNode tail;
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    //it works.
    public void printLinkedList(LinkedListNode head){
        LinkedListNode iter=head;
        while(iter !=null){
            System.out.println(iter.data);
            iter=iter.next;
        }

    }

    //it works.
    public void insertToHead(String data){
        LinkedListNode temp= new LinkedListNode(data);
        if(head==null){
            head=temp;
            tail=head;
            tail.next=null;
        }
        else{
            temp.next=head;;
            head=temp;
        }
    }

    //it works.
    //if the position is greater than len+1 we cannot add to list.
    //if the position is equal to len we can add to end of the list
    public void insertToSpecificPosition(String nodeData, int position){
        LinkedListNode temp= new LinkedListNode(nodeData);
        LinkedListNode iter=head;
        int len = lenOfList();
        if(position<0 || position>len){
            System.out.println("You cannot insert to given position");
        }
        else if(position==0)
            insertToHead(nodeData);

        else if (position==len){
            tail.next=temp;
            tail=temp;
            tail.next=null;
        }

        else if(position<=len) {
            for (int i = 0; i < position-1; i++)
                iter = iter.next;

            temp.next = iter.next;
            iter.next = temp;
        }



    }

    //returns lenght of the list.
    public int lenOfList(){
        LinkedListNode iter=head;
        int count =0;
        while(iter!=null){
            count++;
            iter=iter.next;
        }
        return count;
    }

    //it works.
    void reversedPrintLinkList(LinkedListNode head) {
        LinkedListNode lastItem=tail,iter=head;

        while(lastItem!=head.next){
            if(iter.next == lastItem){
                System.out.println(iter.next.data);
                lastItem=iter;
                iter=head;
            }
            iter=iter.next;
        }
        System.out.println(head.next.data);
        System.out.println(head.data);


    }

    //it works.
    void sortedInsert(String nodeData) {
        LinkedListNode iter=head;
        int count=0;
        boolean inserted = false;
        while(iter!=null){
            if(nodeData.compareTo(iter.data)<0){
                System.out.println("count is< "+count);
                insertToSpecificPosition(nodeData,count);
                inserted=true;

                break;
            }

            count++;
            iter=iter.next;
        }
        if(!inserted)
            insertToSpecificPosition(nodeData,lenOfList());

    }


}
