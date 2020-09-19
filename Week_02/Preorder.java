package com.guolin.study;

import java.util.ArrayList;
import java.util.List;

class Solution {
	private List<Integer> result = new ArrayList<Integer>();

	public List<Integer> preorder(Node root) {
		if (root == null) {
			return result;
		}
		result.add(root.val);
		for (Node node : root.children) {
			preorder(node);
		}
		return result;

	}
}
