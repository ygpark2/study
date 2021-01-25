import ds.dp.LCS;
import ds.sort.BubbleSort;
import ds.sort.MergeSort;
import ds.sort.QuickSort;
import ds.tree.Tree;
import ds.tree.TreeNode;

/**
 * Created by ygpark2 on 16. 2. 17.
 */
public class Application {

    public static void main(String [] args) {

        QuickSort qs = new QuickSort();
        int[] arrVal = new int[]{1,5,2,7,4,6,11,10, 13};
        qs.quickSort(arrVal, 0, arrVal.length - 1);
        System.out.println(arrVal);

        BubbleSort bs = new BubbleSort();
        arrVal = new int[]{4, 2, 9, 6, 23, 12, 34, 0, 1};
        bs.bubble_sort(arrVal);

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

        System.out.println( "lcs => " + LCS.LCS("axbxcxdxexixo", "abcdio", "axbxcxdxexixo".length(), "abcdio".length()));
    }
}
