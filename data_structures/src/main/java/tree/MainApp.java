package tree;

public class MainApp {
    public static void main(String[] args) {
        BinarySearchTree myTree=new BinarySearchTree();
        myTree.insert(10);
        myTree.insert(2);
        myTree.insert(8);
        myTree.insert(20);
        myTree.insert(5);
        //myTree.display();
        myTree.preOrderTraversal();
        myTree.postOrderTraversal();
        myTree.inOrderTraversal();
        myTree.breadthFirstTraversal();
        System.out.println("Level successor of 10 is "+myTree.levelSuccessor(10).getValue());
        System.out.println("Level successor of 20 is "+myTree.levelSuccessor(20).getValue());
        System.out.println("Level successor of 5 is "+myTree.levelSuccessor(5).getValue());
    }
}
