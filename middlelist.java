public class middlelist {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public static middlelist.ListNode insert(ListNode head, int val) {
            ListNode node = new ListNode(val);
            if (head == null)
                return node;
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            return head;
        }

        public static void print(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + "->");
                current = current.next;
            }
            System.out.println("null");
        }

        public static middlelist.ListNode middleNode(ListNode head) {
            ListNode current = head;
            
            int c = 1;
            while (current.next != null) {
                c++;
                current = current.next;
            }
            System.out.println(c);
            current = head;
            int k = 1;
            if (c % 2 == 1) {
                c = (c +1) / 2;

                while (current.next != null) {
                    k++;
                    if (k == c) {
                        head = current.next;
                    } else {
                        current = current.next;
                    }
                }
            }
            else{
                c=(c/2)+1;
                while (current.next != null) {
                    k++;
                    if (k == c) {
                        head = current.next;
                    } else {
                        current = current.next;
                    }
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = ListNode.insert(head, 1);
        head = ListNode.insert(head, 2);
        head = ListNode.insert(head, 3);
        head = ListNode.insert(head, 4);
        head = ListNode.insert(head, 5);
        
     
        
       
        ListNode.print(head);
        head=ListNode.middleNode(head);
        ListNode.print(head);
    }

}
