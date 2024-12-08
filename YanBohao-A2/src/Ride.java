public class Ride {
    private String name;
    private int minimumAge;
    private int energyRequirement;
    private int minimumExperienceRequired;
    private Employee currentOperator;
    private boolean isOperational;

    public Ride(String name, int minimumAge, int energyRequirement, int minimumExperienceRequired) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.energyRequirement = energyRequirement;
        this.minimumExperienceRequired = minimumExperienceRequired;
        this.isOperational = false;
    }

    public void assignOperator(Employee employee) {
        if (employee.canOperateRide(this)) {
            this.currentOperator = employee;
            this.isOperational = true;
        } else {
            System.out.println(employee.getName() + " is not qualified to operate " + this.name);
        }
    }

    public void removeOperator() {
        this.currentOperator = null;
        this.isOperational = false;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getMinimumAge() { return minimumAge; }
    public int getEnergyRequirement() { return energyRequirement; }
    public int getMinimumExperienceRequired() { return minimumExperienceRequired; }
    public Employee getCurrentOperator() { return currentOperator; }
    public boolean isOperational() { return isOperational; }
}