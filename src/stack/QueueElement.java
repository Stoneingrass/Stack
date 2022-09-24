package stack;

public class QueueElement {
    //fields
    private int value;
    private QueueElement nextElement;


    //constructor
    public QueueElement(int value) {
        this.value=value;
        nextElement=null;
    }


    //getters
    public QueueElement getNextElement() {
        return nextElement;
    }
    public int getValue() {
        return value;
    }
    //setters
    public void setNextElement(QueueElement nextElement) {
        this.nextElement = nextElement;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
