package Tree.binaryTree;

public class Main {

	public static void main(String[] args) {
		NodeData[] nodeDatas = new NodeData[BinaryTree.MAXLEN];
		BinaryTree<NodeData> root;
		for (int i = 0; i < 20; i++) {
			nodeDatas[i] = new NodeData();
			nodeDatas[i].data = i + 1;
			nodeDatas[i].index = i + 1;
		}
		root = new BinaryTree<NodeData>();
		root.nodeData = nodeDatas[0];
		BinaryTreeUtils.CreateBinaryTree(root, nodeDatas);
		BinaryTreeUtils.firstIterator(root);
		System.out.print("\n");
		BinaryTreeUtils.middleIterator(root);
		System.out.print("\n");
		BinaryTreeUtils.lastIterator(root);
		System.out.println(BinaryTreeUtils.findTreeValue(root, 112));

	}
}
