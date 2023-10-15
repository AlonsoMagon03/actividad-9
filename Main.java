/*
Cree una clase Perro, agregue los atributos que usted crea necesarios. Recuerde aplicar el modificador private a estos atributos, así como diseñar los métodos getters y setters para cada uno de ellos, y con esto implementar la encapsulamiento.
Adicionalmente diseñe 2 métodos:
1) Método comer, que reciba de parámetro un String que diga qué tipo de comida es y otro parámetro double que indique la cantidad en gramos. Este método no regresa valor. Haga dentro de este método lo que usted considere pertinente.
2) Método ladrar, no recibe parámetros pero regresa el mensaje "guau guau"
En otra clase dentro del mismo proyecto cree una clase con un método main, y ahí:
a) Instancie 2 objetos de la clase Perro. Los datos de nombre, raza, edad o cualquier atributo que haya definido deben ser capturados desde consola con objeto Scanner o bien, con un cuadro de diálogo JOptionPane.
b) Invoque los dos métodos que diseñó para cada perro.
c) Recuerde manejar sus excepciones, especialmente al capturar datos numéricos.
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){
        Perro A = new Perro();
        A.getcomida();
        A.Ladrar();
        A.getnombre();
        A.getraza();
        A.getedad();
    }


}
