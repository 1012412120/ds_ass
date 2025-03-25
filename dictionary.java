package traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    private Map<String, String> wordMap;

    public Dictionary() {
        this.wordMap = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        wordMap.put(word.toLowerCase(), meaning);
        System.out.println("Word added successfully.");
    }

    public void deleteWord(String word) {
        if (wordMap.containsKey(word.toLowerCase())) {
            wordMap.remove(word.toLowerCase());
            System.out.println("Word deleted successfully.");
        } else {
            System.out.println("Word not found.");
        }
    }

    public void displayDictionary() {
        if (wordMap.isEmpty()) {
            System.out.println("Dictionary is empty.");
        } else {
            System.out.println("Dictionary:");
            for (Map.Entry<String, String> entry : wordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public void searchWord(String word) {
        if (wordMap.containsKey(word.toLowerCase())) {
            System.out.println("Meaning: " + wordMap.get(word.toLowerCase()));
        } else {
            System.out.println("Word not found.");
        }
    }

    public void updateWord(String word, String newMeaning) {
        if (wordMap.containsKey(word.toLowerCase())) {
            wordMap.put(word.toLowerCase(), newMeaning);
            System.out.println("Word updated successfully.");
        } else {
            System.out.println("Word not found.");
        }
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDictionary Menu:");
            System.out.println("1. Add Word");
            System.out.println("2. Delete Word");
            System.out.println("3. Display Dictionary");
            System.out.println("4. Search Word");
            System.out.println("5. Update Word");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter meaning: ");
                    String meaning = scanner.nextLine();
                    dictionary.addWord(word, meaning);
                    break;
                case 2:
                    System.out.print("Enter word to delete: ");
                    String deleteWord = scanner.nextLine();
                    dictionary.deleteWord(deleteWord);
                    break;
                case 3:
                    dictionary.displayDictionary();
                    break;
                case 4:
                    System.out.print("Enter word to search: ");
                    String searchWord = scanner.nextLine();
                    dictionary.searchWord(searchWord);
                    break;
                case 5:
                    System.out.print("Enter word to update: ");
                    String updateWord = scanner.nextLine();
                    System.out.print("Enter new meaning: ");
                    String newMeaning = scanner.nextLine();
                    dictionary.updateWord(updateWord, newMeaning);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}