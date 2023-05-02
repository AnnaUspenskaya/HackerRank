    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
        int count = 0;
        String specialChars = "-!@#$%^&*()+"; 
        // Check if the password contains a digit
        if (!password.matches(".*[0-9].*")) {
            count++;
        }
        // Check if the password contains a lowercase letter
        if (!password.matches(".*[a-z].*")) {
            count++;
        }
        // Check if the password contains an uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            count++;
        }

        // Check if the password contains a special character
        if (!password.matches(".*[" + specialChars + "].*")) {
            count++;
        }

        if (n + count < 6) {
            count += 6 - (n + count);
        }
        return count;
    }