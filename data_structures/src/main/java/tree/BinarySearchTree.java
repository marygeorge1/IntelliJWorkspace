package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        displayTheNode(root);
    }

    private void displayTheNode(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.getValue());
        displayTheNode(node.getLeft());
        displayTheNode(node.getRight());
    }

    public void insert(int data){
        root=insertTheNode(root,data);
    }

    private Node insertTheNode(Node node,int data){

        if(node==null){
            node=new Node(data);
            return node;
        }
        else if(data<node.getValue()){
            node.setLeft(insertTheNode(node.getLeft(),data));
        }
        else if(data>node.getValue()){
            node.setRight(insertTheNode(node.getRight(),data));
        }
        return node;
    }

    public void preOrderTraversal(){
        System.out.println("---Pre Order Traversal---");
        displayPreOrder(root);
    }

    private void displayPreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.getValue());
        displayPreOrder(node.getLeft());
        displayPreOrder(node.getRight());
    }

    public void postOrderTraversal(){
        System.out.println("---Post Order Traversal---");
        displayPostOrder(root);
    }

    private void displayPostOrder(Node node){
        if(node==null){
            return;
        }
        displayPostOrder(node.getLeft());
        displayPostOrder(node.getRight());
        System.out.println(node.getValue());
    }

    public void inOrderTraversal(){
        System.out.println("---In Order Traversal---");
        displayInOrder(root);
    }

    private void displayInOrder(Node node){
        if(node==null){
            return;
        }
        displayInOrder(node.getLeft());
        System.out.println(node.getValue());
        displayInOrder(node.getRight());

    }

    public void breadthFirstTraversal(){
        System.out.println("---Breadth First Traversal---");
        displayBreadthFirst(root);
    }

    public void displayBreadthFirst(Node node){
        ArrayDeque<Node> queue=new ArrayDeque<>();
        if(node==root && node!=null){
            queue.add(node);
        }
        while(queue.size()>0 ){
            Node currentNode=queue.poll();
            System.out.println(currentNode.getValue());
            if(currentNode.getLeft()!=null){
                queue.add(currentNode.getLeft());
            }
            if(currentNode.getRight()!=null){
                queue.add(currentNode.getRight());
            }

        }
    }

    public List<List<Integer>> levelOrder(){
        return displayLevelOrder(root);
    }

    public List<List<Integer>> displayLevelOrder(Node node){
        List<List<Integer>> result=new ArrayList<>();

        if(node==null){
            return result;
        }

        ArrayDeque<Node> queue=new ArrayDeque<>();
        if(node==root){
            queue.add(node);
        }
        while(queue.size()>0 ){
            int levelSize= queue.size();
            List<Integer> currentList=new ArrayList<>();
            for(int i=0;i<levelSize;i++){

                Node currentNode=queue.poll();
                System.out.println(currentNode.getValue());
                currentList.add(currentNode.getValue());
                if(currentNode.getLeft()!=null){
                    queue.add(currentNode.getLeft());
                }
                if(currentNode.getRight()!=null){
                    queue.add(currentNode.getRight());
                }

            }
            result.add(currentList);
        }
        return result;
    }

    public Node levelSuccessor(int data){
        return getLevelSuccessor(root,data);
    }

    private Node getLevelSuccessor(Node node,int data){
        Node result=null;
        if(node==null){
            return result;
        }

        Queue<Node> queue=new ArrayDeque<>();
        queue.add(node);
        while(queue.size()>0){
            Node currentNode=queue.poll();
            if(currentNode.getLeft()!=null){
                queue.add(currentNode.getLeft());
            }
            if(currentNode.getRight()!=null){
                queue.add(currentNode.getRight());
            }
            if(currentNode.getValue()==data){
                if(queue.size()>0){
                    result=queue.poll();
                }
                break;

            }
        }

        return result;

    }

}
