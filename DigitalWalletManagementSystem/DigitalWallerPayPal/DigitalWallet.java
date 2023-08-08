
public class DigitalWallet extends Exception{
    String walletId, userName, userAccessCode;
    int walletBalance;
    public DigitalWallet(String walletId, String userName){
        this.userName = userName;
        this.walletId = walletId;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode){
        super();
        this.userAccessCode = userAccessCode;
    }

    public String getWalletId(){
        return walletId;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserAccessToken(){
        return userAccessCode;
    }

    public int getWalletBalance(){
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance){
        this.walletBalance = walletBalance;
    }

    public String getUsername() {
        return userName;
    }


}
