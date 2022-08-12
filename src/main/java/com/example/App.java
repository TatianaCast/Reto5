package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.controller.Reporte1Controller;
import com.example.controller.Reporte2Controller;
import com.example.controller.Reporte3Controller;
import com.example.model.vo.LiderVo;

/**
 * JavaFX App
 */
public class App extends Application {

    Stage window;
    TableView<LiderVo> tableViewLideres;  

    Button btnReporte1;
    Button btnReporte2;
    Button btnReporte3;

    VBox vBox;  

    HBox buttonHBox;
    VBox vbox2;

    Scene scene;
    
//    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Informes");    

        tableViewLideres = Reporte1Controller.getLideresTableView();
        vBox = new VBox();
        vBox.getChildren().addAll(tableViewLideres);         

        btnReporte1 = new Button("Informe 1");
        btnReporte2 = new Button("Informe 2");
        btnReporte3 = new Button("Informe 3");
        
        buttonHBox = new HBox( btnReporte1, btnReporte2, btnReporte3 );
        buttonHBox.setSpacing( 8 );

        vbox2 = new VBox( tableViewLideres, buttonHBox );
        vbox2.setPadding( new Insets(10) );
        vbox2.setSpacing( 10 );

        scene = new Scene(vbox2);

        window.setScene(scene);
        window.show();

        btnReporte1.setOnAction(event -> {
            System.out.println("Informe 1");
            tableViewLideres = Reporte1Controller.getLideresTableView();
            vBox = new VBox();
            vBox.getChildren().addAll(tableViewLideres);      
        });

        btnReporte2.setOnAction(event -> {
            System.out.println("Informe 2");
            tableViewLideres = Reporte2Controller.getCasasCampestresTableView();
            vBox = new VBox();
            vBox.getChildren().addAll(tableViewLideres);                        

            vbox2 = new VBox( tableViewLideres, buttonHBox );
            vbox2.setPadding( new Insets(10) );
            vbox2.setSpacing( 10 );

            scene = new Scene(vbox2);

            window.setScene(scene);
            window.show();
        });

        btnReporte3.setOnAction(event -> {
            System.out.println("Informe 3");
            tableViewLideres = Reporte3Controller.getComprasHomeCenterTablewView();
            vBox = new VBox();
            vBox.getChildren().addAll(tableViewLideres);                        

            vbox2 = new VBox( tableViewLideres, buttonHBox );
            vbox2.setPadding( new Insets(10) );
            vbox2.setSpacing( 10 );

            scene = new Scene(vbox2);

            window.setScene(scene);
            window.show();
        });

    }


    public static void main(String[] args) {
        launch();
    }

}