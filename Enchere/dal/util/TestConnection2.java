package fr.eni.enchere2.dal.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection2 {

	public static void main(String[] args) {
		try(Connection con = ConnectionProvider.getConnection()){
			System.out.println("JE SUIS CONNECTE");
		}
		catch(SQLException e) {
			System.out.println("JE NE ME CONNECTE PAS !!");
			e.printStackTrace();
			
		}
	}

}
