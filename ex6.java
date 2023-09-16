public class ex6 {
    public static void main(String[] args) {
        String[] names = new String[10];
        int[] rollNumbers = new int[10];

        // Initialize data for 10 students
        initializeData(names, rollNumbers);

        // Display the names and roll numbers
        displayStudentInfo(names, rollNumbers);
    }

    public static void initializeData(String[] names, int[] rollNumbers) {
        // Initialize data for 10 students
        for (int i = 0; i < 10; i++) {
            names[i] = "Student " + (i + 1);
            rollNumbers[i] = 1000 + i;
        }
    }

    public static void displayStudentInfo(String[] names, int[] rollNumbers) {
        // Display the names and roll numbers of students
        System.out.println("Student Information:");
        for (int i = 0; i < names.length; i++) {
            try {
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception occurred.");
                break; // Exit the loop if an exception occurs
            }
        }
    }
}

