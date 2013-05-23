package com.crud.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.crud.dao.banco.ConnectionFactory;
import com.crud.model.Entrence;


public class FetchGlerskalinn {
private final String URL = "jdbc:mysql://localhost:3306/CRUD";
private final String NAME = "xxx";
private final String PASS = "xxx";

private Connection con;
private Statement comand;


public void conectar() {
	try {
		con = ConnectionFactory.conexao(URL, NAME,PASS,
				ConnectionFactory.MYSQL);
		comand = con.createStatement();
		System.out.println("Connected");
	} catch (ClassNotFoundException e) {
		System.out.println("Error loading the  driver: " + e.getMessage());
	} catch (SQLException e) {
		System.err.println("Error connecting : " + e.getMessage());
	}
}

public void fechar() {
	try {
		comand.close();
		con.close();
		System.out.println("Disconectet");
	} catch (SQLException e) {
		System.err.println("Error connecting : " + e.getMessage());
	}
}

   public void create (Entrence entrfromispan){
		conectar();
		try {
			comand.execute("INSERT INTO JavaCRUD2(nafn,pontun,dagsetning,rekka ,siminn, gata, postn) VALUES('"
					+ entrfromispan.getNafn()
					+ "', '"
					+ entrfromispan.getPontun()
					+ "', '"
					+ entrfromispan.getDagsetning()
					+ "', '" 
					+ entrfromispan.getRekkan()					
				    + "', '"
					+ entrfromispan.getSiminn()
					+ "', '"
					+ entrfromispan.getGata()
					+ "', '"
					+ entrfromispan.getPostn()
					+ "')");
		} catch (SQLException e) {
			System.err.println("Error entring user : " + e.getMessage());
		} finally {
			fechar();
		}
	}
   
   public List<Entrence> readAll() {
		conectar();
		List<Entrence> list = new ArrayList<Entrence>();
		ResultSet rs;
		Entrence temp = null;
		try {
			rs = comand.executeQuery("SELECT * FROM JavaCRUD2");
			while (rs.next()) {
				temp = new Entrence(rs.getString("nafn"), rs.getInt("pontun"),
						rs.getString("dagsetning"), rs.getInt("rekka"),
						rs.getString("siminn"), rs.getString("gata"), rs.getString("postn"));
				list.add(temp);
			}
			return list;
		} catch (SQLException e) {
			System.err.println("Error selecting entry: " + e.getMessage());
			return null;
		} finally {
			fechar();
		}
	}  
   public Entrence delete (int rekka){
	   ResultSet rs;
	   Entrence entranseToDelete= null;
	   
	   
	   conectar();
	     
		 try {
			 rs = comand.executeQuery("SELECT nafn,pontun,dagsetning,rekka,siminn,gata,postn  FROM javacrud2  WHERE rekka = "+ rekka+ ";" );
				
			 entranseToDelete = new Entrence(rs.getString("Nafn"), rs.getInt("Pontun"), rs.getString("dagsetning"), rekka, rs.getString("Siminn"), rs.getString("Gata"), rs.getString("Pastn"));
			
			 
		    }
		    catch (SQLException e) {
				System.err.println("Error getting  resultset: " + e.getMessage());
			} finally {
				fechar();
			}
	   
	   conectar();
	     
	 try {
	    	comand.execute("DELETE FROM javacrud2 WHERE rekka = '" + rekka +"';"    );
	    }
	    catch (SQLException e) {
			System.err.println("Error deleting entry: " + e.getMessage());
		} finally {
			fechar();
		}
	 return entranseToDelete;
   }
	   
	   
   }


