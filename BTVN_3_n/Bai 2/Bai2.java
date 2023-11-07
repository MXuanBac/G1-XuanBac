package bai2;

import java.util.*;
public class Bai2 {

    public static void main(String[] args) {
        ArrayList<Subject> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------------------------------------");
            System.out.println(" (1) Input 1 lesson");
            System.out.println(" (2) Show list lesson");
            System.out.println(" (3) Sort lesson by finish time");
            System.out.println(" (4) Choice Lesson");
            System.out.println(" (5) EXIT");
            System.out.println("----------------------------------------");
            System.out.print("Input your choice: ");
            int choice = scan.nextInt();
            System.out.println();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Input ID: ");
                    String ID = scan.nextLine();
                    System.out.print("Input subject name: ");
                    String subjectName = scan.nextLine();
                    System.out.print("Input student count: ");
                    int sutdentCount = scan.nextInt();
                    System.out.print("Input time to start: ");
                    scan.nextLine();
                    String timeStart = scan.nextLine();
                    System.out.print("Input time to finish: ");
                    String timeEnd = scan.nextLine();
                    Subject subject = new Subject(ID, subjectName, sutdentCount, timeStart, timeEnd);
                    list.add(subject);
                    break;
                }
                case 2: {
                    System.out.printf("%-5s %-35s %-25s %-25s \n", "Id", "Subject name", "Student count", "Time start - end");
                    for (Subject subject : list) {
                        subject.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new sortByMinutes());
                    break;
                }
                case 4: {
                    ArrayList<Subject> tempList = new ArrayList<>();
                    for (Subject subject : list) {
                        tempList.add(subject);
                    }

                    Collections.sort(tempList, new sortByMinutes());
                    System.out.print("Input start time: ");
                    String start = scan.nextLine();
                    int startTime = Integer.parseInt(start.substring(0, 2)) * 60
                            + Integer.parseInt(start.substring(3, 5));

                    System.out.print("Input end time: ");
                    String end = scan.nextLine();
                    int temp = startTime;
                    int count = 0;
                    int endTime = Integer.parseInt(end.substring(0, 2)) * 60
                            + Integer.parseInt(end.substring(3, 5));

                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            count++;
                        }
                    }
                    if (count > 1)
                        System.out.println("You can study only " + count + "lesson");
                    else
                        System.out.println("You can study " + count + " lessons");

                    temp = startTime;
                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            subject.display();
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Exit...");
                    return;
                }

                default:
                    break;
            }
        }
    }
    
}
