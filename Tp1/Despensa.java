public class Despensa {
    private Incredientes[] incredientes;
    private int numIncredientes;
    private String nombre;

    public Despensa(int capacidad) {
        incredientes = new Incredientes[capacidad];
        numIncredientes = 0;
    }

    public void addIncrediente(Incredientes incrediente) {
        if (numIncredientes < incredientes.length) {
            incredientes[numIncredientes] = incrediente;
            numIncredientes++;
            System.out.println("Incrediente agregado a la despensa: " + incrediente.getNombre());
        } else {
            System.out.println("Despensa llena, no se puede agregar más incredientes.");
        }
    }

    public void getIncredientes(String nombreIncrediente, int cantidad) {
        for (int i = 0; i < numIncredientes; i++) {
            Incredientes incrediente = incredientes[i];
            if (incrediente.getNombre().equals(nombreIncrediente)) {
                incrediente.sacar(cantidad);
                return;
            }
        }
        System.out.println("Incrediente no encontrado");
    }

}
