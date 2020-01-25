package com.nik.important;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class Ref {

}

public class WeakSoftPanthomReferenceDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Ref ref = new Ref(); // strong reference
		@SuppressWarnings("unused")
		WeakReference<Ref> weakRef = new WeakReference<Ref>(ref); // weak reference
		ref = null; // now Ref object is eligible for garbage collection

		Ref ref1 = new Ref(); // Ref holds a strong reference
		SoftReference<Ref> soft = new SoftReference<Ref>(ref1); // soft reference variable has SoftReference to Ref //
																// Object created
		ref1 = null; // now Ref object is eligible for garbage collection but only be collected when
						// JVM absolutely needs memory

		Ref ref2 = new Ref(); // strong reference
		PhantomReference<Ref> phantom = new PhantomReference<Ref>(ref2, null); // phantom reference to object created
		ref2 = null;

	}
}
