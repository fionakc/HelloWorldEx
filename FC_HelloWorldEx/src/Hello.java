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
		primaryStage.setTitle("Hello World");
		
		final Text text=new Text();
		text.setText("No-one has been greated");
		
		Button btn=new Button();
		btn.setText("Greet you");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			int n=0;
			@Override
			public void handle(ActionEvent arg0) {
				n++;
				text.setText("Hello there! "+"Said "+n+" time(s)");
				
			}
			
		});
		
		HBox pane=new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(25,25,25,25));
		pane.setSpacing(10);
		pane.getChildren().add(text);
		pane.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(pane,300, 250));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
