/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.tests;

import main.workshopgitproject.classes.Invoice;
import main.workshopgitproject.classes.InvoiceLine;
import main.workshopgitproject.classes.Product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert.*;
import org.junit.Test;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of TestInvoiceLine.
 * 
 * @author Ricardo
 */
public class TestInvoiceLine {
	// Start of user code (user defined attributes for TestInvoiceLine)

	// End of user code

	/**
	 * The constructor.
	 */
	public TestInvoiceLine() {
		// Start of user code constructor for TestInvoiceLine)
		super();
		// End of user code
	}

	/**
	 * Description of the method testInvoiceLineAmount.
	 */
	@Test
	public void testInvoiceLineAmount() {
		// Start of user code for method testInvoiceLineAmount
		// End of user code
		//Vamos a calcular el importe de 4 paquetes de galletas,
		//sabiendo que cada paquete vale 2,5 euros
		//Create a new product
		Product p = new Product();
		p.setIdentifier(1);
		p.setDescription("Paquete de galletas");
		p.setPrice(2.5);
		p.setStock(14);
		//Create a new InvoiceLine
		InvoiceLine ivn= new InvoiceLine();
		ivn.setNumber(1);
		ivn.setProducts(p);
		ivn.setQuantity(4);
		double correctPrice=10;
		assertEquals(correctPrice,ivn.getInvoiceLineAmount(),0.02);
	}

	/**
	 * Description of the method testInvoiceAmount.
	 */
	@Test
	public void testInvoiceAmount() {
		// Start of user code for method testInvoiceAmount
		// End of user code
		Product p = new Product();
		p.setIdentifier(1);
		p.setDescription("Cockie box");
		p.setPrice(2.5);
		p.setStock(14);
		//Create a new InvoiceLine
		InvoiceLine ivn= new InvoiceLine();
		ivn.setNumber(1);
		ivn.setProducts(p);
		ivn.setQuantity(4);
		//Add another product
		Product p1 = new Product();
		p1.setIdentifier(2);
		p1.setDescription("Razors packet");
		p1.setPrice(6);
		p1.setStock(14);
		//Create a new InvoiceLine
		InvoiceLine ivn1= new InvoiceLine();
		ivn1.setNumber(2);
		ivn1.setProducts(p1);
		ivn1.setQuantity(5);
		//Create a new Invoice
		//Total amount should be 10€+30€
		Invoice invo= new Invoice();
		
		double correctInvoiceAmount=40;
		assertEquals(correctInvoiceAmount,invo.getTotalAmount(),0.02);
		
		
	}

	/**
	 * Description of the method testAvaliableStock.
	 */
	@Test
	public void testAvaliableStock() {
		// Start of user code for method testAvaliableStock
		// End of user code
		Product p = new Product();
		p.setIdentifier(1);
		p.setDescription("Cockie box");
		p.setPrice(2.5);
		p.setStock(14);
		
		assertTrue(p.getStock()>0);
	}

	// Start of user code (user defined methods for TestInvoiceLine)

	// End of user code

}
