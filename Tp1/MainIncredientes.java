public class MainIncredientes {
    public static void main(String[] args) {
        // Creo los incredientes
        Incredientes harina = new Incredientes("Harina", 1000);
        Incredientes azucar = new Incredientes("Azúcar", 500);

        // Creo la  despensa
        Despensa despensa = new Despensa(10);

        // Relleno la despensa con incredientes
        despensa.addIncrediente(harina);
        despensa.addIncrediente(azucar);

        // Saco una cantidad de la despensa
        despensa.getIncredientes("Harina", 300);
        despensa.getIncredientes("Azúcar", 200);

    }
}
