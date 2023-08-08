
public class TransactionException extends Exception{

    String errorMessage, errorCode;

    public TransactionException(String errorMessage, String errorCode){
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
    public String getErrorCode(){
        return errorCode;
    }
}
