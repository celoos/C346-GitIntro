public class Node implements ILinkedList {
    Node next;
    Object data;
    
    public Node(Object value) {
        next = null;
        data = value;
    }
    
    public Node(Object value, Node nextNode)
    {
        next = nextNode;
        data = value;
    }
    
    @Override
    public ILinkedList next() {
        return this.next; 
    }

    @Override
    public ILinkedList last() {
        Node curr = this;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public ILinkedList after(int n) {
        Node curr = this;
        for(int i = 0; i < n; i++)
        {
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public ILinkedList detach() {
        Node curr = this;
        Node next = this;
        
        next = curr.next;
        curr.next = null;
        
        return next;
    }

    @Override
    public Object get() {
        return this.data;
    }

    @Override
    public void set(Object value) {
        this.data = value;
    }

    @Override
    public void setNext(ILinkedList next) {
        this.next = (Node) next;
    }

    @Override
    public void append(ILinkedList next) {
        Node newNext = (Node) next;
        
        Node lastElement = (Node) this.last();
        lastElement.next = newNext;
    }

    @Override
    public void insert(ILinkedList newFirst) {
        newFirst.append(this);
    }

}
