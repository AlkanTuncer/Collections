package day060.stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        // Stack ögrenilmesi gereken metotlar : push / pop / peek
        // Last in First out - LIFO

        myStack.push("Dante");
        myStack.push("Dante53");

        System.out.println("MyStack : "+myStack);

        System.out.println("Peek ile alınan elaman : "+myStack.peek());  // peek her zaman son elemanı gösterir ama silmez pop gibi.
        System.out.println("MyStack : "+myStack);

        String pop = myStack.pop();

        System.out.println("Pop (Çekilen Eleman) : "+pop);
        System.out.println("Pop'tan sonra MyStack : "+myStack);

        myStack.push(pop);  // pop ile çekileni tekrar ekledim değişkende tuttugum için.
        System.out.println(myStack);

    }
}
