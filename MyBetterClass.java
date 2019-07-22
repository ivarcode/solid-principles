public interface ICommentValidator {
	validate(author, comment);
}

public class MyBetterClass {
	
	private ICommentValidator[] allValidators;
	private getAuthor() { /* return current author */ }
	
	public MyBetterClass(ICommentValidator[] cV) {
		allValidators = cV;
	}

	public void postComment() {
		if (commentIsValid(comment)) {
			// post comment
		}
	}

	private commentIsValid(comment) {
		for (val in allValidators) {
			if (!val.validate(getAuthor(),comment) {
				return false;
			}
		}
		return true;
	}

}
