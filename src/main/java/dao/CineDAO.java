package dao;

public class CineDAO {

	db.Db db = new db.Db("CineStar");

	public String[][] getVerCines() {

		db.Sentencia("call sp_getCines()");

		return db.getRegistros();
	}

	public String[] getCine(Object idCine) {
		db.Sentencia(String.format("call sp_getCine(%s)", idCine));

		return db.getRegistro();
	}

	public String[][] getCineTarifas(Object idCine) {
		db.Sentencia(String.format("call sp_getCineTarifas(%s)", idCine));

		return db.getRegistros();
	}

	public String[][] getCinePeliculas(Object idCine) {
		db.Sentencia(String.format("call sp_getCinePeliculas(%s)", idCine));

		return db.getRegistros();
		
	}

}
