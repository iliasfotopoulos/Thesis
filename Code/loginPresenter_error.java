public void onUsernameError(String anError)
{
	view.setUsernameError(anError);
	view.setUsernameFocus();
	view.hideProgressBar();
	cancel = true;
}
