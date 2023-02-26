package dao;

import java.util.ArrayList;
import java.util.List;
import bean.Pelicula;

public class PeliculaDAO {
	
	db.Db db =new db.Db("CineStar");
	
	
	//OJO!!!
	/*bLista-> true : se devuelve una lista de peliculas
	           false : se devuelve una matriz*/
	
	
	public Object getPeliculas(int id,boolean bLista) {
		db.Sentencia(String.format("call sp_getPeliculas(%s)", id));
		String [][] mregistros=db.getRegistros();
		
		if(mregistros==null) return null;
		if(!bLista) return mregistros;
		
		List<Pelicula> lstPeliculas= new ArrayList<>();
		for(String[] aRegistro:mregistros)
			lstPeliculas.add(new Pelicula(aRegistro));
		return lstPeliculas;
		
		
	}


	public Object getPelicula(String id, boolean bEntidad) {
		db.Sentencia(String.format("call sp_getPelicula(%s)", id));
		String []aregistro=db.getRegistro();
		
		if(aregistro==null) return null;
		if(!bEntidad) return aregistro;
		
		return new Pelicula(aregistro);
		
	}

}
