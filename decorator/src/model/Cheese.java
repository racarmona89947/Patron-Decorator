// Esta línea declara el paquete "Decorator" al que pertenece la clase.
package model;
//Declaración de la clase "Queso" que hereda de la clase "DecoradorHamburguesa".
public class Cheese extends BurgerDecorator {
	// Declaración de un atributo privado llamado "hamburguesa" de tipo "Hamburguesa".
    private Burger burger;

    // Declaración del constructor de la clase "Queso" que toma una instancia de "Hamburguesa".
    public Cheese(Burger burger) {
    	// Asigna la instancia de hamburguesa pasada como parámetro al atributo "hamburguesa".
        this.burger = burger;
    }

    @Override
    // Sobrescribe el método "getDescription" de la clase base "Hamburguesa".
    public String getDescription() {
    	// Retorna la descripción de la hamburguesa base concatenada con " + queso".
        return burger.getDescription() + " + Queso";
    }
}


