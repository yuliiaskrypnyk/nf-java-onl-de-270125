package org.example.Map.Pharmacy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Medication> medicationMap = new HashMap<>();

        Medication med1 = new Medication("Ibuprofen", 1.99, true);
        Medication med2 = new Medication("Vitamin C", 5.99, true);
        Medication med3 = new Medication("Vitamin D", 15.99, true);

        medicationMap.put(med1.getName(), med1);
        medicationMap.put(med2.getName(), med2);
        medicationMap.put(med3.getName(), med3);

        Pharmacy pharmacy = new Pharmacy(medicationMap);

        pharmacy.printAllMedications();
        System.out.println("Total medications in pharmacy: " + pharmacy.getCount());

        Medication med4 = new Medication("Aspirin", 2.99, true);
        pharmacy.save(med4);

        Medication foundMed = pharmacy.find("Aspirin");
        if (foundMed != null) {
            System.out.println("Found medication: " + foundMed);
        } else {
            System.out.println("Medication not found");
        }

        pharmacy.delete("Vitamin C");

        pharmacy.printAllMedications();
    }
}
