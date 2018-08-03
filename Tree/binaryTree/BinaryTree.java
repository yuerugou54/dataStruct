package Tree.binaryTree;

/*
 * ��ʽ������������
 */
public class BinaryTree<T extends NodeData> {
    public final static int MAXLEN = 20;// ������󳤶�
    T nodeData;
    BinaryTree<T> leftTree;
    BinaryTree<T> rightTree;

    public BinaryTree() {
        nodeData = null;
        leftTree = null;
        rightTree = null;
        rightTree = new BinaryTree<T>();
    }
}

class NodeData {
	int data = 0;// ��ֵ
	int index = 1;// ��������������ʼֵΪ1�����ֵΪMAXLEN
	String aa="maxiaodong";
}
