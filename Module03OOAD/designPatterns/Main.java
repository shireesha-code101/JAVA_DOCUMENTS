package Module03OOAD.designPatterns;

import java.util.*;

// Strategy interface
interface SortingStrategy {
    void sort(List<String> items);
}

// Concrete Strategy 1: Alphabetical (case-insensitive)
class AlphabeticalSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}

// Concrete Strategy 2: Lengthwise (then alphabetical for ties)
class LengthSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        items.sort(
                Comparator.comparingInt(String::length)
                        .thenComparing(String.CASE_INSENSITIVE_ORDER)
        );
    }
}

// Context
class SortingStretagy {
    private final List<String> items = new ArrayList<>();
    private SortingStrategy strategy;

    // Set strategy dynamically
    public void SetstretegyforSorting(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    // Add items
    public void addItems(String... values) {
        for (String v : values) {
            if (v != null && !v.equalsIgnoreCase("done")) {
                items.add(v);
            }
        }
    }

    // Remove item
    public boolean removeItem(String value) {
        return items.remove(value);
    }

    // Perform sorting
    public void PerformancSort() {
        if (strategy != null) {
            strategy.sort(items);
        } else {
            throw new IllegalStateException("No strategy set!");
        }
    }

    // Get sorted list
    public List<String> getList() {
        return new ArrayList<>(items);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortingStretagy context = new SortingStretagy();

        System.out.println("Enter names (type 'Done' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Done")) break;
            context.addItems(input);
        }

        // Alphabetical sorting
        context.SetstretegyforSorting(new AlphabeticalSortStrategy());
        context.PerformancSort();
        System.out.println("\nAlpha sorting:");
        for (String s : context.getList()) {
            System.out.println(s);
        }

        // Lengthwise sorting
        context.SetstretegyforSorting(new LengthSortStrategy());
        context.PerformancSort();
        System.out.println("\nLethwise sorting:");
        for (String s : context.getList()) {
            System.out.println(s);
        }

        sc.close();
    }
}
