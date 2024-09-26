import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Enchiladas Verdes", "Chicken enchilladas w/ salsa verde", 12.00, "main course");
        MenuItem item2 = new MenuItem("Torta", "A sandwich with beans, pork, and veggies", 10.00, "main course");
        MenuItem item3 = new MenuItem("Guacamole", "A fresh avocado based dip. Served with chips", 5.00, "appetizer");
        MenuItem item4 = new MenuItem("Elote", "Mexican street corn with cojito cheese", 6.50, "appetizer");
        MenuItem item5 = new MenuItem("Tres Leches Cake", "A moist and fluffy cake", 7.00, "dessert");

        System.out.println(item1);
        
        Menu menu = new Menu();
        
        menu.getItem(item1);
    }

}
