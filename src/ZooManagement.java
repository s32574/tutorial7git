public class ZooManagement {
    public static void main(String[] args) {

        Animal lion = new Mammal("Lion", 5);

        Animal eagle = new Bird("Eagle", 3);

        Animal snake = new Reptile("Snake", 2);


        lion.displayInformation();
        ((Mammal) lion).uniqueMammalMethod();
        System.out.println();

        eagle.displayInformation();
        ((Bird) eagle).uniqueBirdMethod();
        System.out.println();

        snake.displayInformation();
        ((Reptile) snake).uniqueReptileMethod();
        System.out.println();
    }
}