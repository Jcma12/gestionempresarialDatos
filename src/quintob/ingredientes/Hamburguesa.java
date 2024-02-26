package quintob.ingredientes;

   public class Hamburguesa{
        private String sabor;
        private String presentacion;
        private Lechuga lechuga;
        private int i;
        private Lechuga[] arreglo = new Lechuga[50];
        public Hamburguesa(){
            Pan p= new Pan();
            Carne c= new Carne();
            this.sabor="Bueno";
            this.i=0;
        }

       public void addLechuga(Lechuga lechuga){
            arreglo[this.i]=lechuga;
            i++;
        }
        public Lechuga getlechuga(int k){
            Lechuga tmp=null;
            if (k< this.i) {
                System.out.println("entregando la lechuga numero" +k);
                tmp = this.arreglo[k];
            }
            else
                System.out.println("error, valor no existe");

            return tmp;
        }
    }
