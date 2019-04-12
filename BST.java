class BST{ 
 private Node root; 
    //Basic Node definition. Each Node contains a Value, a left child, and a right child
    class Node { 
        int val; 
        Node left, right; 
  
        public Node(int value) { 
         val = value; 
            left =null;
            right = null; 
        } 
    } 
    public BST(int rootValue) {  
        root = new Node(rootValue);  
    } 
    //insert Value into the appropriate spot in the tree
    private Node insert(Node root,int value) { 
  
        if (root == null) { 
          
            root = new Node(value); 
            return root; 
        } 
  
        if (value < root.val) 
            root.left = insert(root.left, value); 
        else if (value > root.val) 
            root.right = insert(root.right, value); 
  
        return root; 
    } 

    //finish code to print all values with an inorder traversal
    void inorderTraversal(Node root) { 
        if (root != null) {
            System.out.println(root.val+""); 
          inorderTraversal(root.left);
          
            inorderTraversal(root.right);
        } 
    } 
  
     void preorderTraversal(Node root)

    {
        if (root != null)

        {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    // post order traversal

    void postorderTraversal(Node root)
    {
        if (root != null)
        {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
    private boolean search(int val)

    {

        return searchUtil( this.root, val );

    }

    private boolean searchUtil(Node root, int val)

    {
        // if the tree is empty
        if( root == null )
            return false;
        // if the current node is the required node
        else if( root.val == val )
            return true;
        else{
            // recursively check for node in left and right subtree
          if (val<root.val){
           return searchUtil(root.left,val); 
          }
          
          else if (val>root.val){
            return searchUtil(root.right,val);
          }
    }
        return false;
    }
    
    public static void main(String[] args) { 
     //create tree with a root of 5
        BST tree = new BST(5);   
      
        tree.insert(tree.root,2); 
        tree.insert(tree.root,7); 
        tree.insert(tree.root,10); 
        tree.insert(tree.root,4); 
        tree.insert(tree.root,1);  
  
        //start traversal at root
        tree.inorderTraversal(tree.root); 
         tree.inorderTraversal(tree.root);
         
        System.out.println("\n\nPreorder Traversal ...");
        //start traversal at root
        tree.preorderTraversal(tree.root);

        System.out.println("\n\nPostorder Traversal ...");
        tree.postorderTraversal(tree.root);
        if( tree.search( 10 ) )
            System.out.println("\n10 is present in BST");
        else
            System.out.println("\n10 is not present in BST");

        if( tree.search(3) )

            System.out.println("3 is present in BST");
        else
            System.out.println("3 is not present in BST");
    } 
}