package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	int idCine,Salas,idDistrito;
	String RazonSocial="",Direccion="",Telefonos="",Detalle="";
	
	
	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public int getSalas() {
		return Salas;
	}
	public void setSalas(int salas) {
		Salas = salas;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefonos() {
		return Telefonos;
	}
	public void setTelefonos(String telefonos) {
		Telefonos = telefonos;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	
	
	public Cine() {}
	
	public Cine(String[]aRegistro) {
		
		setRegistro(aRegistro);
	}
	public void setRegistro(String[] aRegistro) {
		if(aRegistro == null)return;
		idCine=Integer.parseInt(aRegistro[0]);
		RazonSocial=aRegistro[1];
		Salas=Integer.parseInt(aRegistro[2]);
		idDistrito=Integer.parseInt(aRegistro[3]);
		Direccion=aRegistro[4];
		Telefonos=aRegistro[5];
		Detalle=aRegistro[6];
		
		
	}
	
	public Object[] getRegistro() {
		return new Object[] {idCine,RazonSocial,Salas,idDistrito,Direccion,Telefonos,Detalle};
		
	}
	
	public List<Cine> getRegistros(String[][] mRegistros){
		if(mRegistros == null) return null;
		List<Cine> lstCine=new ArrayList<>();
		for(String[] aCine:mRegistros) {
			lstCine.add(new Cine(aCine));
			
		}
		return lstCine;
	}
	
	
	
	
	
	
	
	
	
	
	

}
