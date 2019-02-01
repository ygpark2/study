import ds.tree.Tree;
import ds.tree.TreeNode;

/**
 * Created by ygpark2 on 16. 2. 17.
 */
public class Application {

    public static void main(String [] args) {

        Integer[] a = {1,5,2,7,4,6,11,10, 13};
        Tree<Integer> bst = new Tree<>(3);
        for(Integer n : a) bst.insert(n);

        bst.preOrderTraversal();
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();
        System.out.println();

        System.out.println("diameter => " + bst.diameter());

        System.out.println("countLeaves => " + bst.countLeaves());

        System.out.println("height => " + bst.height());

        System.out.println("width => " + bst.width());

        System.out.println("search 3 => " + bst.search(3));
        System.out.println("search 4 => " + bst.search(4));
    }
}
