private static final String VALID_EMAIL = "name@email.com";
private static final String REAL_EMAIL = "i.fotopoulos42@gmail.com";
 
   @Test
    public void testResetPassword_noUserFound()
    {
        String no_user_found = "no user found with email "+VALID_EMAIL;

        onView(withId(R.id.email)).perform(typeText(VALID_EMAIL), closeSoftKeyboard());
        onView(withId(R.id.button_forgot_password)).perform(click());
        onView(withText(no_user_found)).check(matches(isDisplayed()));
    }

    @Test
    public void testResetPassword_success()
    {
        onView(withId(R.id.email)).perform(typeText(REAL_EMAIL), closeSoftKeyboard());
        onView(withId(R.id.button_forgot_password)).perform(click());
        onView(withText(res.getString(R.string.password_reset_success))).check(matches(isDisplayed()));
    }
