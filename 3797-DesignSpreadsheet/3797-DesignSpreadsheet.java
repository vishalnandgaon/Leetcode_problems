// Last updated: 19/09/2025, 18:29:49
import java.util.*;

public class Spreadsheet {
    // Using a map from cell reference (like "A1") to its value
    private Map<String, Integer> cellValues;

    public Spreadsheet(int rows) {
        cellValues = new HashMap<>();
        // rows is given but we don't need to store all cells explicitly
    }

    public void setCell(String cell, int value) {
        cellValues.put(cell, value);
    }

    public void resetCell(String cell) {
        // resetting means go back to 0; we can remove entry (so default is 0), or store 0
        cellValues.remove(cell);
    }

    public int getValue(String formula) {
        // formula always starts with "=" and has exactly two operands separated by '+'
        // e.g. "=A1+5" or "=10+B2" or "=A1+B2" or "=5+7"

        // remove leading '='
        String expr = formula.substring(1);
        // split on '+'
        String[] parts = expr.split("\\+");
        // expecting exactly two parts
        int sum = 0;
        for (String part : parts) {
            if (part.isEmpty()) {
                // should not happen per problem constraints
                continue;
            }
            char first = part.charAt(0);
            if (Character.isDigit(first)) {
                // it's a number
                sum += Integer.parseInt(part);
            } else {
                // it's a cell reference
                sum += cellValues.getOrDefault(part, 0);
            }
        }
        return sum;
    }
}
