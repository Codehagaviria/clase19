import java.sql.SQLOutput;

public class Persona {

        private String nombre;   //Modificadores de acceso se define si es público, protegido, privado
        private  int edad;
        //metodo constructor
        public Persona(String nombre, int edad){   //2. el metodo debe ser publico para la clase Persona
                                                   // por cada defincion de variable privado debe ir publico
                                                   // en la clase persona, debe ser colocado en el mismo orden
                                                   //de definicion de las variables en public class persona
            this.nombre = nombre;
            this.edad = edad;                       //3.acceda al elemento
        }
        //metodo get
        public String getNombre(){                  //4.
            return this.nombre;
        }
        public int getEdad() {                      //4.
            return this.edad;
        }
        //metodo set

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }

        //metodo principal
        public static void main(String[] args) {
            Persona persona = new Persona("Gaviria",10);
            System.out.println("Nombre" + persona.getNombre());
            System.out.println("Edad" + persona.getEdad());
        }

}

