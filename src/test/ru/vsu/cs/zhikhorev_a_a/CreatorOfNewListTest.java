package test.ru.vsu.cs.zhikhorev_a_a; 

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.util.ArrayUtils;
import ru.vsu.cs.zhikhorev_a_a.CreatorOfNewList;
import ru.vsu.cs.zhikhorev_a_a.ListUtils;

import java.util.List;

public class CreatorOfNewListTest {


@Test
public void testCreateNewList1() throws Exception {
    int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput1.1.txt");
    int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput1.2.txt");
    List<Integer> list1 = ListUtils.convertArrayToList(array1);
    List<Integer> list2 = ListUtils.convertArrayToList(array2);

    int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput1.txt");

    List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
    int[] factualResultInArray = ListUtils.convertListToArray(resultList);

    Assert.assertArrayEquals(expectedResult, factualResultInArray);

}

    @Test
    public void testCreateNewList2() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput2.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput2.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput2.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList3() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput3.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput3.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput3.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList4() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput4.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput4.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput4.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList5() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput5.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput5.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput5.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList6() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput6.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput6.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput6.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList7() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput7.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput7.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput7.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList8() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput8.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput8.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput8.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList9() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput9.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput9.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput9.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }

    @Test
    public void testCreateNewList10() throws Exception {
        int[] array1 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput10.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testInput10.2.txt");
        List<Integer> list1 = ListUtils.convertArrayToList(array1);
        List<Integer> list2 = ListUtils.convertArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("C:\\Users\\Kein_\\IdeaProjects\\Task9\\src\\test\\ru\\vsu\\cs\\zhikhorev_a_a\\testOutput10.txt");

        List<Integer> resultList = CreatorOfNewList.createNewList(list1, list2);
        int[] factualResultInArray = ListUtils.convertListToArray(resultList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);

    }



} 
