package org.example.Static;

public class Count {
    static int totalCount = 0;
    int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Total count: " + totalCount + ", Instance count: " + instanceCount;
    }
}
