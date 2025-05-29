class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Chirp";
    }

    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String naturalHabitat() {
        return "Air";
    }

    public void uniqueBirdMethod() {
        System.out.println("Birds have feathers.");
    }
}
