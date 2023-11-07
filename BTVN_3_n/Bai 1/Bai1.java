package bai1;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<vegatable> list = new ArrayList<>();
        int n = 0;
        Integer choice;
        do {
            
            System.out.print("\n-------------------------------------\n");
            System.out.println(" (1) Input 1 new vegetable");
            System.out.println(" (2) Show all list vegetable");
            System.out.println(" (3) Sort vegetable by revenue");
            System.out.println(" (4) Group vegetable by unit");
            System.out.println(" (5) Search a vegetable by name");
            System.out.println(" (6) EXIT");
            System.out.print("\n-------------------------------------\n");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            System.out.println();

        switch (choice) {
            case 1: {
                sc.nextLine();
                System.out.print("Input ID: ");
                String id = sc.nextLine();
                System.out.print("Input name: ");
                String name = sc.nextLine();
                System.out.print("Input unit: ");
                String unit = sc.nextLine();
                System.out.print("Input quantity sold: ");
                int quantitySold = sc.nextInt();
                System.out.print("Input sale: ");
                int sale = sc.nextInt();
                System.out.print("Input price: ");
                double price = sc.nextDouble();

                vegatable v = new vegatable(id, name, unit, quantitySold, sale, price);
                list.add(v);
                break;
            }
            case 2: {
                System.out.printf("%-4s %-15s %-7s %-15s %-7s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity sold", "Sale", "Price", "Revenue");
                for (vegatable vegetable : list) {
                    vegetable.display();
                }
                break;
            }
            case 3: {
                Collections.sort(list, new sortRevenue());
                System.out.println("Sort completed");
                for (vegatable vegetable : list) {
                    vegetable.display();
                }
                break;
            }
            case 4: {
                Collections.sort(list, new sortByUnit());
                System.out.println("Sort completed");
                for (vegatable vegetable : list) {
                    vegetable.display();
                }
                break;
            }
            case 5: {
                sc.nextLine();
                System.out.print("Input name: ");
                String word = sc.nextLine();
                for (vegatable vegetable : list) {
                    if (vegetable.getName().contains(word)) {
                        vegetable.display();
                    }
                }
                break;
            }
            case 6: {
                System.out.println("Exit....");
                return;
            }
        }
        } while (choice >=0 || choice <6);
    }
}
