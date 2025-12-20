/*Deadlock :
   ->deadlock in java is an situation were two or more threads are locked forever,waiting for each other.
   ->A java multi threading program may suffer from the deadlock condition because the synchronized keyword
      causes the executing thread to block while waiting for the lock.  
*/

class Family implements Runnable{
    String resource1="TV";
    String resource2="playstation";
    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("CR")==true){
            crAccquiredResource();
        }
        else{
            mokshaAccquiredResource();
        }
    }
    void crAccquiredResource(){
        synchronized(resource2){
            try{
                System.out.println("CR accquried the playstation");
                Thread.sleep(2000);
                synchronized(resource1){
                    System.out.println("CR accquired TV");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println("rohit failed");
            }
        }
    }
    void mokshaAccquiredResource(){
        synchronized(resource1){
            try{
                System.out.println("Moksha accquried the TV");
                Thread.sleep(2000);
                synchronized(resource2){
                    System.out.println("Moksha accquired playstation");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println( "moksha failed");
            }
        }
    }
}


public class ExampleforDeadlock {
    public static void main(String[] args) {
        Family f=new Family();
        Thread t1=new Thread(f);
        Thread t2=new Thread(f);
        t1.setName("CR");
        t2.setName("Moksha");
        t1.start();
        t2.start();
    }
}
