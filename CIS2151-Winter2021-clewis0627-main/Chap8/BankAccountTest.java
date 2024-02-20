package Chap8;

import org.junit.Test;
import static org.junic.Assert.*;

public class BankAccountTest {
    public BankAccountTest() {
    }
    // @Test
    public void testContstructorAndAccountNumber() {
        // Arrange
        String expectedOwnerName = "Cameron";
        int expectedAccountNumber = 2;

        // Act
        BankAccount account = new BankAccount(expectedOwnerName);
        int actualAccountNumber = account.getAccountNumber();
        String actualOwnerName = account.getOwnerName();

        // Assert
        assertEquals(expectedAccountNumber, actualAccountNumber);
        assertEquals(expectedOwnerName, actualOwnerName);
    }
    // @Test 
    public void testWithdraw() {
        // Arrange
        double expectedBalance = 10.0;
        BankAccount account = new BankAccount("");
        account.deposit(20);

        // Act
        boolean withdrawResult = account.withdraw(10);
        double actualBalance = account.getBalance();

        // Assert
        assertTrue(withdrawResult);
        assertEquals(expectedBalance, actualBalance, .000001);
    }
    // @Test
    public void testWithdrawOverBalance() {
        // Arrange
        double expectedBalance = 10.0;
        BankAccount account = new BankAccount("");
        account.deposit(expectedBalance);

        // Act
        boolean withdrawResult = account.withdraw(20);
        double actualBalance = account.getBalance();

        // Assert
        assertFalse(withdrawResult);
        assertEquals(expectedBalance, actualBalance, .000001);
    }
    // @Test 
    public void testWithdrawNegative() {
        // Arrange
        double expectedBalance = 10.0;
        BankAccount account = new BankAccount("");
        account.deposit(expectedBalance);
        
        // Act
        boolean withdrawResult = account.withdraw(-20);
        double actualBalance = account.getBalance();

        // Assert
        assertFalse(withdrawResult);
        assertEquals(expectedBalance, actualBalance, .000001);
    }
    // @Test 
    public void testDeposit() {
        // Arrange
        double expectedBalance = 10.0;
        BankAccount account = new BankAccount("");

        // Act
        boolean depositResult = account.deposit(expectedBalance);
        double actualBalance = account.getBalance();

        // Assert
        assertTrue(depositResult);
        assertEquals(expectedBalance, actualBalance, .000001);
    }
    // @Test 
    public void testDepositNegative() {
        // Arrange
        double expectedBalance = 0.0;
        BankAccount account = new BankAccount("");

        // Act
        boolean depositResult = account.deposit(-10);
        double actualBalance = account.getBalance();

        // Assert
        assertFalse(depositResult);
        assertEquals(expectedBalance, actualBalance, .000001);
    }
}
