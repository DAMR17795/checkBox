package com.example.checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ejemploDeportes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 400, 275);
        stage.setScene(scene);
        stage.setTitle("CheckBox Wiki");
        stage.show();

        //Titulo EjemploCheckBox
        Text scenetitle = new Text("Ejemplo de CheckBox Deportes");
        Label sentence = new Label("Seleccione los deportes que suele practicar");
        grid.add(sentence, 0, 1);
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Deportes

        //Baloncesto
        CheckBox baloncesto = new CheckBox();
        grid.add(baloncesto, 0, 2);
        baloncesto.setText("Baloncesto");
        baloncesto.setSelected(true);

        //Futbol
        CheckBox futbol = new CheckBox("Fútbol");
        futbol.setSelected(false);
        grid.add(futbol, 0, 3);

        //Golf
        CheckBox golf = new CheckBox("Golf");
        golf.setSelected(false);
        grid.add(golf, 0, 4);

        //Badminton
        CheckBox badminton = new CheckBox("Badminton");
        badminton.setSelected(false);
        grid.add(badminton, 0, 5);

        //Voleibol
        CheckBox voleibol = new CheckBox("Voleibol");
        voleibol.setSelected(false);
        grid.add(voleibol, 0, 6);

        //Patinaje
        CheckBox patinaje  = new CheckBox("Patinaje ");
        patinaje .setSelected(false);
        grid.add(patinaje , 0, 7);
    }
}
