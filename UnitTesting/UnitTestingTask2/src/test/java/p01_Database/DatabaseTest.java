package p01_Database;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import javax.xml.crypto.Data;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Database database;
    private static final Integer[] NUMBERS = {5 , 9 , 29 ,45};
    
    @Before
    public void prepareDatabase () throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }


    //Constructor Testing
    //1.връща ли правилен обект
    @Test
    public void testConstructorHasToCreateValidObject() throws OperationNotSupportedException {
        //елементите
        //брой на елементите
        assertEquals(4, database.getElements().length);
        Integer[] databaseNumbers = database.getElements();
        for (int i = 0; i < databaseNumbers.length; i++) {
            assertEquals(NUMBERS[i], databaseNumbers[i]);
        }
    }
    //2.случай елементите са над 16

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenUseMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);

    }

    //3. случай елеметите са под 1
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenUseLessThanOneElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }

    //Add method testing
    //1.подаване на null елемент
    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowExWhenParamNull() throws OperationNotSupportedException {
        database.add(null);
    }

    //2.правилна работа,добавя елемента в масива
    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {
        database.add(17);
        assertEquals(5, database.getElements().length);
        assertEquals(Integer.valueOf(17), database.getElements()[4]);
    }

    //Remove method testing
    //1.нямаме елементи
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowExWithEmptyData() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        //{} празен масив
        database.remove();
    }

    //2.дали премахва последния елемент
    @Test
    public void testRemoveLastElement() throws OperationNotSupportedException {
        database.remove();
        Integer[] elementsInDataBase = database.getElements();
        assertEquals(3, database.getElements().length);
        for (int i = 0; i < elementsInDataBase.length; i++) {
            assertEquals(elementsInDataBase[i],NUMBERS[i]);
        }
    }

}