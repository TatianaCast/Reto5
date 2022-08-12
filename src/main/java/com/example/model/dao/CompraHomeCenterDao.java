package com.example.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.model.vo.CompraHomeCenterVo;
import com.example.utilities.JDBCUtilities;

public class CompraHomeCenterDao {
    
    private static final String ID_COMPRA       = "ID_Compra";
    private static final String CONSTRUCTORA    = "Constructora";
    private static final String BANCO_VINCULADO = "Banco_Vinculado";
    
    public static List<CompraHomeCenterVo> getComprasHomecenter(){
        List<CompraHomeCenterVo> comprasHomerCenterList = new ArrayList<>();
        String sqlStatement = "SELECT C.ID_Compra, P.Constructora, P.Banco_Vinculado FROM Compra C inner join Proyecto P on C.ID_Proyecto = P.ID_Proyecto WHERE P.Ciudad = 'Salento' and C.Proveedor = 'Homecenter'";

        try{
            Connection connection = JDBCUtilities.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                CompraHomeCenterVo compraHomeCenterVo = new CompraHomeCenterVo();
                compraHomeCenterVo.setIdCompra(rs.getInt(ID_COMPRA));
                compraHomeCenterVo.setConstructora(rs.getString(CONSTRUCTORA));
                compraHomeCenterVo.setBancoVinculado(rs.getString(BANCO_VINCULADO));
                comprasHomerCenterList.add(compraHomeCenterVo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }

        return comprasHomerCenterList;
    }
}

