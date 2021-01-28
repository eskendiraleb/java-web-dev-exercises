package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;



    public Student(String name,int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }

    public Student(String name, int studentId) {
        this(name, studentId,0,0);
    }


    public Student(String name,String gradeLevel) {
        this(name,nextStudentId);
        nextStudentId++;
    }

   // public Student(String name, int nextStudentId) {
  //  }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int numberOfCredits) {
        if (numberOfCredits >= 0 && numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits >= 60 && numberOfCredits <= 89) {
            return "Junior";
        } else  {
            return "Senior";
        }

    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        Double currentTQS = (gpa * numberOfCredits);
        Double totalQualityScore = grade * courseCredits;
        gpa = totalQualityScore/numberOfCredits;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

   // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
   public boolean equals(Object toBeCompared) {
       Student theStudent = (Student) toBeCompared;
       return theStudent.getName() == getName();
   }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {

        Student sally = new Student("Sally",1,10,4.0);
       // String studentsLevel = Student.getGradeLevel(sally);
        System.out.println(nextStudentId + "The Student class works! " + sally.getName() + " is a student!");
        System.out.println(nextStudentId + ". "+ sally.getName() + " is " + sally.getGradeLevel(sally.numberOfCredits) + " student!");
        sally.addGrade(12, 3.5);
        System.out.println(nextStudentId + ". "+sally.studentInfo());
        sally.addGrade(98, 3.8);
        System.out.println(nextStudentId + ". "+sally.studentInfo());
        System.out.println(nextStudentId + ". "+sally.toString());

        System.out.println("******* Student comparison by their properties *******");
        Student bono1 = new Student("Bono", 3);
        Student bono2 = new Student("Bono", 4);
        System.out.println(bono1.equals(bono2));
    }
}
