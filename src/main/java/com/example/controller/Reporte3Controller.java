package com.example.controller;

import java.util.List;

import com.example.model.dao.CompraHomeCenterDao;
import com.example.model.vo.CompraHomeCenterVo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Reporte3Controller {

    public static TableView getComprasHomeCenterTablewView(){

        TableView<CompraHomeCenterVo> tableViewCompras = new TableView<>();

        TableColumn<CompraHomeCenterVo, Integer> colId = new TableColumn<>("ID");
        colId.setMinWidth(100);
        colId.setCellValueFactory(new PropertyValueFactory<>("idCompra"));

        TableColumn<CompraHomeCenterVo, String> colConstructora = new TableColumn<>("Constructora");
        colConstructora.setMinWidth(100);
        colConstructora.setCellValueFactory(new PropertyValueFactory<>("constructora"));

        TableColumn<CompraHomeCenterVo, String> colBanco = new TableColumn<>("Banco");
        colBanco.setMinWidth(100);
        colBanco.setCellValueFactory(new PropertyValueFactory<>("bancoVinculado"));

        List<CompraHomeCenterVo> comprasHomerCenterList = CompraHomeCenterDao.getComprasHomecenter();
        ObservableList<CompraHomeCenterVo> observableList = FXCollections.observableArrayList();
        for(CompraHomeCenterVo compraHomeCenterDao: comprasHomerCenterList){
            observableList.add(compraHomeCenterDao);
        }

        tableViewCompras.setItems(observableList);
        tableViewCompras.getColumns().addAll(colId,colConstructora,colBanco);

        return tableViewCompras;
    }
    
}
