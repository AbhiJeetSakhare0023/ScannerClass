import java.util.Scanner; // import indicates that we
// are using Scanner class code in our StudentDetails class

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// predefined class
        // System.in indicates reading i/p from system
        System.out.println("Enter Name:");
        String nameWithSpace=sc.nextLine(); // with space
        String name=sc.next(); // without space it does not take space between two words
        System.out.println("Enter Age:");
        int age =sc.nextInt();
        System.out.println("Enter CGPA:");
        float CGPA=sc.nextFloat();
        System.out.println("Enter Result Status:");
        boolean result=sc.nextBoolean();
        System.out.println("Enter phone:");
        long phone =sc.nextLong();
        System.out.println("Enter Gender:");
        char gender=sc.next().charAt(0);

        System.out.println("------Student Details Provided By User-----");
        System.out.println();
        System.out.println("Student Name with Space: "+nameWithSpace); // it shows with space
        System.out.println("Student Name without Space: "+name); // it does not shows with space
        System.out.println("Student Age: "+age);
        System.out.println("Student CGPA: "+CGPA);
        System.out.println("Student Result: "+result);
        System.out.println("Student Contact: "+phone);
        System.out.println("Student Gender: "+gender);

    }
}
