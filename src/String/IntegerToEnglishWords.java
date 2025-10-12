class Solution {
    public String numberToWords(int num) {
        String below[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String tens[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        if (num == 0) {
            return "Zero";
        }
        StringBuilder sb = new StringBuilder();

        if (num >= 1000000000) {
            sb.append(numberToWords(num / 1000000000)).append(" Billion");
            num %= 1000000000;
            if (num > 0)
                sb.append(" ");
        }

        if (num >= 1000000) {
            sb.append(numberToWords(num / 1000000)).append(" Million");
            num %= 1000000;
            if (num > 0)
                sb.append(" ");
        }

        if (num >= 1000) {
            sb.append(numberToWords(num / 1000)).append(" Thousand");
            num %= 1000;
            if (num > 0)
                sb.append(" ");
        }

        if (num >= 100) {
            sb.append(below[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0)
                sb.append(" ");
        }

        if (num >= 20) {
            sb.append(tens[num / 10]);
            if (num % 10 > 0)
                sb.append(" ").append(below[num % 10]);
        } else if (num > 0) {
            sb.append(below[num]);
        }

        return sb.toString();
    }
}
