package com.example.controller;

import java.util.List;

import com.example.model.vo.LiderVo;
import com.example.model.dao.LiderDao;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Reporte1Controller {       
 
    public static TableView getLideresTableView(){        
        
        TableView<LiderVo> tableViewLideres = new TableView<>();

        TableColumn<LiderVo, Integer> colId = new TableColumn<>("ID");
        colId.setMinWidth(100);
        colId.setCellValueFactory(new PropertyValueFactory<>("idLider"));

        TableColumn<LiderVo, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setMinWidth(150);
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<LiderVo, String> colApellido = new TableColumn<>("Apellido");
        colApellido.setMinWidth(150);
        colApellido.setCellValueFactory(new PropertyValueFactory<>("primerApellido"));

        TableColumn<LiderVo, String> colCiudad = new TableColumn<>("Ciudad");
        colCiudad.setMinWidth(150);
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudadResidencia"));

        List<LiderVo> lideresList = LiderDao.getLideres();   
        ObservableList<LiderVo> observableList = FXCollections.observableArrayList();     
        for(LiderVo lider: lideresList){
            observableList.add(lider);
        }

        tableViewLideres.setItems(observableList);
        tableViewLideres.getColumns().addAll(colId,colNombre,colApellido,colCiudad);

        return tableViewLideres;
    }
}
