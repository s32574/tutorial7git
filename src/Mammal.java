class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public String move() {
        return "Walk";
    }

    @Override
    public String naturalHabitat() {
        return "Land";
    }

    public void uniqueMammalMethod() {
        System.out.println("Mammals give birth to live young.");
    }
}
