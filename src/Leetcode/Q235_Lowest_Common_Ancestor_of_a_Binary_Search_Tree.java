package Leetcode;

import Leetcode.Util.TreeNode;

/**
 * Created by rbhatnagar2 on 1/15/17.
 */
public class Q235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        int smaller = Integer.MIN_VALUE, larger = Integer.MIN_VALUE;
        if (p.val < q.val) {
            smaller = p.val;
            larger = q.val;
        } else {
            smaller = q.val;
            larger = p.val;
        }

        if (root.val >= smaller && root.val <= larger)
            return root;
        else if (root.val <= smaller)
            return lowestCommonAncestor(root.right, p, q);
        else
            return lowestCommonAncestor(root.left, p, q);
    }
}
