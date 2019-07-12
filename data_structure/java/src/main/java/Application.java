import ds.dp.ATM;
import ds.dp.LCS;
import ds.tree.BinaryTree;
import ds.tree.Tree;
import ds.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ygpark2 on 16. 2. 17.
 */
public class Application {

    public static void main(String [] args) {

        Integer[] a = {1,5,2,7,4,6,11,10, 13};
        Tree<Integer> bst = new Tree<>(3);
        for(Integer n : a) bst.insert(n);

        bst.preOrderTraversal();
        System.out.println("----------------------------");
        bst.inOrderTraversal();
        System.out.println("----------------------------");
        bst.postOrderTraversal();
        System.out.println("----------------------------");

        System.out.println("diameter => " + bst.diameter());
        System.out.println("countLeaves => " + bst.countLeaves());

        System.out.println("height => " + bst.height());
        System.out.println("width => " + bst.width());

        System.out.println("search 3 => " + bst.search(3));
        System.out.println("search 4 => " + bst.search(4));

        int[] intList = {1,2,3,5,7,8,9,11,12,13,33};
        BinaryTree bt = new BinaryTree();
        bt.makeTree(intList);
        System.out.println(bt.root.getVal());
        bt.searchBtree(bt.root, 2);

        ATM atm = new ATM();
        Map<Integer, Integer> moneyMap = new HashMap<>();
        Map<Integer, Integer> val = atm.widthdraw(455, atm.getMoneyInfoMap().size() -1, moneyMap);
        val.forEach((k, v) -> {
            System.out.println("new val key => " + k);
            System.out.println("new val value => " + v);
        });

        LCS lcs = new LCS();
        int matchSize = lcs.lcs("axbxcxdx", "abc", "axbxcxdx".length(), "abc".length());
        System.out.println("matchSize => " + matchSize);

    }
}
