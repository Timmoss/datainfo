package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String boek){
			if(boek == "1"){
				return 10.0;
			}
			else return 0.0;
	}
}
