public class Main {
    public static void main(String[] args) {
        // Create Department
        Department softwareEngineering = new Department("Software Engineering");

        // Create Degree
        Degree computerScience = new Degree("Computer Science", 100);

        // Create Course
        Course oopCourse = new Course("Object-Oriented Programming", "Compulsory", 60);

        // Create Lecturer
        Lecturer drSmith = new Lecturer("Dr. Smith", "Professor", softwareEngineering);

        // Assign Lecturer to Department and Course
        softwareEngineering.appointDepartmentHead(drSmith);
        drSmith.addCourse(oopCourse);

        // Create Student
        Student johnDoe = new Student("John Doe", "S12345", "Year 2", computerScience);

        // Assign Course to Student
        johnDoe.enrollCourse(oopCourse);


        drSmith.displayInfo();
        softwareEngineering.displayInfo();
        computerScience.displayInfo();
        johnDoe.displayInfo();
    }
}



