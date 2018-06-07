package Tree.binaryTree;

public class BinaryTreeUtils {
	// 初始化二叉树
	public static <T extends NodeData> BinaryTree<T> initTree(T nodeData) {
		BinaryTree<T> node = null;// 需要初始化一个根节点
		// 申请内存
		if ((node = new BinaryTree<T>()) != null) {
			System.out.println("请先输入一个根节点数据:\n");
			node.nodeData = nodeData;
			node.leftTree = null;
			node.rightTree = null;
			return node;
		}
		return null;

	}

	/*
	 * 根据数组，数组包含下标索引，创建创建完全二叉树。二叉树性质：parentNode=m/2,currentNode=m,leftNode=2m,
	 * rightNode=2m+1
	 * 
	 * @param root must initial
	 * 
	 * @param nodeDatas an Array contains params
	 */
	public static <T extends NodeData> void CreateBinaryTree(BinaryTree<T> root, T[] nodeDatas) {
		if (root == null) {
			return;
		}
		int leftChidIndex = root.nodeData.index * 2;
		int rightChildIndex = root.nodeData.index * 2 + 1;
		if (leftChidIndex <= BinaryTree.MAXLEN) {
			root.leftTree = new BinaryTree<T>();
			root.leftTree.nodeData = nodeDatas[leftChidIndex - 1];
		}
		if (rightChildIndex <= BinaryTree.MAXLEN) {
			root.rightTree = new BinaryTree<T>();
			root.rightTree.nodeData = nodeDatas[rightChildIndex - 1];
		}
		CreateBinaryTree(root.leftTree, nodeDatas);// 创建左子树
		CreateBinaryTree(root.rightTree, nodeDatas);// 创建右子树
	}

	/*
	 * 先序遍历
	 */
	public static <T extends NodeData> void firstIterator(BinaryTree<T> root) {
		if (root == null)
			return;
		System.out.print(root.nodeData.index + ",");
		firstIterator(root.leftTree);
		firstIterator(root.rightTree);
	}

	/*
	 * 中序遍历
	 */
	public static <T extends NodeData> void middleIterator(BinaryTree<T> root) {
		if (root == null)
			return;
		middleIterator(root.leftTree);
		System.out.print(root.nodeData.index + ",");
		middleIterator(root.rightTree);
	}

	/*
	 * 后序遍历
	 */
	public static <T extends NodeData> void lastIterator(BinaryTree<T> root) {
		if (root == null)
			return;
		lastIterator(root.leftTree);
		lastIterator(root.rightTree);
		System.out.print(root.nodeData.index + ",");
	}

	/*
	 * 二叉树查找，通过遍历来实现
	 */
	public static <T extends NodeData> T findTreeValue(BinaryTree<T> root, int value) {
		T nodeData = null;
		if (root == null) {
			return null;
		} else {
			if (root.nodeData.data == value) {
				return nodeData = root.nodeData;
			} else {
				if ((nodeData = findTreeValue(root.leftTree, value)) != null) {
					return nodeData;
				} else if ((nodeData = findTreeValue(root.rightTree, value)) != null) {
					return nodeData;
				} else {
					return null;
				}
			}
		}

	}

}
