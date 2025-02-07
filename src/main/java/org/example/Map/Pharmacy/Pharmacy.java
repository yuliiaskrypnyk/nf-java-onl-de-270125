package org.example.Map.Pharmacy;

import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;

    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medications.getOrDefault(medicationName, null);
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public void printAllMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }
    }
}
