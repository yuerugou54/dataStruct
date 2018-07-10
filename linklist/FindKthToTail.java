package linklist;

import java.util.Stack;

public class FindKthToTail {

	// 方法1，使用两个指针。两指针的距离始终相差i,注意代码的鲁棒性
	public static LinkList<Integer> FindKthToTail_1(LinkList<Integer> root, int i) {
		LinkList<Integer> temp1, temp2;
		temp1 = temp2 = root;
		int count = 0;// 得到链表长度
		if (i <= 0)
			return null;// 注意代码鲁棒性，i值不能异常
		while (temp1 != null) {
			temp1 = temp1.next;
			count++;
			if (count >= i && temp1 != null) {
				temp2 = temp2.next;
			}
		}
		if (count < i)
			return null;
		System.out.println("结果是：" + temp2);
		temp2.printLink(temp2);
		return temp2;

	}

	// 方法2，使用栈来操作
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
		System.out.println("输出");
		node.printLink(node);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
