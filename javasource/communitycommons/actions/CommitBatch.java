// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import communitycommons.Batches;

/**
 * Commit a batch
 * - uniqueBatchIdentfier: the batch to commit. 
 * 
 * The method is borrowed from the Random Data Generator. 
 * https://appstore.mendix.com/link/app/Random%20data%20generator
 * 
 * See its documentation for more details.
 */
public class CommitBatch extends UserAction<Boolean>
{
	private String uniqueBatchIdentifier;

	public CommitBatch(String uniqueBatchIdentifier)
	{
		super();
		this.uniqueBatchIdentifier = uniqueBatchIdentifier;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return Batches.commitBatch(this.getContext(), uniqueBatchIdentifier);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "CommitBatch";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}