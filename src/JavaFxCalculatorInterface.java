import javafx.application.Application;		//Application is the main class needed for javafx programs to make apps.																								
import javafx.stage.Stage;					// Remember theater analogy, The theater has the overall stage which equals the window.												
import javafx.scene.Scene;					// What's inside the window or stage is the scene, and what's in the scene are panes, and what's in
import javafx.scene.layout.BorderPane;		// the panes are buttons. For example, the equals sign is a button, that goes into a pane, for this 
import javafx.scene.layout.GridPane;		// program I used the border pane. That pane goes into the scene and the scene is inside the 
import javafx.scene.text.Font;				// stage. When the stage is shown or window, what is seen is a button inside of a pane inside of a 
import javafx.scene.text.FontPosture;		// scene
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;			
import javafx.scene.control.TextArea;	
														
public class JavaFxCalculatorInterface extends Application
{
	public static void main(String[] args)	// I need this so I can simply launch the application.
	{
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) 
	{	
		BorderPane borderPane = new BorderPane();	// I create a pane object from the BorderPane class. I use this class so I can have the top and bottom of the calculator have the border pane format.
		GridPane gridPane = new GridPane();			// I create a pane object from the GridPane class.	I use this class so I can have the middle be setup as a grid pane.
		TextArea area = new TextArea("0.0");		// I create an area object from the TextArea class. I use this class so I can have a text	
													// field for the current value which is 0.0.
		area.setEditable(false);					// setEditable(false) makes it so no one can tamper with the text box for the current value.
		area.setMaxSize(260, 0);
		area.setFont(Font.font("monospaced",FontWeight.BOLD, FontPosture.REGULAR,20));	// This changes how the current value looks.
		
		Button equalsButton = new Button("=");							// I'm creating a button here which is the "=" button,
		equalsButton.setPrefSize(260, 62);								// I set the width of the button to 260 units, and the height
		borderPane.setTop(area);										// to 62 units.
		borderPane.setCenter(gridPane);									// This is a pane inside a pane essentially, the gridPane is put inside	the middle of the borderPane.											
		borderPane.setBottom(equalsButton);								// Here I am putting the equals button inside the bottom pane.
		
		Button button7 = new Button("7");								// I'm creating button 7 from the Button class which has the arg ("7").
		button7.setPrefSize(65, 50);									// I set the size to (Width,height).
		gridPane.add(button7, 0, 0);									// I then add the button 7 to the gridPane and it's at column 0, row
																		// 0.
		Button button8 = new Button("8");								// I'm following the same pattern from button 7.
		button8.setPrefSize(65, 50);									// The main difference is that the column is now 5, the row is the same.
		gridPane.add(button8, 5, 0);
		
		Button button9 = new Button("9");								// For the continuation of the buttons the column changes by 5 units.
		button9.setPrefSize(65, 50);									// I follow the previous pattern for the button creations though.
		gridPane.add(button9, 10, 0);
		
		Button buttonDivide = new Button("/");
		buttonDivide.setPrefSize(65, 50);
		gridPane.add(buttonDivide, 15,0 );								
		
		Button button4 = new Button("4");								//4 through * has column 0,5,10,15 and row 1.
		button4.setPrefSize(65, 50);
		gridPane.add(button4, 0, 1);
		
		Button button5 = new Button("5");
		button5.setPrefSize(65, 50);
		gridPane.add(button5, 5, 1);
		
		Button button6 = new Button("6");
		button6.setPrefSize(65, 50);
		gridPane.add(button6, 10, 1);
		
		Button buttonMultiply = new Button("*");
		buttonMultiply.setPrefSize(65, 50);
		gridPane.add(buttonMultiply, 15, 1);
		
		Button button1 = new Button("1");							// 1 through - has column 0,5,10,15 row 2.
		button1.setPrefSize(65, 50);
		gridPane.add(button1, 0, 2);
		
		Button button2 = new Button("2");
		button2.setPrefSize(65, 50);
		gridPane.add(button2, 5, 2);
		
		Button button3 = new Button("3");
		button3.setPrefSize(65, 50);
		gridPane.add(button3, 10, 2);
		
		Button buttonMinus = new Button("-");
		buttonMinus.setPrefSize(65, 50);
		gridPane.add(buttonMinus, 15, 2);
		
		Button buttonClear = new Button("C");						// C through + has column 0,5,10,15 row 3.
		buttonClear.setPrefSize(65, 50);
		gridPane.add(buttonClear, 0, 3);
		
		Button button0 = new Button("0");
		button0.setPrefSize(65, 50);
		gridPane.add(button0, 5, 3);
		
		Button buttonPeriod = new Button(".");
		buttonPeriod.setPrefSize(65, 50);
		gridPane.add(buttonPeriod, 10, 3);
		
		Button buttonAdd = new Button("+");
		buttonAdd.setPrefSize(65, 50);
		gridPane.add(buttonAdd, 15, 3);
			
		
		Scene scene = new Scene(borderPane,250,300);
		primaryStage.setResizable(false);							// setResizable makes it so no one can tamper with the size of the calculator.
		primaryStage.setTitle("Calculator");						// I set the title for the stage.
		primaryStage.setScene(scene);								// I set the scene just like I'm setting up a scene for a play.
		primaryStage.show();										// Show the play or App!
			
	}
}


