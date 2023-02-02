package com.xworkz.pen.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.PreparableStatement.PreparableStatementFinalizer;
import com.xworkz.pen.dto.PenDto;
import com.xworkz.pen.util.DBUtils;

public class PenRepoImpl implements PenRepo {

	@Override
	public boolean save(PenDto dto) {

String query = "insert into pens values(?,?,?,?,?)";

try(Connection connection = DBUtils.getConnection();
		PreparedStatement statement = connection.prepareStatement(query);) {
	
statement.setInt(1, dto.getId());
statement.setString(2, dto.getName());
statement.setString(3, dto.getColor());
statement.setInt(4, dto.getPrice());
statement.setString(5, dto.getType());
statement.executeUpdate();

} catch (SQLException e) {
	e.printStackTrace();
}

		
		return false;
	}

	@Override
	public List<PenDto> readAll() {

		String query = "select * from pens";

		try(Connection connection = DBUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			ResultSet set =statement.executeQuery();
			
			List<PenDto> list = new ArrayList<PenDto>();
			while(set.next())
			{
				int id =set.getInt(1);
				String name = set.getString(2);
				String color = set.getString(3);
				int price = set.getInt(4);
				String type =set.getString(5);
				PenDto dt = new PenDto(id, name, color, price, type) ;
				list.add(dt);
				
			}
			return list;
	}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

}

	@Override
	public PenDto findById(int id) {
		String query = "select * from pens where id=?";

		try(Connection connection = DBUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			
		return null;
	}
