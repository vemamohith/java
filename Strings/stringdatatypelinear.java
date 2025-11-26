<<<<<<< HEAD
package Strings;

import java.util.Scanner;

public class stringdatatypelinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n1: Searching the int type ");
            System.out.println("2: Searching the double type ");
            System.out.println("3: Searching the char type ");
            System.out.println("4: Searching the String type ");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the number of elements:");
                    int[] arr = new int[sc.nextInt()];
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the key to search:");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 2: {
                    System.out.println("Enter the number of elements:");
                    double[] arr = new double[sc.nextInt()];
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextDouble();
                    }
                    System.out.println("Enter the key to search:");
                    double key = sc.nextDouble();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 3: {
                    System.out.println("Enter the number of characters:");
                    char[] arr = new char[sc.nextInt()];
                    System.out.println("Enter the characters:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.next().charAt(0);
                    }
                    System.out.println("Enter the key to search:");
                    char key = sc.next().charAt(0);
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 4: {
                    System.out.println("Enter the number of strings:");
                    String[] arr = new String[sc.nextInt()];
                    System.out.println("Enter the strings:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.next();
                    }
                    System.out.println("Enter the key to search:");
                    String key = sc.next();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key.equals(arr[i])) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
=======
package Strings;

import java.util.Scanner;

public class stringdatatypelinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n1: Searching the int type ");
            System.out.println("2: Searching the double type ");
            System.out.println("3: Searching the char type ");
            System.out.println("4: Searching the String type ");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the number of elements:");
                    int[] arr = new int[sc.nextInt()];
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter the key to search:");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 2: {
                    System.out.println("Enter the number of elements:");
                    double[] arr = new double[sc.nextInt()];
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextDouble();
                    }
                    System.out.println("Enter the key to search:");
                    double key = sc.nextDouble();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 3: {
                    System.out.println("Enter the number of characters:");
                    char[] arr = new char[sc.nextInt()];
                    System.out.println("Enter the characters:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.next().charAt(0);
                    }
                    System.out.println("Enter the key to search:");
                    char key = sc.next().charAt(0);
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key == arr[i]) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 4: {
                    System.out.println("Enter the number of strings:");
                    String[] arr = new String[sc.nextInt()];
                    System.out.println("Enter the strings:");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.next();
                    }
                    System.out.println("Enter the key to search:");
                    String key = sc.next();
                    boolean found = false;
                    for (int i = 0; i < arr.length; i++) {
                        if (key.equals(arr[i])) {
                            System.out.println("Found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Not found");
                    break;
                }

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
>>>>>>> 4ecfcb4dd95708059f7b96dba0304ec457a84060
