package edu.co.caldas.engineering.accessmodifier;

public class Main {
	
    public static void main(String[] args) {

        //METODO DE ACCESO PUBLICO
        /*
        * El metodo de acceso publico
        * permite tanto como atributos como metodos, acceder en cualquier lugar del proyecto
        * */
        PersonPublic person = new PersonPublic();
        person.setName("Maria Fernanda");
        person.setAge((int) 20);
        System.out.println(person.name);
        System.out.println(person.getName());

        //METODO DE ACCESO PROTECTED
        /*
        * El metodo de acceso protected, limita a la clase
        * a funcionar por fuera del paquete origen.
        * Descomentar el codigo de abajo para visualizar el error,
        * ver funcionar con protected ir a
        * @see org.laboratorio.encapsulacion.modificadores.acceso.protegido.Main.java
         * */
        //PersonaP personaP = new PersonaP();
        //personaP.getNombre();

        //METODO DE ACCESO PRIVADO
        PersonPrivate personPrivate = new PersonPrivate();
        /*
        Un atributo o metodo con modificador de acceso private no puede modificar ni acceder
        su contenido directamente, descomentar codigo para ver el error
        probar en:
        @see org.laboratorio.encapsulacion.modificadores.acceso.privado.PersonaPrivate
        Ya que los tipo private, solo funcionan en su propia clase
        */
        //personaPrivate.nombre = "Mafe";
        //System.out.println(personaPrivate.nombre);
        //personaPrivate.getNombre();

        /*MODIFICADOR DE ACCESO DEFAULT*/
        /*
        * El modificador de acceso default es similar al protected, es decir,
        * solo funciona a nivel del mismo paquete, la diferencia es que los atributos
        * o metodos con protected, puede ser accedidos si son heredados aunque sea en
        * otro paquete, mientras que los default no, visualizar el funcionamiento
        * @see
        * */
        /*
        PersonaDefault personaDefault = new PersonaDefault();
        personaDefault.nombre = "dfs";
        personaDefault.setEdad(12);*/

    }

}
