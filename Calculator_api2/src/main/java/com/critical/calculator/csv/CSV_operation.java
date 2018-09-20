package com.critical.calculator.csv;
import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStreamReader;
import com.critical.calculator.operations.*;

/** @Author : Maria Pereira
 *  @importFicheiro - importa o ficheiro csv
 */

public class CSV_operation {
	
	private String virgula = ",";

	Calculator values = new Calculator();

	

	public void importFicheiro () throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader (new FileInputStream("tttc.csv")));

		String linha = null;

		while ((linha = reader.readLine()) != null){

			String dado[] = linha.split(virgula);

			values.setfirstValue(Double.parseDouble(dado[0]));

			values.setsecondValue(Double.parseDouble(dado[1]));

			values.setOperator(dado[2]);

		}

		reader.close();	

	}

	

	public void exportFicheiro () throws Exception {

			

	}

}
