public abstract class Person {
    private String name;
    private int age;
    private String uniqueId;
    private int energyLevel;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.uniqueId = generateUniqueId();
        this.energyLevel = 100;
    }

    private String generateUniqueId() {
        return name.substring(0, 2).toUpperCase() + String.format("%04d", (int)(Math.random() * 10000));
    }

    public void rest() {
        energyLevel = Math.min(100, energyLevel + 10);
    }

    public void exert() {
        energyLevel = Math.max(0, energyLevel - 10);
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getUniqueId() { return uniqueId; }
    public int getEnergyLevel() { return energyLevel; }
}