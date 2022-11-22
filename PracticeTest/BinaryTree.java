public class BinaryTree {

    public static double calculateFormulaTree(Node node) {
        
        if (node.left == null) {
            return node.number;
        }
        else if (node.right == null) {
            return node.number;
        }
        else {
            char operation = node.operator;
            Node l = node.left;
            Node r = node.right;


            if (operation == '+') {
                return calculateFormulaTree(l)+ calculateFormulaTree(r);
            } else if (operation == '-') {
                return calculateFormulaTree(l)- calculateFormulaTree(r);
            } else if (operation == '*') {
                return calculateFormulaTree(l)* calculateFormulaTree(r);
            } else if (operation == '/') {
                return calculateFormulaTree(l)/ calculateFormulaTree(r);
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {

        Node seven = new Node(7.0);
        Node one = new Node(1.0);
        Node four = new Node(4.0);
        Node three = new Node(3.0);
        Node seventeen = new Node(17.0);
        Node five = new Node(5.0);
        
        Node leftAdd = new Node('+', seven, one);
        Node leftDivide = new Node('/', leftAdd, four);
        Node leftMultiply = new Node('*', three, leftDivide);
        Node rightSubtract = new Node('-', seventeen, five);
        Node baseNode = new Node('+', leftMultiply, rightSubtract);

        System.out.println(calculateFormulaTree(baseNode));
    }
}

enum NodeTypes { NUMBER, OPERATOR }

class Node {
    NodeTypes type;
    double number;
    char operator;
    Node left;
    Node right;

    Node(char operator, Node left, Node right) {
        type = NodeTypes.OPERATOR;
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    Node(double number) {
        type = NodeTypes.NUMBER;
        this.number = number;
    }
}
