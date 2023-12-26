import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;


public class FitnessTrackerApp {

    private static final String WORKOUT_FILE = "workouts.txt";
    private List<String> workouts;

    private JFrame frame;
    private DefaultListModel<String> listModel;
    private JList<String> workoutList;
    private JTextField workoutInput;

    public FitnessTrackerApp() {
        workouts = new ArrayList<>();
        loadWorkouts();

        frame = new JFrame("Fitness Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        listModel = new DefaultListModel<>();
        workoutList = new JList<>(listModel);
        workoutList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(workoutList);

        workoutInput = new JTextField();
        JButton addButton = new JButton("Add Workout");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addWorkout(workoutInput.getText());
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(workoutInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);

        updateWorkoutList();

        frame.setVisible(true);
    }

    private void addWorkout(String workoutName) {
        if (!workoutName.isEmpty()) {
            workouts.add(workoutName);
            saveWorkouts();
            updateWorkoutList();
            workoutInput.setText("");
        }
    }

    private void updateWorkoutList() {
        listModel.clear();
        for (String workout : workouts) {
            listModel.addElement(workout);
        }
    }

    private void loadWorkouts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(WORKOUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                workouts.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveWorkouts() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(WORKOUT_FILE))) {
            for (String workout : workouts) {
                writer.write(workout);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FitnessTrackerApp();
            }
        });
    }
}
