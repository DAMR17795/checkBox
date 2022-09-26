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

public class ejemploCine extends Application {

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

        Scene scene = new Scene(grid, 450, 350);
        stage.setScene(scene);
        stage.setTitle("CheckBox Wiki");
        stage.show();

        //Titulo EjemploCheckBox
        Text scenetitle = new Text("Ejemplo de CheckBox Géneros Cinemáticos");
        Label sentence = new Label("Seleccione sus géneros cinematográficos favoritos\n(indeterminado si los desconoce");
        grid.add(sentence, 0, 1);
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Generos

        //Drama
        CheckBox drama = new CheckBox();
        grid.add(drama, 0, 3);
        drama.setText("Drama");
        drama.setSelected(true);
        drama.setAllowIndeterminate(true);

        //Accion
        CheckBox accion = new CheckBox("Acción");
        accion.setSelected(false);
        grid.add(accion, 0, 4);
        accion.setAllowIndeterminate(true);

        //Epico
        CheckBox epico = new CheckBox("Épico");
        epico.setSelected(false);
        grid.add(epico, 0, 5);
        epico.setAllowIndeterminate(true);

        //Amor
        CheckBox amor = new CheckBox("Amor");
        amor.setSelected(false);
        grid.add(amor, 0, 6);
        amor.setAllowIndeterminate(true);

        //Fantasia
        CheckBox fantasia = new CheckBox("Fantasia");
        fantasia.setSelected(false);
        grid.add(fantasia, 0, 7);
        fantasia.setAllowIndeterminate(true);

        //Biografico
        CheckBox biografico  = new CheckBox("Biografico ");
        biografico .setSelected(false);
        grid.add(biografico , 0, 8);
        biografico.setAllowIndeterminate(true);
    }
}
