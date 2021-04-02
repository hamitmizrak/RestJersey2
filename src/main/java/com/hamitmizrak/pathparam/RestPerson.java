package com.hamitmizrak.pathparam;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/restPerson")
public class RestPerson {

	static List<Person> personList = new ArrayList<Person>();

	static {
		Person person1 = new Person(10, "Hamit", "Mızrak", "Bilgisayar Müh");
		Person person2 = new Person(20, "Hulusi", "Mızrak", "Bilgisayar Müh");
		Person person3 = new Person(30, "Emre", "Aydın", "Bilgisayar Müh");

		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
	}

	@GET
	@Produces("text/plain; charset=UTF-8")
	@Path("/object/{id}-{adi}-{soyadi}-{bolum}")
	public String getObject(@PathParam("id") long id, @PathParam("adi") String adi, @PathParam("soyadi") String soyadi,
			@PathParam("bolum") String bolum) {

		Person person = new Person(id, adi, soyadi, bolum);

		return person.getPersonId() + " " + person.getAdi().toUpperCase() + " " + person.getSoyadi().toUpperCase() + " "
				+ person.getBolumu().toLowerCase();
	}

}
