import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hello extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//window title in top bar
		primaryStage.setTitle("Hello World");
		
		//text generation
		final Text text=new Text(); //need final to say will have text and not be null
		text.setText("No-one has been greated");
		
		//button generation
		Button btn=new Button();
		btn.setText("Greet you");
		//actions for the button
		btn.setOnAction(new EventHandler<ActionEvent>() {
			int n=0;
			@Override
			public void handle(ActionEvent arg0) { //what we want to happen when button pressed
				n++;
				text.setText("Hello there! "+"Said "+n+" time(s)");
				
			}
			
		});
		
		//setting internal window layout
		HBox pane=new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(25,25,25,25));
		pane.setSpacing(10);
		//adding text and button to layout
		pane.getChildren().add(text);
		pane.getChildren().add(btn);
		
		//adding pane (layout) to scene
		primaryStage.setScene(new Scene(pane,300, 250));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		//the bit that makes it work
		launch(args);
	}

}
