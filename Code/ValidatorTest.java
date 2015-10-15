public class ValidatorTest
{
   private final Validator validator = new Validator();

    //Password Tests
    @Test
    public void password_validator_less_than_6()
    {
        String password = "12345";
        boolean expected = false;

        assertThat(validator.isPasswordValid(password),is(expected));

    }

    @Test
    public void password_validator_more_than_6()
    {
        String password = "1234567";
        boolean expected = true;

        assertThat(validator.isPasswordValid(password),is(expected));

    }
}
