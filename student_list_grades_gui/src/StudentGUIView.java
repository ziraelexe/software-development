import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentGUIView {
    private JFrame frame;
    private JButton buttonGrade1;
    private JButton buttonGrade2;
    private JButton buttonGrade3;
    private JButton buttonGrade4;
    private JButton buttonGrade5;
    private JTextArea textArea;

    public StudentGUIView() {
        // Create the main frame
        frame = new JFrame("Student Grades");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create buttons
        buttonGrade1 = new JButton("Grade 1");
        buttonGrade2 = new JButton("Grade 2");
        buttonGrade3 = new JButton("Grade 3");
        buttonGrade4 = new JButton("Grade 4");
        buttonGrade5 = new JButton("Grade 5");

        // Create text area
        textArea = new JTextArea(10, 30);

        // Add buttons and text area to the frame
        frame.getContentPane().add(buttonGrade1);
        frame.getContentPane().add(buttonGrade2);
        frame.getContentPane().add(buttonGrade3);
        frame.getContentPane().add(buttonGrade4);
        frame.getContentPane().add(buttonGrade5);
        frame.getContentPane().add(textArea);

        // Set action listeners for the buttons
        buttonGrade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController.filterStudentsByGrade(1);
            }
        });

        buttonGrade2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController.filterStudentsByGrade(2);
            }
        });

        buttonGrade3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController.filterStudentsByGrade(3);
            }
        });

        buttonGrade4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController.filterStudentsByGrade(4);
            }
        });

        buttonGrade5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController.filterStudentsByGrade(5);
            }
        });
    }

    public void display() {
        frame.setVisible(true);
    }

    public void updateTextArea(List<String> filteredStudents) {
        textArea.setText("");
        for (String studentName : filteredStudents) {
            textArea.append(studentName + "\n");
        }
    }
}

