package com.config.singleton;

import java.util.HashSet;
import java.util.Set;

public class SingletonDesign {

	private Set<Object> singleton = new HashSet<Object>();

	public SingletonDesign() {
		singleton.add(new DenemeServis());
	}

	public Set<Object> getSingleton() {
		return singleton;
	}

}
