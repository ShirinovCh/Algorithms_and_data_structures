package Task_1_Stack;

public class Stack {
    private int maxSize;
    private char [] stackArr;
    private int top;

    public Stack ( int size ) {
        this.maxSize = size;
        this.stackArr = new char[size];
        this.top = -1;
    }

    public void push ( char i ){// add item
        stackArr [++top ] = i;
    }

    public char pop (){//delete item
        return stackArr [ top --];
    }

    public boolean isEmpty (){ //check stack is empty
        return ( top == -1 );
    }

/*    public boolean isFull (){ //check stack is full
        return ( this . top == this . maxSize - 1 );
    }

    public int pop (){//delete item
        return this . stack [ this . top --];
    }

    public int peek (){//get item
        return this . stack [ this . top ];
    }
*/
}
