public class main2 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            new Thread(new MAIN(), String.valueOf(i)).start();
        }
    }
}
