package dos.ejemplos;

public class pajaro {
    
    //sirve como contador del numero de pajaros creados
        static int numpajaros=0; 

        static void nuevopajaro() {
            numpajaros++;
        };

     //*** atributos o propiedades ****
        private char color; //propiedad o atributo color 
        private int edad; //propiedad o atributo edad 
        private String nombre; ///propiedad o atributo nombre;
        //podemos crear varios atributos con el valor de String, pero por constructor solo se puede incluir uno de ellos no los dos.
        private String apellido;


        //Constructor por defecto
        //el constructor por defecto no anula al constructor con todos los parametros
        pajaro() {
            nuevopajaro();
        }
        
        //constructor con dos parametros

        pajaro(char color, int edad) {
            this.color=color;
            this.edad=edad;
            nuevopajaro();
        }

        //constructor con un parametro.
        pajaro(String nombre) {
            this.nombre = nombre;
            nuevopajaro();
        }

        // Contructor con todos los parametros
         pajaro(char color, int edad, String nombre) {
            this.color = color;
            this.edad = edad;
            this.nombre = nombre;
            nuevopajaro();
        }

        //*** métodos de la clase **** 
        public void setNombre(String n) {
            this.nombre = n;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setEdad(int e){
            this.edad = e;
        } 

        public int getEdad() {
            return this.edad;
        }

        public void setColor(char c){
            this.color=c;
        } 

        public char getColor() {
            return this.color;
        }

        
        //creamos el metodo toString
        @Override
        public String toString() {
            return "pajaro [color=" + color + ", edad=" + edad + ", nombre=" + nombre + "]";
        }

        //El metodo imprimecolor lo documentamos ya que no necesitamos utilizar al tener los getters y setters.

        /*public void imprimecolor(){ 

        switch(color){

        //Los pájaros son verdes, amarillos, grises, negros o blancos 
        //No existen pájaros de otros colores
        case 'v': 
        System.out.println("verde");
        break; 

        case 'a': 
        System.out.println("amarillo");
        break; 

        case 'g': 
        System.out.println("gris");
        break;
        
        case 'n': 
        System.out.println("negro");
        break; 

        case 'b': 
        System.out.println("blanco");
        break; 

        default:
        System.out.println("color no establecido");
    
            }
        }
*/
        public void imprimenombre() {
            System.out.println(nombre);
        }

        // public void imprimeedad() {
        //     System.out.println(edad);

        // }
    }
