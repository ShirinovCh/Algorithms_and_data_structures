package Task_1_Queue;

public class QueueApp {
    public static void main ( String [] args ){
        Queue q = new Queue ( 5 );
        q . insert ( 10 );
        q . insert ( 20 );
        q . insert ( 30 );
        q . insert ( 40 );
        q . insert ( 50 );
        q . remove ();
        q . remove ();
        q . insert ( 60 );
        q . insert ( 70 );
        q . insert ( 80 );
        q . insert ( 90 );
        while ( ! q . isEmpty () ){
            int n = q . remove ();
            System . out . println ( n );
        }
    }
}
