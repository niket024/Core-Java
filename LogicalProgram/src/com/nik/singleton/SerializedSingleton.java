package com.nik.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable
{

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton()
	{
	}

	private static class SingletonHelper
	{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.instance;
	}

	// For Serializable and Externalizable classes, the readResolve method
	// allows a class to replace/resolve the object read from the stream before
	// it is returned to the caller. By implementing the readResolve method, a
	// class can directly control the types and instances of its own instances
	// being deserialized. more. https://www.math.uni-hamburg.de/doc/java/jdk1.4.1/docs/guide/serialization/spec/input.doc7.html
	//If you comment the this method then this singleton can be easily break while deserialize
	protected Object readResolve()
	{
		return getInstance();
	}
}
