/**
 * LinkedList
 */
public class LinkedList {

    public Link first ; 
    public Link Last;

    public LinkedList(Link first, Link last) {
        this.first = null;
        Last = null;
    }

    public void InsertFirst(Person A){
      Link n = new Link(A);
      n.next=first;
      first=n;
    }

    public void InsertLast(Person B){
        Link n = new Link(B);
        n.next=null;
        Last=n;
      }

    public Person deleteFirstPerson(){
        Link temp = first;
        first=first.next;
        temp.next=null;
        return temp.person;
    }
    public Person deleteLastPerson(){
        Link temp = Last;
        Last.next=null;
        temp.next=null;
        return temp.person;
    }

    public void InserAfter(Person C){
        Link n = new Link(C);
        

    }
}