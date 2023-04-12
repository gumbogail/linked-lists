public class Link {
    public Link next;
    public Person person;

    public Link(Person person) {
        
        this.next = null;
        this.person = person;
    }
    public void dispalyLink(){
        System.out.print(person);
    }

    
}
