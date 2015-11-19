package Assignment_5_Pack;

import java.util.Collections;

import javax.swing.JOptionPane;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScoreGui extends Application
{
	public static void main(String[] args)
	{
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Student Grades");
		Label name = new Label("Name: ");
		Label weight = new Label("Weights");
		Label assignment1 = new Label("Assignment 1 Score: ");
		Label assignment2 = new Label("Assignment 2 Score: ");
		Label assignment3 = new Label("Assignment 3 Score: ");
		Label assignment4 = new Label("Assignment 4 Score: ");
		Label weight1 = new Label("20%");
		Label weight2 = new Label("40%");
		Label weight3 = new Label("15%");
		Label weight4 = new Label("25%");
		TextField nametextfield = new TextField();
		TextField grade1textfield = new TextField();
		TextField grade2textfield = new TextField();
		TextField grade3textfield = new TextField();
		TextField grade4textfield = new TextField();
		
		Button submit = new Button("Get Weighted Average");
		submit.setOnAction(new EventHandler<ActionEvent>()
		{
			String inputname = "";
			String inputgrade1 = "";
			String inputgrade2 = "";
			String inputgrade3 = "";
			String inputgrade4 = "";
			double grade1parse;
			double grade2parse;
			double grade3parse;
			double grade4parse;		
			double[] weights = {.2, .4, .15, .25};
			
			public void handle(ActionEvent arg0)
			{
				inputname = nametextfield.getText();
				inputgrade1 = grade1textfield.getText();
				grade1parse = Double.parseDouble(inputgrade1);
				inputgrade2 = grade2textfield.getText();
				grade2parse = Double.parseDouble(inputgrade2);
				inputgrade3 = grade3textfield.getText();
				grade3parse = Double.parseDouble(inputgrade3);
				inputgrade4 = grade4textfield.getText();
				grade4parse = Double.parseDouble(inputgrade4);
				double[] grades = {grade1parse, grade2parse, grade3parse, grade4parse};
				
				Student student = new Student(inputname, grades, weights);
				JOptionPane.showMessageDialog(null, student);
			}
		
			
		});
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(name, 0, 0);
		grid.add(weight, 3, 0);
		grid.add(assignment1, 0, 1);
		grid.add(assignment2, 0, 2);
		grid.add(assignment3, 0, 3);
		grid.add(assignment4, 0, 4);
		grid.add(weight1, 3, 1);
		grid.add(weight2, 3, 2);
		grid.add(weight3, 3, 3);
		grid.add(weight4, 3, 4);
		grid.add(nametextfield, 1, 0);
		grid.add(grade1textfield, 1, 1);
		grid.add(grade2textfield, 1, 2);
		grid.add(grade3textfield, 1, 3);
		grid.add(grade4textfield, 1, 4);
		grid.add(submit, 1, 5);
				
		Scene scene = new Scene(grid, 500, 500);
		scene.getStylesheets().add("JavaFx.css");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}