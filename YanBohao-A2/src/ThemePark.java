import java.util.ArrayList;
import java.util.List;

public class ThemePark {
    private String name;
    private List<Ride> rides;
    private List<Employee> employees;
    private List<Visitor> visitors;

    public ThemePark(String name) {
        this.name = name;
        this.rides = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void admitVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void operateRides() {
        for (Ride ride : rides) {
            if (ride.isOperational()) {
                for (Visitor visitor : visitors) {
                    if (visitor.canRideAttraction(ride)) {
                        visitor.enjoyRide();
                        System.out.println(visitor.getName() + " enjoyed " + ride.getName());
                    }
                }
            } else {
                System.out.println(ride.getName() + " is not operational.");
            }
        }
    }

    public void endDay() {
        for (Ride ride : rides) {
            ride.removeOperator();
        }
        visitors.clear();
    }

    // Getters
    public String getName() { return name; }
    public List<Ride> getRides() { return rides; }
    public List<Employee> getEmployees() { return employees; }
    public List<Visitor> getVisitors() { return visitors; }
}