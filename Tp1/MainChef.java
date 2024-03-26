public class MainChef {
    public static void main(String[] args) {
        Despensa despensa = new Despensa(5);
        despensa.addIncrediente(new Incredientes("Huevo", 6));
        despensa.addIncrediente(new Incredientes("Pasta", 300));
        despensa.addIncrediente(new Incredientes("Bacon", 200));
        despensa.addIncrediente(new Incredientes("Queso Parmesano", 100));

        CocinaService cocinaService = new CocinaService(despensa);
        Chef chef = new Chef("Juan", 3);

        System.out.println(chef);
        cocinaService.prepararReceta(new HuevoDuro());
        System.out.println("-------------------------");
        cocinaService.prepararReceta(new PastaCarbonara());
    }
}

