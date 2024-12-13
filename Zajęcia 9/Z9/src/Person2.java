public record Person2(String name, int age) {
    public Person2(String name, int age) {
        this.name = name;
        this.age = (age < 0) ? 0 : age;
    }
}
