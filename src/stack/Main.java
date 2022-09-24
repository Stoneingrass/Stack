package stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QueueOfInt array = new QueueOfInt();

        int input;
        boolean isExit=false;

        do {
            System.out.println("\nChoose your action.");
            System.out.println("1. Add some elements in the queue.");
            System.out.println("2. Output the queue.");
            System.out.println("3. Add an element in the start of the queue.");
            System.out.println("4. Add an element in the end of the queue.");
            System.out.println("5. Delete an element in the queue.");
            System.out.println("6. Exit.");

            input= scanner.nextInt();

            switch (input) {
                case 1:
                    inputQueue(array);
                    break;
                case 2:
                    outputQueue(array);
                    break;
                case 3:
                    addElementToStart(array);
                    break;
                case 4:
                    addElementToEnd(array);
                    break;
                case 5:
                    deleteElement(array);
                    break;
                case 6:
                    isExit=true;
                    break;
                default:
                    System.out.println("You choose incorrect option, retry please.");
            }
        } while (!isExit);
    }


    static void inputQueue(QueueOfInt array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of elements.");
        int n = scanner.nextInt();

        for (int i=0; i< n; i++) {
            System.out.print("element [" + array.getQuantity() + "]: ");
            array.addElementToEnd(scanner.nextInt());
        }
    }

    static void outputQueue(QueueOfInt array) {
        if(array.getQuantity()==0) {
            System.out.println("The queue is empty.");
            return;
        }

        System.out.println("The queue:");
        for (int i=0; i<array.getQuantity(); i++) {
            System.out.println("element [" + i + "]: " + array.getValueNthElement(i));
        }
    }

    static void addElementToEnd(QueueOfInt array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input new element value: ");
        int value = scanner.nextInt();

        array.addElementToEnd(value);
    }

    static void addElementToStart(QueueOfInt array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input new element value: ");
        int value = scanner.nextInt();

        array.addElementToStart(value);
    }

    static void deleteElement(QueueOfInt array) {
        if(array.getQuantity()==0) {
            System.out.println("The queue is empty.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input element number: ");
        int n= scanner.nextInt();

        array.deleteNthElement(n);
    }
}