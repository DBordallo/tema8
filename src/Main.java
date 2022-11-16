public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

    // dar valor a las propiedades
        persona.setNombre("Pepe");
        persona.setEdad(25);
        persona.setTelefono(915692417);


        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getTelefono());
    }
}
    // crear clase persona
class Persona {

    // crear las variables provadas

    private String nombre;
    private int edad;
    private int telefono;


    // gets para cada propiedad

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // set para cada propiedad

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getTelefono() {
        return this.telefono;
    }
}