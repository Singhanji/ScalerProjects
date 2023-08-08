
public class DigitalWalletTransaction{

    public void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        // firstly checking if user has a token. If not, user will not be able to add money
        if (digitalWallet.getUserAccessToken() == null){
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
            // if the amount is less than 0, user will not be able to add money
        } else if (amount <= 0){
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        } else {
            // if both of the above condition is false, user can add money using setWalletBalance method
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() + amount);
        }
    }

    public void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException{
        if (digitalWallet.getWalletBalance() < amount){
            throw new TransactionException("Insufficient Balance", "INSUFFICIENT_BALANCE");
        } else if (digitalWallet.getUserAccessToken() == null){
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        } else if (amount <= 0){
            throw new TransactionException("Amount should be greater than zero", "INVALID_MOUNT");
        } else {
            digitalWallet.setWalletBalance(digitalWallet.getWalletBalance() - amount);
        }
    }
}
