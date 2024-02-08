package dsa.dsa_java.week_8.Binary_Tree2;

import dsa.dsa_java.week_7.Queues.QueueEmptyExceptions;

public class indorder_and_postorder {
     public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pos[], int inS , int inE , int posS , int posE){
		if(inS > inE){
			return null;
		}

		int data = pos[posE];
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
		int leftPosS = posS ;
		int leftPosE = leftInE - leftInS + leftPosS;
		int rightPosE = posE - 1;
		int rightInS = rootIndex + 1;
		int rightInE = inE;
		int rightPosS =leftPosE +  1 ;

		root.left = buildTreeHelper(in, pos, leftInS, leftInE, leftPosS, leftPosE);
		root.right = buildTreeHelper(in, pos, rightInS, rightInE, rightPosS, rightPosE);
		return root;
	}

    public static BinaryTreeNode<Integer>buildTree(int inOrder[] ,int [] postOrder ){
        return buildTreeHelper(inOrder, postOrder, 0, inOrder.length-1,0,postOrder.length-1);
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
        int post[] = {4,5,2,7,3,1};

        BinaryTreeNode<Integer> root = buildTree(in, post);

            printLevelWise(root);
    }
}
