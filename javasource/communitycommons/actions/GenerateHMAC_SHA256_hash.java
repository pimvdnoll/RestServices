// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Generates and asymmetric hash using the HMAC_SHA256 hash algorithm
 */
public class GenerateHMAC_SHA256_hash extends CustomJavaAction<String>
{
	private String key;
	private String valueToEncrypt;

	public GenerateHMAC_SHA256_hash(IContext context, String key, String valueToEncrypt)
	{
		super(context);
		this.key = key;
		this.valueToEncrypt = valueToEncrypt;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.generateHmacSha256Hash(key, valueToEncrypt);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GenerateHMAC_SHA256_hash";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
