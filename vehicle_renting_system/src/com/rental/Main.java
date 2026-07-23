package com.rental;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Create the rental manager
        RentalManager manager = new RentalManager();
        
        // Load data
        manager.addVehicle(new Car("C001", "Toyota", "Camry", 50.0));
        manager.addVehicle(new Motorcycle("M001", "Honda", "CBR", 30.0));
        manager.addVehicle(new Truck("T001", "Ford", "F-150", 80.0, 2000));
        
        // Pass the manager to the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RentalGUI().setVisible(true);
            }
        });
    }
}