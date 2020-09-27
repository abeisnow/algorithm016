package com.guolin.study;

public class LowestCommonAncestor {
	
	private boolean flag = true;
	private TreeNode lowestNode = null;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode result = null;
		if (flag == false) {
			return lowestNode;
		} else {
			if(root == null || root == p || root == q) return root;
	        TreeNode left = lowestCommonAncestor(root.left, p, q);
	        TreeNode right = lowestCommonAncestor(root.right, p, q);
	        if(left == null) return right;
	        if(right == null) return left;
	        
	        flag = false;
	        result = root;
		}
        
        return result;

    }

}
