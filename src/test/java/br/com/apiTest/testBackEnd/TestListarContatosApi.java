package br.com.apiTest.testBackEnd;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;




public class TestListarContatosApi {
	
	private final static int status = 200;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Test
	public void testStatusCorreto() {
		String baseURI = "http://52.191.254.38/desafio/produtos";
		given()
		.relaxedHTTPSValidation()
		.when().get(baseURI)
		.then().statusCode(status)
		.contentType("text/html");
	}
	@Test
	public void testStatusIncorreto() {
		String baseURI = "http://52.191.254.38/desafio/produtos";
		given()
		.relaxedHTTPSValidation()
		.when().get(baseURI)
		.then().statusCode(401)
		.contentType("text/html");
	}

}