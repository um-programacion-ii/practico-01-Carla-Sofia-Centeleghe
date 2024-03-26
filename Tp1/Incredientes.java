public class Incredientes {
    protected String nombre;
    protected int cantidad = 0;

    public Incredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void sacar(int cantidadASacar) {
        if (cantidadASacar > 0 && cantidadASacar <= cantidad) {
            cantidad -= cantidadASacar;
            System.out.println("Se sacaron " + cantidadASacar + " unidades de " + nombre);
        } else {
            System.out.println("No hay mas incredientes.");
        }
    }
    public String toString() {
        return "Incrediente{nombre='" + this.nombre + "', cantidad=" + this.cantidad + "}";
    }
}

