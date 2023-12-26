import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FitnessTrackerGUI extends Application {

    private int totalSteps
    private int totalMinutesActive;z

    private Label stepsLabel;
    private Label minutesActiveLabel;

    public FitnessTrackerGUI() {
        totalSteps = 0;
        totalMinutesActive = 0;
    }

    public void logActivity(int steps, int minutesActive) {
        totalSteps += steps;
        totalMinutesActive += minutesActive;
        updateLabels();
    }

    private void updateLabels() {
        stepsLabel.setText("Total Steps: " + totalSteps);
        minutesActiveLabel.setText("Total Minutes Active: " + totalMinutesActive);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Fitness Tracker");

        // UI components
        Button logActivityButton = new Button("Log Activity");
        Button displaySummaryButton = new Button("Display Summary");

        stepsLabel = new Label("Total Steps: 0");
        minutesActiveLabel = new Label("Total Minutes Active: 0");

        // Event handlers
        logActivityButton.setOnAction(e -> logActivityDialog());
        displaySummaryButton.setOnAction(e -> displaySummary());

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(logActivityButton, displaySummaryButton, stepsLabel, minutesActiveLabel);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void logActivityDialog() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Log Activity");
        dialog.setHeaderText("Enter activity details:");

        ButtonType logButtonType = new ButtonType("Log", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(logButtonType, ButtonType.CANCEL);

        TextField stepsField = new TextField();
        TextField minutesActiveField = new TextField();

        dialog.getDialogPane().setContent(new VBox(10, new Label("Steps:"), stepsField, new Label("Minutes Active:"), minutesActiveField));

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == logButtonType) {
                return new Pair<>(stepsField.getText(), minutesActiveField.getText());
            }
            return null;
        });

        dialog.showAndWait().ifPresent(result -> {
            try {
                int steps = Integer.parseInt(result.getKey());
                int minutesActive = Integer.parseInt(result.getValue());
                logActivity(steps, minutesActive);
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid input. Please enter valid numbers.");
                alert.showAndWait();
            }
        });
    }

    private void displaySummary() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fitness Tracker Summary");
        alert.setHeaderText(null);
        alert.setContentText("Total Steps: " + totalSteps + "\nTotal Minutes Active: " + totalMinutesActive);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
