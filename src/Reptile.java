class Reptile extends Animal {
    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

    @Override
    public String move() {
        return "Crawl";
    }

    @Override
    public String naturalHabitat() {
        return "Swamp";
    }

    public void uniqueReptileMethod() {
        System.out.println("Reptiles are cold-blooded.");
    }
}