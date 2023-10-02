public class App {
    public static void main(String[] args) throws Exception {
        if(args.length != 1) {
            System.out.println("Usage: java ParallelExecutionApp <NAME>");
            System.exit(1);
        }

        String name = args[0];

        for (int x = 1; x <= 15; x++) {
            System.out.println("Hello i am " + name + " and i am printing the number " + x);

            int randomTime = (int) Math.round(Math.random() * ((5 - 1 ) + 1));
            try {
                Thread.sleep(randomTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
