package com.example.checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckBoxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        stage.setTitle("CheckBox Wiki");
        stage.show();

        //Titulo EjemploCheckBox
        Text scenetitle = new Text("Ejemplo de CheckBox");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //CheckBox sin titulo
        CheckBox cb1 = new CheckBox();
        grid.add(cb1, 0, 1);

        //Asignacion de titulo a CheckBox 1
        cb1.setText("Marcado");

        //Marcar por defecto CheckBox 1
        cb1.setSelected(true);

        //CheckBox 2 con titulo
        CheckBox cb2 = new CheckBox("Desmarcado");
        grid.add(cb2, 0, 2);

        //CheckBox 3 con título
        CheckBox cb3 = new CheckBox("Indefinido");
        cb3.setIndeterminate(true);
        grid.add(cb3, 0, 3);
        cb3.setAllowIndeterminate(true);
    }

    public static void main(String[] args) {
        launch();
    }
}