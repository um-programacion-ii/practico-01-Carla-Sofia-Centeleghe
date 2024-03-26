public class Recetas {
        protected int tiempoCoccion;
        protected Incredientes[] incredientes;
        protected String preparacion;

        public Recetas(int tiempoCoccion, Incredientes[] incredientes, String preparacion) {
            this.tiempoCoccion = tiempoCoccion;
            this.incredientes = incredientes;
            this.preparacion = preparacion;
        }

        public int getTiempoCoccion() {
            return tiempoCoccion;
        }

        public void setTiempoCoccion(int tiempoCoccion) {
            this.tiempoCoccion = tiempoCoccion;
        }

        public Incredientes[] getIncredientes() {
            return incredientes;
        }

        public void setIncredientes(Incredientes[] incredientes) {
            this.incredientes = incredientes;
        }

        public String getPreparacion() {
            return preparacion;
        }

        public void setPreparacion(String preparacion) {
            this.preparacion = preparacion;
        }


}
