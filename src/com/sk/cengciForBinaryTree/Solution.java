package com.sk.cengciForBinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution
{
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		if(root==null)
			return list;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode node=queue.poll();
			if(node.left!=null)
			{
				queue.offer(node.left);
			}
			if(node.right!=null)
			{
				queue.offer(node.right);
			}
			list.add(node.val);
		}
		return list;
	}
}