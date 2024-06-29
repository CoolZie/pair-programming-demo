import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

import com.tiktok.Main;

public class StreamlambdaTest {
    /**
     * Écrire une méthode `filterEvenNumbers` qui prend une liste d'entiers 
     * et retourne une nouvelle liste contenant uniquement les nombres pairs.
     */
    @Test
    public void testFilterEvenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);

        // Appel de la méthode à tester
        List<Integer> result = Main.filterEvenNumbers(list);

        // Assertion
        assertEquals(expected, result);
    }
    /**
     * Écrire une méthode `mapToSquare` qui prend une liste d'entiers 
     * et retourne une nouvelle liste contenant les carrés de ces nombres.
     */
    @Test
    public void testMapToSquare() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16);

        // Appel de la méthode à tester
        List<Integer> result = Main.mapToSquare(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `sumList` qui prend une liste d'entiers 
     * et retourne la somme de tous les éléments.
     */
    @Test
    public void testSumList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int expected = 15;

        // Appel de la méthode à tester
        int result = Main.sumList(list);

        // Assertion
        assertEquals(expected, result);
    }

     /**
     * Écrire une méthode `filterByCondition` qui prend une liste de chaînes de caractères
     * et retourne une nouvelle liste contenant uniquement les chaînes dont la longueur est supérieure à 3 et qui commencent par 'A'.
     */
    @Test
    public void testFilterByCondition() {
        List<String> list = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");
        List<String> expected = Arrays.asList("Apple", "Apricot", "Avocado");

        // Appel de la méthode à tester
        List<String> result = Main.filterByCondition(list);

        // Assertion
        assertEquals(expected, result);
    }

      /**
     * Écrire une méthode `sortStringsByLength` qui prend une liste de chaînes de caractères 
     * et retourne une nouvelle liste triée par la longueur des chaînes (croissant).
     */
    @Test
    public void testSortStringsByLength() {
        List<String> list = Arrays.asList("kiwi", "apple", "banana", "plum");
        List<String> expected = Arrays.asList("kiwi", "plum", "apple", "banana");

        // Appel de la méthode à tester
        List<String> result = Main.sortStringsByLength(list);

        // Assertion
        assertEquals(expected, result);
    }
    /**
     * Écrire une méthode `groupByFirstLetter` qui prend une liste de chaînes de caractères 
     * et retourne une map où les clés sont les premières lettres des chaînes et les valeurs sont les listes de chaînes correspondantes.
     */
    @Test
    public void testGroupByFirstLetter() {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "kiwi", "orange");
        Map<Character, List<String>> expected = Map.of(
            'a', Arrays.asList("apple", "avocado"),
            'b', Arrays.asList("banana"),
            'k', Arrays.asList("kiwi"),
            'o', Arrays.asList("orange")
        );

        // Appel de la méthode à tester
        Map<Character, List<String>> result = Main.groupByFirstCharacter(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `countWordsWithLengthGreaterThan` qui prend une liste de chaînes de caractères (mots)
     * et retourne le nombre de mots ayant une longueur supérieure à un certain nombre donné.
     */
    @Test
    public void testCountWordsWithLengthGreaterThan() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "kiwi", "orange");
        int length = 5;
        int expected = 3;

        // Appel de la méthode à tester
        int result = Main.countWordsWithLengthGreaterThan(words, length);

        // Assertion
        assertEquals(expected, result);
    }
/**
     * Écrire une méthode `partitionByPredicate` qui prend une liste d'entiers 
     * et partitionne les nombres en deux groupes : pairs et impairs.
     */
    @Test
    public void testPartitionByPredicate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> expected = Map.of(
            true, Arrays.asList(2, 4, 6, 8),
            false, Arrays.asList(1, 3, 5, 7)
        );

        // Appel de la méthode à tester
        Map<Boolean, List<Integer>> result = Main.partitionByPredicate(numbers);

        // Assertion
        assertEquals(expected, result);
    }

     /**
     * Écrire une méthode `multiplyListElements` qui prend une liste d'entiers 
     * et retourne le produit de tous les éléments.
     */
    @Test
    public void testMultiplyListElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int expected = 24;

        // Appel de la méthode à tester
        int result = Main.multiplyListElements(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `filterAndLimit` qui prend une liste d'entiers 
     * et retourne une nouvelle liste contenant les deux premiers nombres pairs rencontrés.
     */
    @Test
    public void testFilterAndLimit() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4);

        // Appel de la méthode à tester
        List<Integer> result = Main.filterAndSortLimit(list);

        // Assertion
        assertEquals(expected, result);
    }

   /**
     * Écrire une méthode `findFirstThreeSorted` qui prend une liste d'entiers 
     * et retourne les trois premiers nombres triés par ordre croissant.
     */
    @Test
    public void testFindFirstThreeSorted() {
        List<Integer> list = Arrays.asList(5, 1, 3, 6, 2, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3);

        // Appel de la méthode à tester
        List<Integer> result = Main.findFirstThreeSorted(list);

        // Assertion
        assertEquals(expected, result);
    }
    
     /**
     * Écrire une méthode `convertToUpperCaseSet` qui prend une liste de chaînes de caractères 
     * et retourne un ensemble (Set) contenant toutes les chaînes converties en majuscules.
     */
    @Test
    public void testConvertToUpperCaseSet() {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "orange");
        Set<String> expected = Set.of("APPLE", "BANANA", "KIWI", "ORANGE");

        // Appel de la méthode à tester
        Set<String> result = Main.convertToUpperCaseSet(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `groupByLength` qui prend une liste de chaînes de caractères 
     * et retourne une map où les clés sont les longueurs des chaînes et les valeurs sont les listes de chaînes correspondantes.
     */
    @Test
    public void testGroupByLength() {
        List<String> list = Arrays.asList("apple", "kiwi", "orange", "banana");
        Map<Integer, List<String>> expected = Map.of(
            5, Arrays.asList("apple", "orange"),
            4, Arrays.asList("kiwi"),
            6, Arrays.asList("banana")
        );

        // Appel de la méthode à tester
        Map<Integer, List<String>> result = Main.groupByLength(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `filterAndDistinct` qui prend une liste de chaînes de caractères 
     * et retourne une nouvelle liste contenant uniquement les chaînes distinctes dont la longueur est supérieure à 2.
     */
    @Test
    public void testFilterAndDistinct() {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "apple", "orange", "banana");
        List<String> expected = Arrays.asList("apple", "banana", "orange");

        // Appel de la méthode à tester
        List<String> result = Main.filterAndSortDistinct(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `calculateTotalPrice` qui prend une liste de produits (représentés par leur prix) 
     * et retourne le prix total après l'application d'une réduction de 10% sur chaque produit.
     */
    @Test
    public void testCalculateTotalPrice() {
        List<Double> prices = Arrays.asList(100.0, 50.0, 75.0);
        double expected = 202.5; // 100 * 0.9 + 50 * 0.9 + 75 * 0.9 = 90 + 45 + 67.5 = 202.5

        // Appel de la méthode à tester
        double result = Main.calculateTotalPrice(prices);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `sortDescending` qui prend une liste d'entiers 
     * et retourne une nouvelle liste triée en ordre décroissant.
     */
    @Test
    public void testSortDescending() {
        List<Integer> list = Arrays.asList(5, 1, 3, 7, 2, 4);
        List<Integer> expected = Arrays.asList(7, 5, 4, 3, 2, 1);

        // Appel de la méthode à tester
        List<Integer> result = Main.sortDescending(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `filterAndSort` qui prend une liste de chaînes de caractères 
     * et retourne une nouvelle liste contenant les chaînes triées par ordre alphabétique dont la longueur est supérieure à 3.
     */
    @Test
    public void testFilterAndSort() {
        List<String> list = Arrays.asList("kiwi", "orange", "apple", "banana", "grape");
        List<String> expected = Arrays.asList("apple", "banana", "grape", "orange");

        // Appel de la méthode à tester
        List<String> result = Main.filterAndSort(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `groupByFirstCharacter` qui prend une liste de chaînes de caractères 
     * et retourne une map où les clés sont les premiers caractères des chaînes (en majuscule) 
     * et les valeurs sont les listes de chaînes correspondantes.
     */
    @Test
    public void testGroupByFirstCharacter() {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "kiwi", "orange");
        Map<Character, List<String>> expected = Map.of(
            'A', Arrays.asList("apple", "avocado"),
            'B', Arrays.asList("banana"),
            'K', Arrays.asList("kiwi"),
            'O', Arrays.asList("orange")
        );

        // Appel de la méthode à tester
        Map<Character, List<String>> result = Main.groupByFirstCharacter(list);

        // Assertion
        assertEquals(expected, result);
    }

     /**
     * Écrire une méthode `filterAndCollectToSet` qui prend une liste de chaînes de caractères 
     * et retourne un ensemble (Set) contenant uniquement les chaînes dont la longueur est inférieure à 5.
     */
    @Test
    public void testFilterAndCollectToSet() {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        Set<String> expected = Set.of("kiwi");

        // Appel de la méthode à tester
        Set<String> result = Main.filterAndCollectToSet(list);

        // Assertion
        assertEquals(expected, result);
    }

    /**
     * Écrire une méthode `groupByCustomCondition` qui prend une liste d'entiers 
     * et groupe les nombres en deux catégories : ceux qui sont divisibles par 3 et ceux qui ne le sont pas.
     */
    @Test
    public void testGroupByCustomCondition() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> expected = Map.of(
            true, Arrays.asList(3, 6, 9),
            false, Arrays.asList(1, 2, 4, 5, 7, 8)
        );

        // Appel de la méthode à tester
        Map<Boolean, List<Integer>> result = Main.groupByCustomCondition(numbers);

        // Assertion
        assertEquals(expected, result);
    }


    /**
     * Test de la méthode `averageOfList`.
     * Énoncé : Écrire une méthode qui prend une liste d'entiers et retourne la moyenne de tous les éléments.
     */
    @Test
    public void testAverageOfList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double expected = 3.0;

        double result = Main.averageOfList(list);

        assertEquals(expected, result);
    }

    /**
     * Test de la méthode `collectToMap`.
     * Énoncé : Écrire une méthode qui prend une liste de chaînes de caractères et retourne une map où les clés sont les chaînes elles-mêmes 
     * et les valeurs sont leur longueur.
     */
    @Test
    public void testCollectToMap() {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");
        Map<String, Integer> expected = Map.of(
                "apple", 5,
                "banana", 6,
                "kiwi", 4
        );

        Map<String, Integer> result = Main.collectToMap(list);

        assertEquals(expected, result);
    }

    /**
     * Test de la méthode `findLongestString`.
     * Énoncé : Écrire une méthode qui prend une liste de chaînes de caractères et retourne la chaîne la plus longue.
     */
    @Test
    public void testFindLongestString() {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "orange");
        String expected = "banana";

        String result = Main.findLongestString(list);

        assertEquals(expected, result);
    }

    /**
     * Test de la méthode `concatenateStrings`.
     * Énoncé : Écrire une méthode qui prend une liste de chaînes de caractères et retourne une seule chaîne concaténant toutes les chaînes de la liste.
     */
    @Test
    public void testConcatenateStrings() {
        List<String> list = Arrays.asList("Hello", " ", "world", "!");
        String expected = "Hello world!";

        String result = Main.concatenateStrings(list);

        assertEquals(expected, result);
    }

    /**
     * Test de la méthode `composeFunctions`.
     * Énoncé : Écrire une méthode qui prend deux fonctions (une pour doubler et une pour ajouter 3) et retourne une nouvelle fonction qui double puis ajoute 3 à un entier donné.
     */
    @Test
    public void testComposeFunctions() {
        Function<Integer, Integer> doubleFunction = n -> n * 2;
        Function<Integer, Integer> addThreeFunction = n -> n + 3;

        Function<Integer, Integer> composedFunction = Main.composeFunctions(doubleFunction, addThreeFunction);

        int result1 = composedFunction.apply(5);
        int result2 = composedFunction.apply(10);

        assertEquals(13, result1);
        assertEquals(23, result2);
    }

    /**
     * Test de la méthode `optionalOperations`.
     * Énoncé : Écrire une méthode qui prend un optional contenant un entier et retourne une chaîne "Even" si l'entier est pair, sinon "Odd".
     */
    @Test
    public void testOptionalOperations() {
        Optional<Integer> evenNumber = Optional.of(4);
        Optional<Integer> oddNumber = Optional.of(7);

        String result1 = Main.optionalOperations(evenNumber);
        String result2 = Main.optionalOperations(oddNumber);

        assertEquals("Even", result1);
        assertEquals("Odd", result2);
    }


}
