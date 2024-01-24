package dsa.dsa_java.week_8.Binary_Tree1;
import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
