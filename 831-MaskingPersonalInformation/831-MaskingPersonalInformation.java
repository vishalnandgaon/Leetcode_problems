// Last updated: 09/09/2026, 16:24:47
class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            return maskEmail(s);
        } else {
            return maskPhone(s);
        }
    }
    
    private String maskEmail(String s) {
        s = s.toLowerCase();
        int atIndex = s.indexOf('@');
        String name = s.substring(0, atIndex);
        String domain = s.substring(atIndex);
        
        return name.charAt(0) + "*****" + name.charAt(name.length() - 1) + domain;
    }
    
    private String maskPhone(String s) {
        // Extract only digits
        StringBuilder digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        
        String local = digits.toString();
        int totalDigits = local.length();
        int countryCodeDigits = totalDigits - 10;
        
        // Last 4 digits visible
        String lastFour = local.substring(totalDigits - 4);
        String masked = "***-***-" + lastFour;
        
        if (countryCodeDigits == 0) {
            return masked;
        } else {
            String countryStars = "*".repeat(countryCodeDigits);
            return "+" + countryStars + "-" + masked;
        }
    }
}