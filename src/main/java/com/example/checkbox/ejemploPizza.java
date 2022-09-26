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

public class ejemploPizza extends Application {

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
        Text scenetitle = new Text("Ejemplo de CheckBox pedido Pizza");
        Label sentence = new Label("Seleccione los ingredientes de su pizza");
        grid.add(sentence, 0, 1);
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Ingredientes

        //Peperoni
        CheckBox peperoni = new CheckBox();
        grid.add(peperoni, 0, 2);
        peperoni.setText("Peperoni");
        peperoni.setSelected(true);

        //Jamon
        CheckBox jamon = new CheckBox("Jamón");
        jamon.setSelected(false);
        grid.add(jamon, 0, 3);

        //Queso
        CheckBox queso = new CheckBox("Queso");
        queso.setSelected(false);
        grid.add(queso, 0, 4);

        //Chorizo
        CheckBox chorizo = new CheckBox("Chorizo");
        chorizo.setSelected(false);
        grid.add(chorizo, 0, 5);

        //Cebolla
        CheckBox cebolla = new CheckBox("Cebolla");
        cebolla.setSelected(false);
        grid.add(cebolla, 0, 6);

        //Maiz
        CheckBox maiz = new CheckBox("Maiz");
        maiz.setSelected(false);
        grid.add(maiz, 0, 7);

    }
}
