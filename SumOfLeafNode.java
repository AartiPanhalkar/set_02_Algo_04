import java.util.Scanner;

class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;

		    TreeNode(int val) {
		        this.val = val;
		        left = null;
		        right = null;
		    }
		}

		public class SumOfLeafNode {

		    public static int sumOfLeafNodes(TreeNode root) {
		        if (root == null) {
		            return 0;
		        }
		        if (root.left == null && root.right == null) {
		            return root.val;
		        }
		        int leftSum = sumOfLeafNodes(root.left);
		        int rightSum = sumOfLeafNodes(root.right);

		        return leftSum + rightSum;
		    }

		    public static void main(String[] args) {
		    	Scanner sc=new Scanner(System.in);
		        TreeNode root = new TreeNode(4);
		        root.left = new TreeNode(9);
		        root.right = new TreeNode(0);
		        root.left.left = new TreeNode(5);
		        root.left.right = new TreeNode(1);

		        int sum = sumOfLeafNodes(root);
		        System.out.println("Sum of leaf nodes: " + sum);
		    }

		
		
	}

