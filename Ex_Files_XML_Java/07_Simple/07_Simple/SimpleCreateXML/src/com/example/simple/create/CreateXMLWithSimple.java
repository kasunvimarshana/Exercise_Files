package com.example.simple.create;

import java.io.IOException;
import java.util.List;

import com.example.dataprovider.DataProvider;
import com.example.simple.model.Customer;

public class CreateXMLWithSimple {
	public static void main(String[] args) throws IOException {

		List<Customer> data = DataProvider.getData(DataProvider.SMALL);

	}
}
