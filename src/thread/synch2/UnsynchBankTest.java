package thread.unsynch;

/**
 * @author Yuan Zhibo
 * @ClassName UnsynchBankTest.java
 * @Description TODO
 * @createTime 2020年03月23日 16:19:00
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE );
        for(int i = 0; i<NACCOUNTS; i++){
            int fromAccount = i;
            Runnable runnable = () ->{
              try {
                  while (true){
                      int toAccount = (int)(bank.size()*Math.random());
                      double amount = MAX_AMOUNT * Math.random();
                      bank.transfer(fromAccount, toAccount, amount);
                      Thread.sleep((long) ((long) DELAY*Math.random()));
                  }
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
