public class ChefService {
    private Despensa despensa;
    private Incredientes[] incredientesRecetas;

    public ChefService(Despensa despensa) {
        this.despensa = despensa;
    }

    public void prepararReceta(Recetas receta) {
        System.out.println("Chef " + despensa.getIncredientes() + " preparando la receta...");

        boolean ingredientesSuficientes = verificarIncredientes(receta);
        if (ingredientesSuficientes) {
            System.out.println("Ingredientes suficientes. Comenzando la preparación de la receta.");
            System.out.println("Receta preparada con éxito.");

            // Mostrar cantidad de ingredientes restantes en la despensa
            System.out.println("Cantidad de ingredientes restantes en la despensa:");
            for (Incredientes incrediente : despensa.getIncredientes()) {
                if (incrediente != null) {
                    System.out.println(incrediente);
                }
            }
        } else {
            System.out.println("No alcanzan los ingredientes de la despensa para preparar la receta.");
        }
    }

    private boolean verificarIncredientes(Recetas receta) {
        Incredientes[] incredientesReceta = receta.getIncredientes();
        for (Incredientes incredienteReceta : incredientesReceta) {
            if (incredienteReceta != null) {
                boolean incredienteEnDespensa = false;
                for (Incredientes incredienteDespensa : despensa.getIncredientes()) {
                    if (incredienteDespensa != null && incredienteReceta.getNombre().equals(incredienteDespensa.getNombre())) {
                        incredienteEnDespensa = true;
                        if (incredienteDespensa.getCantidad() < incredienteReceta.getCantidad()) {
                            int cantidadFaltante = incredienteReceta.getCantidad() - incredienteDespensa.getCantidad();
                            System.out.println("Faltan " + cantidadFaltante + " unidades de " + incredienteReceta.getNombre() + " en la despensa.");
                        }
                        break;
                    }
                }
                if (!incredienteEnDespensa) {
                    System.out.println("No se encuentra " + incredienteReceta.getNombre() + " en la despensa.");
                    return false;
                }
            }
        }
        return true;
    }
}