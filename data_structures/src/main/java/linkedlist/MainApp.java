package linkedlist;

public class MainApp {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(5);
        list.insertAtFirst(20);
        list.insertAtIndexRecursion(2,3);
        list.showList();
        list.insertAtIndexRecursion(2,4);
        list.showList();
    }
}
