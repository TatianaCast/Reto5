package com.example.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.vo.CasaCampestreVo;
import com.example.utilities.JDBCUtilities;

public class CasaCampestreDao {    

    private static final String ID_PROYECTO         = "ID_Proyecto";
    private static final String CONSTRUCTORA        = "Constructora";
    private static final String NUMERO_HABITACIONES = "Numero_Habitaciones";
    private static final String CIUDAD              = "Ciudad";

    public static List<CasaCampestreVo> getCasasCampestres(){
        List<CasaCampestreVo> casaCampestreVoList = new ArrayList<>();
        String sqlStatement = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  FROM Proyecto where Clasificacion = 'Casa Campestre' and Ciudad in ('Santa Marta', 'Cartagena', 'Barranquilla')";

        try{
            Connection connection = JDBCUtilities.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                CasaCampestreVo campestreVo = new CasaCampestreVo();
                campestreVo.setIdProyecto(rs.getInt(ID_PROYECTO));
                campestreVo.setConstructora(rs.getString(CONSTRUCTORA));
                campestreVo.setNumeroHabitaciones(rs.getInt(NUMERO_HABITACIONES));
                campestreVo.setCiudad(rs.getString(CIUDAD));
                casaCampestreVoList.add(campestreVo);
            }

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }

        return casaCampestreVoList;
    }

}
