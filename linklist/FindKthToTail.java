package linklist;

import java.util.Stack;

public class FindKthToTail {

	// ����1��ʹ������ָ�롣��ָ��ľ���ʼ�����i,ע������³����
	public static LinkList<Integer> FindKthToTail_1(LinkList<Integer> root, int i) {
		LinkList<Integer> temp1, temp2;
		temp1 = temp2 = root;
		int count = 0;// �õ�������
		if (i <= 0)
			return null;// ע�����³���ԣ�iֵ�����쳣
		while (temp1 != null) {
			temp1 = temp1.next;
			count++;
			if (count >= i && temp1 != null) {
				temp2 = temp2.next;
			}
		}
		if (count < i)
			return null;
		System.out.println("����ǣ�" + temp2);
		temp2.printLink(temp2);
		return temp2;

	}

	// ����2��ʹ��ջ������
	public static <T> LinkList<T> FindKthToTail_2(LinkList<T> root, int i) {
		Stack<LinkList<T>> stack = new Stack<>();
		if (i < 1)
			return null;
		while (root != null) {
			stack.push(root);
			root = root.next;
		}
		LinkList<T> node = null;
		while (i > 0) {
			try {
				node = stack.pop();
				i--;
			} catch (Exception e) {
				// TODO: handle exception
				return null;
			}

		}
		System.out.println("���");
		node.printLink(node);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
