// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.RestServices;
import restservices.consume.RestConsumer;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * 
 */
public class getCollection extends UserAction<Boolean>
{
	private String collectionUrl;
	private java.util.List<IMendixObject> __resultList;
	private java.util.List<restservices.proxies.AnyObject> resultList;
	private IMendixObject __firstResult;
	private restservices.proxies.AnyObject firstResult;

	public getCollection(String collectionUrl, java.util.List<IMendixObject> resultList, IMendixObject firstResult)
	{
		super();
		this.collectionUrl = collectionUrl;
		this.__resultList = resultList;
		this.__firstResult = firstResult;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.resultList = new java.util.ArrayList<restservices.proxies.AnyObject>();
		if (__resultList != null)
			for (IMendixObject __resultListElement : __resultList)
				this.resultList.add(restservices.proxies.AnyObject.initialize(getContext(), __resultListElement));

		this.firstResult = __firstResult == null ? null : restservices.proxies.AnyObject.initialize(getContext(), __firstResult);

		// BEGIN USER CODE
		RestConsumer.getCollection(getContext(), collectionUrl, __resultList, __firstResult);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getCollection";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
