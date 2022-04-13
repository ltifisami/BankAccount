import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    
    @Test
    public void depositCantBeNegative(){
        Account account = new Account(10);
        Assert.assertFalse(account.deposit(-1));
        
        Assert.assertEquals(10,account.getBalance(),epsilon);
    }
    @Test
    public void depositWithAddCorrectAmount(){
        Account account = new Account(10);
        
        Assert.assertTrue(account.deposit(10));
        
        Assert.assertEquals(20,account.getBalance(),epsilon);
    }
    
    @Test
    public void withdrawCantBeNegative(){
        Account account = new Account(10);
        
        Assert.assertFalse(account.withdraw(-1));
        
        Assert.assertEquals(10,account.getBalance(),epsilon);
    }
    
    @Test
    public void withdrawWithSubCorrectAmount(){
        Account account = new Account(10);
        
        Assert.assertTrue(account.deposit(10));
        
        Assert.assertTrue(account.withdraw(10));
        
        Assert.assertEquals(10,account.getBalance(),epsilon);
    }
    
    
   
    
    
    @Test
    public void getHistory(){
        Account account = new Account(10);
        
        Assert.assertTrue(account.deposit(10));
        Assert.assertEquals(1,account.getHistory().size());
        
        Assert.assertTrue(account.withdraw(10));
        
        Assert.assertEquals(2,account.getHistory().size());
        
        Assert.assertTrue(account.deposit(10));
        
        Assert.assertEquals(3,account.getHistory().size());
        
        Assert.assertEquals(10,account.getHistory().get(2).getBalance(),epsilon);
    }
} 
