public class Ejercicio_tema_9 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Omar";
        cliente.edad = 30;
        cliente.telefono =1234567799;
        cliente.credito = 500.45;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.nombre = "Antonio";
        trabajador.edad = 35;
        trabajador.telefono = 333888999;
        trabajador.salario = 2500.95;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");

    }
}

class Persona {
    int edad;
    int telefono;
    String nombre;
    }


class Cliente extends Persona {
        double credito;

    }
class Trabajador extends Persona {
        double salario;
    }
