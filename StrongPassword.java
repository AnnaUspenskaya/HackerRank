
/*Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?
 */
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        String special_characters = "!@#$%^&*()-+";
        boolean digit = false;
        boolean up = false;
        boolean low = false;
        boolean special = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digit = true;
            } else if (Character.isLowerCase(c)) {
                low = true;
            } else if (Character.isUpperCase(c)) {
                up = true;
            } else if (special_characters.indexOf(c) != -1) {
                special = true;
            }
        }
        if (!digit) count++;
        if (!up) count++;
        if (!low) count++;
        if (!special) count++;
        if (count + n < 6) {
            count += 6 - (count + n);
        }
        return count;
    }