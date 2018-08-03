package Tree.binaryTree;

/*
 * 链式二叉树，定义
 */
public class BinaryTree<T extends NodeData> {
	public final static int MAXLEN = 20;// 定义最大长度
	T nodeData;
	BinaryTree<T> leftTree;
	BinaryTree<T> rightTree;

	public BinaryTree() {
		nodeData = null;
		leftTree = null;
		rightTree = null;
	}
}

class NodeData {
	int data = 0;// 数值
	int index = 1;// 二叉树索引，初始值为1，最大值为MAXLEN
	String aa="maxiaodong";
}
