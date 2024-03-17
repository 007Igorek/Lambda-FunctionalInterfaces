public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error_listener = System.out::println;
        Worker worker = new Worker(listener, error_listener);
        worker.start();
    }
}
