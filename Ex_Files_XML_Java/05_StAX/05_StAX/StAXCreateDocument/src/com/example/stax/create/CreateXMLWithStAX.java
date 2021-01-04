package com.example.stax.create;

import java.util.List;

import com.example.dataprovider.DataProvider;
import com.example.model.Customer;

public class CreateXMLWithStAX {

	public static void main(String[] args) {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);
		
		StAXStreamCreator creator = new StAXStreamCreator();
		creator.createDocument(data, "./output/customers.xml");
		
	}
}
