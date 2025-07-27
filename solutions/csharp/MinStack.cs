public class MinStack
{
    private Node head;

    public MinStack()
    {
        head = null;
    }

    public void Push()
    {

    }

    public void Pop()
    {

    }

    public int Top()
    {

    }

    public int GetMin()
    {

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
