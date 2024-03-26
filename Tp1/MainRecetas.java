public class MainRecetas {
    public static void main(String[] args) {
        // Creo instancias de recetas
        Recetas huevoDuro = new HuevoDuro();
        Recetas pastaCarbonara = new PastaCarbonara();
        Recetas ensaladaCesar = new EnsaladaCesar();

        // Muestro detalles de las recetas
        System.out.println("Receta de Huevo Duro:");
        System.out.println("Tiempo de cocción: " + huevoDuro.getTiempoCoccion() + " minutos");
        System.out.println("Incredientes:");
        for (Incredientes incredientes : huevoDuro.getIncredientes()) {
            System.out.println(incredientes);
        }
        System.out.println("Preparación: " + huevoDuro.getPreparacion());
        System.out.println();


        // Muestro detalles de las recetas
        System.out.println("Pasta Carbonara:");
        System.out.println("Tiempo de cocción: " + pastaCarbonara.getTiempoCoccion()+ " minutos");
        System.out.println("Incredientes:");
        for (Incredientes incredientes : pastaCarbonara.getIncredientes()) {
            System.out.println(incredientes);
        }
        System.out.println("Preparación: " + pastaCarbonara.getPreparacion());
        System.out.println();
    }
}
