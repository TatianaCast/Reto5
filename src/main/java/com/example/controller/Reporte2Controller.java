package com.example.controller;

import java.util.List;

import com.example.model.dao.CasaCampestreDao;
import com.example.model.vo.CasaCampestreVo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Reporte2Controller{

    public static TableView getCasasCampestresTableView(){
        TableView<CasaCampestreVo> tableViewCampestres = new TableView<>();

        TableColumn<CasaCampestreVo, Integer> colId = new TableColumn<>("ID");
        colId.setMinWidth(100);
        colId.setCellValueFactory(new PropertyValueFactory<>("idProyecto"));

        TableColumn<CasaCampestreVo, String> colConstructora = new TableColumn<>("Constructora");
        colConstructora.setMinWidth(100);
        colConstructora.setCellValueFactory(new PropertyValueFactory<>("constructora"));

        TableColumn<CasaCampestreVo, Integer> colNumHabitaciones = new TableColumn<>("Habitaciones");
        colNumHabitaciones.setMinWidth(100);
        colNumHabitaciones.setCellValueFactory(new PropertyValueFactory<>("numeroHabitaciones"));

        TableColumn<CasaCampestreVo, String> colCiudad = new TableColumn<>("Ciudad");
        colCiudad.setMinWidth(100);
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("Ciudad"));

        List<CasaCampestreVo> casaCampestreVoList = CasaCampestreDao.getCasasCampestres();
        ObservableList<CasaCampestreVo> observableList = FXCollections.observableArrayList();
        for(CasaCampestreVo casa: casaCampestreVoList){
            observableList.add(casa);
        }

        tableViewCampestres.setItems(observableList);
        tableViewCampestres.getColumns().addAll(colId,colConstructora,colNumHabitaciones,colCiudad);        

        return tableViewCampestres;
    }
}