//Create two threads to print odd numbers and even numbers from 1 to 100?
class PrintOddEven implements Runnable {
    private final int max;
    private final boolean isEvenNumber;
    private static int number = 1;
    private static final Object lock = new Object();

    PrintOddEven(int max, boolean isEvenNumber) {
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    
    public void run() {
        while (true) {
            synchronized (lock) {
                // Check if number exceeds the max limit
                if (number > max) {
                    break;
                }
                // Check if the number is even or odd based on the flag
                if ((number % 2 == 0) == isEvenNumber) {
                    // Print the number and increment
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    // Notify the other thread waiting on the lock
                    lock.notify();
                } else {
                    // If the number doesn't match the required type, wait for the other thread to notify
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class PrintOddEvenNumbers {
    public static void main(String[] args) {
        // Create two threads for printing odd and even numbers
        Thread oddThread = new Thread(new PrintOddEven(100, false), "OddThread");
        Thread evenThread = new Thread(new PrintOddEven(100, true), "EvenThread");

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}