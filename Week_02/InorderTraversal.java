package com.guolin.study;

import java.util.ArrayList;
import java.util.List;



public class InorderTraversal {
	private List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
        
    }

}
