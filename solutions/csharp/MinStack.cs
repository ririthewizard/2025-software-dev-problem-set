public class MinStack
{
    private Node head;

    public MinStack()
    {
        head = null;
    }

    public void Push()
    {
        if (head == null)
        {
            head = new Node(val, val);
        }
        else
        {
            head = new Node(val, Math.Min(val, head.MinValue), head);
        }
    }

    public void Pop()
    {
        head = head.Next;
    }

    public int Top()
    {
        return head.Value;
    }

    public int GetMin()
    {
        return head.MinValue;
    }

    private class Node
    {
        public Node(int value, int minValue, Node next = null)
        {
            Value = value;
            MinValue = minValue;
            Next = next;
        }

        public int Value { get; set; }
        public int MinValue { get; set; }
        public Node Next { get; set; }
    }
}
