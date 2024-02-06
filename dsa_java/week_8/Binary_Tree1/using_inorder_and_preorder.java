package dsa.dsa_java.week_8.Binary_Tree1;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

public class using_inorder_and_preorder {


    public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS , int inE , int preS , int preE){
		if(inS > inE){
			return null;
		}

		int data = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);

		int rootIndex = -1;
		for(int i = inS ; i <= inE ; i++){
			if(data == in[i]){
				rootIndex = i;
			}
		}

		if(rootIndex == -1){
			return null;
		}

		int leftInS = inS ;
		int leftInE = rootIndex - 1;
		int leftPreS = preS + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightPreE = preE;
		int rightInS = rootIndex + 1;
		int rightInE = inE;
		int rightPreS =leftPreE +  1 ;

		root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}

    public static BinaryTreeNode<Integer>buildTree(int inOrder[] ,int [] preOrder ){
        return buildTreeHelper(inOrder, preOrder, 0, inOrder.length-1,0,preOrder.length-1);
    }


     public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyExceptions{
        if(root == null){
            return;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingQueue = new QueueUsingLL<>();
        pendingQueue.enqueue(root);

        while (!pendingQueue.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingQueue.dequeue();
            System.out.print(frontNode.data + " : ");

            if (frontNode.left != null) {
                System.out.print("L : " + frontNode.left.data + ", ");
                pendingQueue.enqueue(frontNode.left);
            }
            else {
                System.out.print("L: null, ");
            }

            if (frontNode.right != null) {
                System.out.print("R : " + frontNode.right.data);
                pendingQueue.enqueue(frontNode.right);
            } else {
                System.out.print("R : null");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) throws QueueEmptyExceptions {
        int in[] = {4,2,5,1,3,7};
        int pre[] = {1,2,4,5,3,7};

        BinaryTreeNode<Integer> root = buildTree(in, pre);

            printLevelWise(root);
    }
}
