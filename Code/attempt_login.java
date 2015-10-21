protected void attemptLogin()
{
	resetErrors();

	// Store values at the time of the login attempt.
	String email = mEmailView.getText().toString().trim();
	String password = mPasswordView.getText().toString().trim();

	loginPresenter.authenticateUser(email, password);

}
