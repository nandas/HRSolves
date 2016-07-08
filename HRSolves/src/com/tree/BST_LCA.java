package com.tree;

import com.tree.Node;

public class BST_LCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node lca(Node root,int v1,int v2)
    {
     if(root.data < v1 && root.data < v2){
        return lca(root.right,v1,v2);
    }
    if(root.data > v1 && root.data > v2){
        return lca(root.left,v1,v2);
    }

    return root;

       
    }

}
