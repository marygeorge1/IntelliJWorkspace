package linkedlist;

public class LinkedList {

    private Node head=null;

    public void insert(int data){

        Node newNode =new Node();
        newNode.setData(data);
        newNode.setNext(null);

        if(head==null){
            head=newNode;
        }
        else{
            Node currentNode=head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void showList(){

        Node currentNode=head;
        while(currentNode.getNext()!=null){
            System.out.print(currentNode.getData()+" ");
            currentNode=currentNode.getNext();
        }
        System.out.print(currentNode.getData());
    }

    public void insertAtFirst(int data){
        Node newNode=new Node();
        newNode.setData(data);
        newNode.setNext(head);
        head=newNode;
    }

    public void insertAtIndex(int index,int data){
        int i=0;
        Node newNode=new Node();
        newNode.setData(data);

        Node currentNode=head;
        while(currentNode.getNext()!=null){

            if(index==i+1){

                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
                break;
            }
            currentNode=currentNode.getNext();
            i++;
        }
    }

    public void insertAtIndexRecursion(int index,int data){
        insertRecursion(index,data,null);
    }

    private void insertRecursion(int index,int data,Node previousNode){
        if(index==0){
            Node currentNode=previousNode.getNext();
            Node newNode=new Node();
            newNode.setNext(currentNode);
            newNode.setData(data);
            previousNode.setNext(newNode);
            return;
        }
        if(previousNode==null){
            insertRecursion(index-1,data,head);
        }
        else{
            insertRecursion(index-1,data,previousNode.getNext());
        }

    }
}
