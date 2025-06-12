

class Node{
    int val ;
    Node next ;
    Node(int val){
        this.val = val ;
        next = null ;
    }
}
class MyLinkedList {
    Node head = null ;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node curr = head ;
        if(head == null){
            return -1 ;
        }
        int i = 0 ;
        while(curr != null && i < index){
            curr = curr.next ;
            i ++ ;
        }
        if(curr == null){
            return -1 ;
        }
        return curr.val ;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode ;
            return ;
        }
        else{
            newnode.next = head ;
            head = newnode ;
        }
    }
    
    public void addAtTail(int val) {
        Node curr = head ;
        Node newnode = new Node(val) ;
        if(head == null){
            head = newnode ;
            return ;
        }
        while(curr.next != null){
            curr = curr.next ;
        }

        curr.next = newnode ;   
    }
    
    public void addAtIndex(int index, int val) {
        Node newnode = new Node (val);
        Node curr = head ;
        if(index == 0){
            newnode.next = head ;
            head = newnode ;
            return ;
        }
        
        for(int i = 0; i < index-1 ;i ++){
            if(curr != null){
                curr = curr.next ;
            }
            else{
                return ;
            }
        }
        if(curr == null){
            return ;
        }
        newnode.next = curr.next ;
        curr.next = newnode ;
    }
    
    public void deleteAtIndex(int index) {
        Node curr = head ;
        if(index == 0){
            if(head == null){
                return ;
            }
            head = curr.next ;
            return ;
        }
        for(int i = 0 ;i < index-1 ;i ++){
            if(curr.next != null){
                curr = curr.next ;
            }
        }
        if(curr == null){
            return ;
        }
        if(curr.next != null){
            curr.next = curr.next.next ;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */