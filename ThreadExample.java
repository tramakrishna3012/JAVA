class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();
        System.out.println("Thread state: " + t1.getState());
        System.out.println("Thread priority: " + t1.getPriority());
        System.out.println("Thread ID: " + t1.getId());
        System.out.println("Thread name: " + t1.getName());
    }
}