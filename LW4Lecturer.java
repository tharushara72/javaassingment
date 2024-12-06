import java.util.ArrayList;

class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        }
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }
}

