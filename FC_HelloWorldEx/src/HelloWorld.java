
//package com.karlund.javafx;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class HelloWorld extends Application{
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create a scene for the window with the text inside it
        //Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!"))); 
        Group group=new Group();
        Scene scene=new Scene(group);
        
        Text text1=new Text(25, 25, "Hello World!");
        group.getChildren().add(text1);
        Text text2=new Text(50, 50, "More indent");
        group.getChildren().add(text2);
        Text text3=new Text(10, 100, "Less indent");
        group.getChildren().add(text3);
        
         
        //Set title of the window
        primaryStage.setTitle("Hello World Example");
         
        //Add scene to the window (underneath the window bar)
        primaryStage.setScene(scene);
         
        //Change size of window to fit text
        //primaryStage.sizeToScene();
        primaryStage.setWidth(400);
        primaryStage.setHeight(150);
         
        //Show the window
        primaryStage.show();
    }
 
 
    public static void main(String[] args) {
        Application.launch(args);
    }
}

