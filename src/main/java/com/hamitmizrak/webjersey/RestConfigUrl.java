package com.hamitmizrak.webjersey;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/config")
public class RestConfigUrl extends Application {

	// http://localhost:8080/RestWebServices/rest2/deneme

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> genelUrl = new HashSet<Class<?>>();
		genelUrl.add(Rest_004_SubPath.class);
		return genelUrl;
	}

}
