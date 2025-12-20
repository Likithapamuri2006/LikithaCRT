//A thead is used to perform parallel excution in java.

/*types of thread: both of which can use to implement parallel processing in java depending on priority and importance 
of the task . 
*
1. user Thread: JVM will wait for all the active user thread to complete their 
execution before it shutdown itself
*
2. Daemon Thread: does not get the preference ,JVM will exit and close the java program 
even if there is daemon thread running in the background. 
*/

class Demo1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("user thread is excuting");
            try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("some problem occured");
        }

    }
}
}
class Demo2 extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("Deamon thread is executing");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("some problem occured");
            }
        }
    }
}


public class Typesofthread{
    public static void main(String[] args) {
        System.out.println("Main() started excuting");
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        d2.setDaemon(true);

        d1.start();
        d2.start();
        System.out.println("Main() stopped working");
        }
}