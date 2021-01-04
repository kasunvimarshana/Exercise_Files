package sampleEntityBean;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ApplicationClient {

	public static void main(String[] args) throws NamingException, RemoteException, CreateException {
		Context initial = new InitialContext();
		Context environment = (Context)initial.lookup("java:comp/env");
		homeInterface home = (homeInterface)initial.lookup("SampleEntityBean");
		SampleEntityBean bean = home.create();
	}
}
