package com.crud.model;

public class Entrence {
	private int id;

	private String nafn;
	private int pontun;
	private String dagsetning ;
	private int rekkan;
	private String siminn;
	private String gata;
	private String postn;
	
	public Entrence (int id , String nafn , int pontun, String dagsetning,
			int rekkan, String siminn, String gata, String postn){
		          this.id = id;
                  this.nafn = nafn;
                  this.pontun = pontun;
                  this.dagsetning = dagsetning;
                  this.rekkan = rekkan;
                  this.siminn = siminn;
                  this.gata = gata;
                  this.postn = postn;
	
             
                  }
                  // overloaded constructor 
                  public Entrence ( String nafn , int pontun, String dagsetning,
              			int rekkan, String siminn, String gata, String postn){
                                this.nafn = nafn;
                                this.pontun = pontun;
                                this.dagsetning = dagsetning;
                                this.rekkan = rekkan;
                                this.siminn = siminn;
                                this.gata = gata;
                                this.postn = postn;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNafn() {
		return nafn;
	}
	public void setNafn(String nafn) {
		this.nafn = nafn;
	}
	public int getPontun() {
		return pontun;
	}
	public void setPontun(int pontun) {
		this.pontun = pontun;
	}
	public String getDagsetning() {
		return dagsetning;
	}
	public void setDagsetning(String dagsetning) {
		this.dagsetning = dagsetning;
	}
	public int getRekkan() {
		return rekkan;
	}
	public void setRekkan(int rekkan) {
		this.rekkan = rekkan;
	}
	public String getSiminn() {
		return siminn;
	}
	public void setSiminn(String siminn) {
		this.siminn = siminn;
	}
	public String getGata() {
		return gata;
	}
	public void setGata(String gata) {
		this.gata = gata;
	}
	public String getPostn() {
		return postn;
	}
	public void setPostn(String postn) {
		this.postn = postn;
	}




}
