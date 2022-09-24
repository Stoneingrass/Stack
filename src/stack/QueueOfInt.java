package stack;

public class QueueOfInt {
    //fields
    private QueueElement firstElement;
    private QueueElement lastElement;
    private int quantity;


    //constructor
    public QueueOfInt() {
        firstElement=null;
        lastElement=null;
        quantity=0;
    }


    //getters
    public QueueElement getFirstElement() {
        return firstElement;
    }
    public QueueElement getLastElement() {
        return lastElement;
    }
    public int getQuantity() {
        return quantity;
    }


    //public methods
    public void addElementToStart(int newElement) {
        if(quantity==0) {
            firstElement = new QueueElement(newElement);
            lastElement = firstElement;
        }
        else {
            QueueElement temp = new QueueElement(newElement);
            temp.setNextElement(firstElement);
            firstElement = temp;
        }
        quantity++;
    }

    public void addElementToEnd(int newElement) {
        if(quantity==0) {
            firstElement = new QueueElement(newElement);
            lastElement = firstElement;
        }
        else {
            QueueElement temp = new QueueElement(newElement);
            lastElement.setNextElement(temp);
            lastElement=temp;
        }
        quantity++;
    }

    public int getValueNthElement(int elementNumber) {
        if (isStackOverflow(elementNumber)) {
            return 0;
        }

        QueueElement temp = firstElement;
        for (int i=0; i<elementNumber; i++) {
            temp=temp.getNextElement();
        }
        return temp.getValue();
    }

    public void setValueNthElement(int value, int elementNumber) {
        if (isStackOverflow(elementNumber)) {
            return;
        }

        QueueElement temp = firstElement;
        for (int i=0; i<elementNumber; i++) {
            temp=temp.getNextElement();
        }
        temp.setValue(value);
    }

    public void deleteNthElement(int elementNumber) {
        if (isStackOverflow(elementNumber)) {
            return;
        }

        if (elementNumber == 0) {
            firstElement = firstElement.getNextElement();
            if (quantity==1) {
                lastElement=null;
            }
        }
        else {
            QueueElement temp = firstElement;
            for (int i = 0; i < elementNumber-1; i++) {
                temp = temp.getNextElement();
            }
            temp.setNextElement(temp.getNextElement().getNextElement());

            if (elementNumber==quantity-1) {
                lastElement=temp;
            }
        }

        quantity--;
    }


    //private methods
    private boolean isStackOverflow (int n) {
        if (n>=quantity) {
            System.out.println("Error. The element has this number do not exist!");
            return true;
        }
        else {
            return false;
        }
    }
}
