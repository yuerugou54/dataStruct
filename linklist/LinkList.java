package linklist;

public class LinkList<T> {
	public T data;
	public LinkList<T> next;

	public LinkList(T t) {
		data = t;
	}

	public LinkList() {

	}

	public LinkList<T> initalLinkList(T[] arrT) {
		LinkList<T> linkList = new LinkList<>(arrT[0]);
		for (int i = 1; i < arrT.length; i++) {
			LinkList<T> temp = linkList;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new LinkList<>(arrT[i]);
		}
		return linkList;
	}

	public void printLink(LinkList<T> linkList) {
		while (linkList != null) {
			System.out.print(linkList.data + "\n");
			linkList = linkList.next;
		}
	}

}
