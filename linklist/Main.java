package linklist;

public class Main {
	public static void main(String[] arg) {
		LinkList<Integer> linkList = new LinkList<Integer>();
		Integer[] arrT = { 5, 4, 3, 2, 1 };
		linkList = linkList.initalLinkList(arrT);
		linkList = Main.ReverseList(linkList);

		linkList.printLink(linkList);

		FindKthToTail.FindKthToTail_2(linkList, 12);

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

}
