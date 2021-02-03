package com.sample;

public class Pacijent {
	public String dijagnoza = "nepoznato";
	public int red =0;
	
	public String kategorija="nepoznato";
	public String tipbola="nepoznato";
	public String nivokoze="nepoznato";
	public String promenabol = "nepoznato";
	public String promenakozaprvo = "nepoznato";
	public String promenakoza2 = "nepoznato";
	public String temperatura = "nepoznato";
	public String grlo = "nepoznato";
	public String kasalj = "nepoznato";
	public String nos = "nepoznato";
	public String iskasljavanje = "nepoznato";
	public String gorusica = "nepoznato";
	public String gastroitegobe = "nepoznato";
	
	public String getGastroitegobe() {
		return gastroitegobe;
	}
	public void setGastroitegobe(String gastroitegobe) {
		this.gastroitegobe = gastroitegobe;
	}
	public String getNivokoze() {
		return nivokoze;
	}
	public void setNivokoze(String nivokoze) {
		this.nivokoze = nivokoze;
	}
	public String getPromenakoza2() {
		return promenakoza2;
	}
	public void setPromenakoza2(String promenakoza2) {
		this.promenakoza2 = promenakoza2;
	}

	public void setDijagnoza(String dijagnoza) {
		this.dijagnoza=dijagnoza;
	}
	public void setRed(int red) {
		this.red=red;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	public String getTipbola() {
		return tipbola;
	}
	public void setTipbola(String tipbola) {
		this.tipbola = tipbola;
	}
	public String getPromenabol() {
		return promenabol;
	}
	public void setPromenabol(String promenabol) {
		this.promenabol = promenabol;
	}
	public String getPromenakozaprvo() {
		return promenakozaprvo;
	}
	public void setPromenakozaprvo(String promenakozaprvo) {
		this.promenakozaprvo = promenakozaprvo;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getGrlo() {
		return grlo;
	}
	public void setGrlo(String grlo) {
		this.grlo = grlo;
	}
	public String getKasalj() {
		return kasalj;
	}
	public void setKasalj(String kasalj) {
		this.kasalj = kasalj;
	}
	public String getNos() {
		return nos;
	}
	public void setNos(String nos) {
		this.nos = nos;
	}
	public String getIskasljavanje() {
		return iskasljavanje;
	}
	public void setIskasljavanje(String iskasljavanje) {
		this.iskasljavanje = iskasljavanje;
	}
	public String getGorusica() {
		return gorusica;
	}
	public void setGorusica(String gorusica) {
		this.gorusica = gorusica;
	}
	public String getDijagnoza() {
		return dijagnoza;
	}
	public int getRed() {
		return red;
	}
	
	public String toString() {
		return this.dijagnoza;
	}

}
