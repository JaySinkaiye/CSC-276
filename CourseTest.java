import javax.swing.*;
public class CourseTest {
    
    public static void main(String[] args) {
        Course course1 = new Course();

        String prefix2 = JOptionPane.showInputDialog("First course prefix: ");
        int code2 = Integer.parseInt(JOptionPane.showInputDialog("First course Code: "));
        Course course2 = new Course(prefix2, code2);

        String prefix3 = JOptionPane.showInputDialog("Second course prefix: ");
        int code3 = Integer.parseInt(JOptionPane.showInputDialog("Second course code: "));
        Course course3 = new Course(prefix3, code3);

        course1.displayCourse();
        course2.displayCourse();
        course3.displayCourse();
    
    }
}
