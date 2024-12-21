package BASIC;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class TreeTraversal {

    // Inorder tree traversal (Left - Root - Right)
    public static void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    // Preorder tree traversal (Root - Left - Right)
    public static void preorderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Postorder tree traversal (Left - Right - Root)
    public static void postorderTraversal(TreeNode root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // Function for Level order tree traversal
    public static void levelorderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static TreeNode create_tree(String data) {
        if (data == "") return null;
        String[] s = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        int i = 1;
        while (!q1.isEmpty()) {
            TreeNode temp = q1.poll();
            if (i<s.length&&!s[i].equals("null")) {
                temp.left = new TreeNode(Integer.parseInt(s[i]));
                q1.offer(temp.left);
            }
            i++;
            if (i<s.length&&!s[i].equals("null")) {
                temp.right = new TreeNode(Integer.parseInt(s[i]));
                q1.offer(temp.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String treeData = scanner.nextLine();
        scanner.close();

        TreeNode root =create_tree(treeData);

        inorderTraversal(root);
        System.out.println();
        preorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
        System.out.println();
        levelorderTraversal(root);
    }
}
