package org.example.Static;

public class Main {
    public static void main(String[] args) {
       Count count1 = new Count();
       Count count2 = new Count();

       Count.incrementTotalCount();

        count1.incrementInstanceCount();
        count2.incrementInstanceCount();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println("Total count from class: " + Count.totalCount);
    }
}
