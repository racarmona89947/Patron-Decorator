// Esta línea declara el paquete "Decorator" al que pertenece la clase.
package model;
//Declaración de la clase "Tomate" que hereda de la clase "DecoradorHamburguesa".
public class Tomato extends BurgerDecorator { 
	// Declaración de un atributo privado llamado "hamburguesa" de tipo "Hamburguesa".
    private Burger burger;

    // Declaración del constructor de la clase "Tomate" que toma una instancia de "Hamburguesa".
    public Tomato(Burger burger) {
    	// Asigna la instancia de hamburguesa pasada como parámetro al atributo "hamburguesa".
        this.burger = burger;
    }

    @Override
    // Sobrescribe el método "getDescription" de la clase base "Hamburguesa".
    public String getDescription() {
    	// Retorna la descripción de la hamburguesa base concatenada con " + tomate".
        return burger.getDescription() + " + Tomate";
    }
}


