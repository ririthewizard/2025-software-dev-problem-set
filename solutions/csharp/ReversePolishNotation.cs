public class Solution
{
    public int EvalRPN(string[] tokens)
    {
        Stack<int> stack = new Stack<int>();

        foreach (string token in tokens)
        {
            if (isOperator(token))
            {
                int right = stack.Pop();
                int left = stack.Pop();

                int calculated = Calculate(left, right, token);
                stack.Push(calculated);
            }
            else
            {
                stack.Push(int.Parse(token));
            }
        }

        return stack.Peek();

    }

    public bool isOperator(string str)
    {
        return (
                str == "+" || str == "-" || str == "*" || str == "/"
               );
    }

    public Calculate(int a, int b, string op)
    {
        switch (op)
        {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}
