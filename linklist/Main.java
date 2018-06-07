package linklist;

public class Main {
	private int count = 1;

	public static void main(String[] arg) {
		LinkList<Integer> linkList = new LinkList<Integer>();
		Integer[] arrT = { 5, 4, 3, 2, 1 };
		linkList = linkList.initalLinkList(arrT);
		linkList = Main.ReverseList(linkList);
		while (linkList != null) {
			System.out.println(linkList.data);
			linkList = linkList.next;
		}
		Main main = new Main();
		try {
			main.call();
		} catch (Exception e) {
			System.out.println("stack length:" + main.count);
			// throw e;
		}

	}

	// 将整个链表翻转
	public static LinkList<Integer> ReverseList(LinkList<Integer> head) {
		LinkList<Integer> temp = null;
		LinkList<Integer> htemp = null;
		while (head != null) {
			temp = head;
			head = head.next;
			temp.next = htemp;
			htemp = temp;
		}
		return temp;
	}

	public void call() {
		count++;
		call();
	}

}
