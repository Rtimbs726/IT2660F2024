public class Main {
  public static void main(String[] args) {
      // Step 1 - Create a BST tree object called lab5Tree
      BST lab5Tree = new BST();
      
      // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
      int[] valuesToInsert = {13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10};
      for (int value : valuesToInsert) {
          lab5Tree.insert(value);
      }
      // Step 3 - Delete the value 17
      lab5Tree.delete(17);
      // Step 4 - Traverse and output the values using inorder (sorted)
      System.out.println("Inorder traversal (sorted):");
      lab5Tree.inorder();
      System.out.println();
      // Step 5 - Traverse and output the values using postorder
      System.out.println("Postorder traversal:");
      lab5Tree.postorder();
      System.out.println();
      // Step 6 - Traverse and output the values using preorder
      System.out.println("Preorder traversal:");
      lab5Tree.preorder();
      System.out.println();
      // Step 7 - Display the result of a search for the value 36
      int searchValue = 36;
      boolean found36 = lab5Tree.search(searchValue);
      System.out.println("Search for value " + searchValue + ": " + (found36 ? "Found" : "Not Found"));
      // Step 8 - Display the result of a search for the value 37
      searchValue = 37;
      boolean found37 = lab5Tree.search(searchValue);
      System.out.println("Search for value " + searchValue + ": " + (found37 ? "Found" : "Not Found"));
      // Step 9 - Using the path() method, display the path from the root to 2
      System.out.print("\nA path from the root to 2 is: ");
      java.util.ArrayList<BST.TreeNode<Integer>> path = lab5Tree.path(2);
      for (int i = 0; path != null && i < path.size(); i++) {
      System.out.print(path.get(i).element + " ");
}
      // Step 10 - Display the path from the root to 34
      System.out.print("\nA path from the root to 34 is: ");
      java.util.ArrayList<BST.TreeNode<Integer>> pathto34 = lab5Tree.path(34);
      for (int i = 0; pathto34 != null && i < pathto34.size(); i++) {
        System.out.print(pathto34.get(i).element + " ");
      }
  }
}