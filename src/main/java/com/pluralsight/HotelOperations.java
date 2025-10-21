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
        employee2.punchIn(10);
        employee2.punchOut(14);
        System.out.println("Updated pay: " + employee2.getTotalPay());

        Employee employee3 = new Employee(99.00, "0923", "Saint", "Software Dev", 36);
        employee3.punchIn(9.0);
        employee3.punchOut(17.0);
        System.out.println("Updated pay: " + employee3.getTotalPay());

        Employee employee4 = new Employee(99.00, "0923", "Saint", "Software Dev", 67);
        employee4.punchIn();
        employee4.punchOut();
        System.out.println("Updated pay: " + employee4.getTotalPay());


    }
}
