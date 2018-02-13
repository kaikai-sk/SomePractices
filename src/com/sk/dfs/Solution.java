package com.sk.dfs;

import java.util.ArrayList;

class TreeNode 
{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) 
    {
        this.val = val;

    }

}

public class Solution 
{
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) 
    {
    	ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
    	if(root==null)
    	{
    		return paths;
    	}
    	find(paths,new ArrayList<Integer>(),root,target);
    	return paths;
    }

	private void find(ArrayList<ArrayList<Integer>> paths, ArrayList<Integer> path, TreeNode root, int target) 
	{
		path.add(root.val);
		if(root.left==null && root.right==null)
		{
			if(target==root.val)
			{
				paths.add(path);
			}
			
			return;
		}
		
		ArrayList<Integer> path2=new ArrayList<Integer>();
		
		path2.addAll(path);
		if(root.left!=null)
			find(paths, path, root.left, target-root.val);
		if(root.right!=null)
			find(paths, path2, root.right, target-root.val);
		
	}
}