package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Reservation reservation1 = new Reservation("king", 3, true);
        double total = reservation1.getReservationTotal();
        System.out.println("Total: " + total);

        Room room1 = new Room(3,124.00, true, true);
        boolean availability = room1.isAvailable();
        System.out.println("Your room is available " + availability);

        Employee employee1 = new Employee(87.00, "0923", "Prince", "Software Dev", 52);
        double pay = employee1.getTotalPay();
        double hours = employee1.getRegularHours();
        double overtime = employee1.getOvertimeHours();
        System.out.println("Your employee wage & hours: $" + pay + " " + hours + " " + overtime);

        Employee employee2 = new Employee(99.00, "0923", "Saint", "Software Dev", 48);
        System.out.println("Updated hours: " + (employee2.punchTimeCard(10) + employee2.punchTimeCard(14)));

    }
}
