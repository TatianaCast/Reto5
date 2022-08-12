package com.example.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.vo.LiderVo;
import com.example.utilities.JDBCUtilities;

public class LiderDao {
    
    private static final String ID_LIDER            = "ID_Lider";
    private static final String NOMBRE              = "Nombre";
    private static final String PRIMER_APELLIDO     = "Primer_Apellido";
    private static final String CIUDAD_RESIDENCIA   = "Ciudad_Residencia";

    public static List<LiderVo> getLideres(){
        List<LiderVo> lideresList = new ArrayList<>();
        String sqlStatement = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";

        try{
            Connection connection = JDBCUtilities.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                LiderVo liderVo = new LiderVo();
                liderVo.setIdLider(rs.getInt(ID_LIDER));
                liderVo.setNombre(rs.getString(NOMBRE));
                liderVo.setPrimerApellido(rs.getString(PRIMER_APELLIDO));
                liderVo.setCiudadResidencia(rs.getString(CIUDAD_RESIDENCIA));
                lideresList.add(liderVo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }

        return lideresList;
    }
}
