package lab3_2;

public class Main {

    public static void main(String[] args){

        Stack s = new Stack();

        s.createNew(10);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped :"+ s.pop());

        s.display();

        if(s.empty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }

    }
}
