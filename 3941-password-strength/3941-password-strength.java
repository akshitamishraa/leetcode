class Solution {
public int passwordStrength(String password) {
int strength = 0;
boolean[] seen = new boolean[128];

    int i = 0;

    while (i < password.length()) {
        char ch = password.charAt(i);

        if (!seen[ch]) {
            if (Character.isLowerCase(ch)) {
                strength += 1;
                seen[ch] = true;
            }
            else if (Character.isUpperCase(ch)) {
                strength += 2;
                seen[ch] = true;
            }
            else if (Character.isDigit(ch)) {
                strength += 3;
                seen[ch] = true;
            }
            else if ("!@#$".indexOf(ch) != -1) {
                strength += 5;
                seen[ch] = true;
            }
        }

        i++;
    }

    return strength;
}

}
