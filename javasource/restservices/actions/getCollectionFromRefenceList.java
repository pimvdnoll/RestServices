// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class getCollectionFromRefenceList extends UserAction<Boolean>
{
	private java.util.List<IMendixObject> __references;
	private java.util.List<restservices.proxies.RestReference> references;
	private java.util.List<IMendixObject> __resultList;
	private java.util.List<restservices.proxies.AnyObject> resultList;
	private IMendixObject __firstResult;
	private restservices.proxies.AnyObject firstResult;

	public getCollectionFromRefenceList(java.util.List<IMendixObject> references, java.util.List<IMendixObject> resultList, IMendixObject firstResult)
	{
		super();
		this.__references = references;
		this.__resultList = resultList;
		this.__firstResult = firstResult;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.references = new java.util.ArrayList<restservices.proxies.RestReference>();
		if (__references != null)
			for (IMendixObject __referencesElement : __references)
				this.references.add(restservices.proxies.RestReference.initialize(getContext(), __referencesElement));

		this.resultList = new java.util.ArrayList<restservices.proxies.AnyObject>();
		if (__resultList != null)
			for (IMendixObject __resultListElement : __resultList)
				this.resultList.add(restservices.proxies.AnyObject.initialize(getContext(), __resultListElement));

		this.firstResult = __firstResult == null ? null : restservices.proxies.AnyObject.initialize(getContext(), __firstResult);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getCollectionFromRefenceList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}