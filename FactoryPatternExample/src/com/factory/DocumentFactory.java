package com.factory;

public class DocumentFactory {
	
	public Document getObject(String string) {
		
		if("word".equalsIgnoreCase(string)) {
			return new WordDocument();
		}
		else if("pdf".equalsIgnoreCase(string)) {
			return new PdfDocument();
		}
		else if("excel".equalsIgnoreCase(string)) {
			return new ExcelDocument();
		}
		return null;
	}

}
