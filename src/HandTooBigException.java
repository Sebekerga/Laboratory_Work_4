public class HandTooBigException extends RuntimeException{
    public HandTooBigException(String errorMessage, Throwable err){
        super(errorMessage);
    }
}
