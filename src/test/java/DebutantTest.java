import org.junit.jupiter.api.Test;

import com.tiktok.debutant.ArrayMinUtil;
import com.tiktok.debutant.ArraySumUtil;
import com.tiktok.debutant.ArrayUtil;
import com.tiktok.debutant.ListMergeUtil;
import com.tiktok.debutant.ListUtil;
import com.tiktok.debutant.MathUtil;
import com.tiktok.debutant.PalindromeUtil;
import com.tiktok.debutant.PrimeUtil;
import com.tiktok.debutant.StringUtil;
import com.tiktok.debutant.VowelUtil;
import com.tiktok.debutant.WordCountUtil;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebutantTest {
    /* Écrivez une méthode qui prend une chaîne de caractères en entrée et retourne la chaîne inversée. */
    @Test
    public void testReverseString() {
        assertEquals("cba", StringUtil.reverseString("abc"), "La chaîne inversée de 'abc' doit être 'cba'");
        assertEquals("edcba", StringUtil.reverseString("abcde"), "La chaîne inversée de 'abcde' doit être 'edcba'");
        assertEquals("", StringUtil.reverseString(""), "La chaîne inversée de '' doit être ''");
        assertEquals("a", StringUtil.reverseString("a"), "La chaîne inversée de 'a' doit être 'a'");
    }
    /* Écrivez une méthode qui prend un tableau d'entiers et retourne le plus grand nombre. */
    @Test
    public void testFindMax() {
        assertEquals(5, ArrayUtil.findMax(new int[]{1, 2, 3, 4, 5}), "Le maximum de {1, 2, 3, 4, 5} doit être 5");
        assertEquals(10, ArrayUtil.findMax(new int[]{10, 9, 8, 7}), "Le maximum de {10, 9, 8, 7} doit être 10");
        assertEquals(-1, ArrayUtil.findMax(new int[]{-5, -10, -1, -7}), "Le maximum de {-5, -10, -1, -7} doit être -1");
    }
    /* Écrivez une méthode qui prend une chaîne de caractères et retourne true si
     la chaîne est un palindrome (se lit de la même manière de gauche à droite et de droite à gauche), sinon retourne false. */
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeUtil.isPalindrome("madam"), "La chaîne 'madame' doit être un palindrome");
        assertTrue(PalindromeUtil.isPalindrome("racecar"), "La chaîne 'racecar' doit être un palindrome");
        assertFalse(PalindromeUtil.isPalindrome("hello"), "La chaîne 'hello' ne doit pas être un palindrome");
        assertTrue(PalindromeUtil.isPalindrome(""), "La chaîne vide doit être un palindrome");
    }
    /* Écrivez une méthode qui prend un entier non négatif et retourne sa factorielle. */
    @Test
    public void testFactorial() {
        assertEquals(1, MathUtil.factorial(0), "La factorielle de 0 doit être 1");
        assertEquals(1, MathUtil.factorial(1), "La factorielle de 1 doit être 1");
        assertEquals(120, MathUtil.factorial(5), "La factorielle de 5 doit être 120");
        assertEquals(3628800, MathUtil.factorial(10), "La factorielle de 10 doit être 3628800");
    }
    /* Écrivez une méthode qui prend une chaîne de caractères et retourne le nombre de voyelles dans la chaîne. */
    @Test
    public void testCountVowels() {
        assertEquals(3, VowelUtil.countVowels("hello world"), "Il doit y avoir 3 voyelles dans 'hello world'");
        assertEquals(5, VowelUtil.countVowels("AEIOU"), "Il doit y avoir 5 voyelles dans 'AEIOU'");
        assertEquals(0, VowelUtil.countVowels("bcdfgh"), "Il ne doit y avoir aucune voyelle dans 'bcdfgh'");
        assertEquals(0, VowelUtil.countVowels(""), "Il ne doit y avoir aucune voyelle dans une chaîne vide");
    }
    /* Écrivez une méthode qui prend une liste d'entiers et retourne une liste des éléments dupliqués. */
    @Test
    public void testFindDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, ListUtil.findDuplicates(numbers), "Les duplicatas dans {1, 2, 3, 4, 2, 5, 3, 6} doivent être {2, 3}");
        numbers = Arrays.asList(1, 2, 3, 4, 5);
        expected = new ArrayList<>();
        assertEquals(expected, ListUtil.findDuplicates(numbers), "Il ne doit y avoir aucun duplicata dans {1, 2, 3, 4, 5}");
    }
    /* Écrivez une méthode qui prend un tableau d'entiers et retourne la somme de tous les éléments. */
    @Test
    public void testSumArray() {
        assertEquals(15, ArraySumUtil.sumArray(new int[]{1, 2, 3, 4, 5}), "La somme de {1, 2, 3, 4, 5} doit être 15");
        assertEquals(0, ArraySumUtil.sumArray(new int[]{0, 0, 0}), "La somme de {0, 0, 0} doit être 0");
        assertEquals(-10, ArraySumUtil.sumArray(new int[]{-5, -3, -2}), "La somme de {-5, -3, -2} doit être -10");
    }
    /* Écrivez une méthode qui prend un tableau d'entiers et retourne le plus petit élément. */
    @Test
    public void testFindMin() {
        assertEquals(1, ArrayMinUtil.findMin(new int[]{1, 2, 3, 4, 5}), "Le minimum de {1, 2, 3, 4, 5} doit être 1");
        assertEquals(-10, ArrayMinUtil.findMin(new int[]{-10, -9, 0, 1}), "Le minimum de {-10, -9, 0, 1} doit être -10");
        assertEquals(2, ArrayMinUtil.findMin(new int[]{2, 2, 2, 2}), "Le minimum de {2, 2, 2, 2} doit être 2");
    }

    /* Écrivez une méthode qui prend une chaîne de caractères et retourne le nombre de mots. Un mot est défini comme une séquence de caractères non vides séparés par des espaces. */
    @Test
    public void testCountWords() {
        assertEquals(2, WordCountUtil.countWords("hello world"), "La chaîne 'hello world' doit contenir 2 mots");
        assertEquals(5, WordCountUtil.countWords("this is a test string"), "La chaîne 'this is a test string' doit contenir 5 mots");
        assertEquals(0, WordCountUtil.countWords(""), "La chaîne vide doit contenir 0 mot");
        assertEquals(1, WordCountUtil.countWords("word"), "La chaîne 'word' doit contenir 1 mot");
    }

    /* Écrivez une méthode qui prend un entier et retourne true s'il est un nombre premier, sinon retourne false. */
    @Test
    public void testIsPrime() {
        assertTrue(PrimeUtil.isPrime(5), "5 doit être un nombre premier");
        assertFalse(PrimeUtil.isPrime(4), "4 ne doit pas être un nombre premier");
        assertTrue(PrimeUtil.isPrime(13), "13 doit être un nombre premier");
        assertFalse(PrimeUtil.isPrime(1), "1 ne doit pas être un nombre premier");
        assertFalse(PrimeUtil.isPrime(0), "0 ne doit pas être un nombre premier");
    }

    /* Écrivez une méthode qui prend deux listes triées d'entiers et retourne une nouvelle liste contenant tous les éléments des deux listes, également triée. */
    @Test
    public void testMergeSortedLists() {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, ListMergeUtil.mergeSortedLists(list1, list2), "Les listes {1, 3, 5} et {2, 4, 6} doivent fusionner en {1, 2, 3, 4, 5, 6}");
        
        list1 = Arrays.asList(1, 2, 3);
        list2 = Arrays.asList(4, 5, 6);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, ListMergeUtil.mergeSortedLists(list1, list2), "Les listes {1, 2, 3} et {4, 5, 6} doivent fusionner en {1, 2, 3, 4, 5, 6}");
    }
}
