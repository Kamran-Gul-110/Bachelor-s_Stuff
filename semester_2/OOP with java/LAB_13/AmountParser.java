class AmountParser {

    public static double parseNonNegativeAmount(String text) {

        if (text == null || text.trim().equals("")) {
            throw new IllegalArgumentException("empty input");
        }

        double value;

        try {
            value = Double.parseDouble(text);
        } catch (Exception e) {
            throw new IllegalArgumentException("not a number");
        }

        if (value < 0) {
            throw new IllegalArgumentException("negative not allowed");
        }

        return value;
    }

    public static double sumNonNegativeAmounts(String[] lines) {
        double sum = 0;

        for (int i = 0; i < lines.length; i++) {
            sum = sum + parseNonNegativeAmount(lines[i]);
        }

        return sum;
    }

    public static int countInvalidAmountLines(String[] lines) {
        int count = 0;

        for (int i = 0; i < lines.length; i++) {
            try {
                parseNonNegativeAmount(lines[i]);
            } catch (Exception e) {
                count++;
            }
        }

        return count;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println(
            AmountParser.parseNonNegativeAmount("120.5")
        );

        try {
            System.out.println(
                AmountParser.parseNonNegativeAmount("abc")
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(
                AmountParser.parseNonNegativeAmount("-5")
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String[] a = {"10", "20.5", "30"};
        System.out.println(
            AmountParser.sumNonNegativeAmounts(a)
        );

        String[] b = {"1", "x", "-2", "3"};
        System.out.println(
            AmountParser.countInvalidAmountLines(b)
        );
    }
}