public class MainIncredientes {
    public MainIncredientes() {
    }

    public static void main(String[] args) {
        Incredientes incrediente1 = new Incredientes("Harina", 500);
        Incredientes incrediente2 = new Incredientes("Azúcar", 250);
        System.out.println("Incrediente 1: " + String.valueOf(incrediente1));
        System.out.println("Incrediente 2: " + String.valueOf(incrediente2));
    }
}
