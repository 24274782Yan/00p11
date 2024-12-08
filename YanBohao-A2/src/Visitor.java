public class Visitor extends Person {
    private boolean hasPass;
    private int happinessLevel;

    public Visitor(String name, int age, boolean hasPass) {
        super(name, age);
        this.hasPass = hasPass;
        this.happinessLevel = 50;
    }

    public void enjoyRide() {
        happinessLevel = Math.min(100, happinessLevel + 5);
        exert();
    }

    public boolean canRideAttraction(Ride ride) {
        return getAge() >= ride.getMinimumAge() && getEnergyLevel() >= ride.getEnergyRequirement();
    }

    // Getters and setters
    public boolean isHasPass() { return hasPass; }
    public void setHasPass(boolean hasPass) { this.hasPass = hasPass; }
    public int getHappinessLevel() { return happinessLevel; }
}