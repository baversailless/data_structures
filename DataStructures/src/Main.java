
public class Main {
    public static void main(String[] args) {/*
        MyArrayList<Integer> arr = new MyArrayList<>();
        for (int i = 1; i < 12; i++)
            arr.add(i);

        System.out.println(arr);
        arr.toArray();
        System.out.println(arr);
    }
}*/

      /* MyLinkedList<Integer> list = new MyLinkedList<>();
        for(int i = 1; i < 6; i++) {
            list.add(i);
        }


        System.out.println(list);

        list.swap(3,4);
        System.out.println(list);
        System.out.println(list.length());*/

       /* MyStack<Integer> s = new MyStack<>();

        for(int i=1; i<6; i++)
        {
            stack.push(i);
        }
    stack.multipop(4);
        System.out.println(stack.top());*/

        MyQueue<Integer> queue = new MyQueue<>();
        for(int i=0; i<10; i++)
        {
            queue.push(i);
        }
        System.out.println(queue.top());
        queue.pop();
        System.out.println(queue.top());


    }
}


















