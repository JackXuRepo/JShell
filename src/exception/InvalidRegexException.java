package exception;

/**
 * Custom Exception used when the 'curl' command is used on an Invalid URL.
 * 
 * @author Jason Chow Fong
 */
public class InvalidRegexException extends Exception {

  /**
   * Construct an Exception Object which fills in a default string message.
   */
  public InvalidRegexException() {
    super("An invalid regular expression was specified.");
  }

  /**
   * Constructs an Exception Object with a human readable message of what went
   * wrong.
   * 
   * @param message Human readable error message of what happened
   */
  public InvalidRegexException(String message) {
    super(message);
  }

  /**
   * Constructs the Exception Object, such that it can be accessed by the catch
   * statement.
   * 
   * @param cause name of Exception object to be created
   */
  public InvalidRegexException(Throwable cause) {
    super(cause);
  }

  /**
   * Constructs an Exception Object with a human readable message of what went
   * wrong, Also constructs the Exception Object, such that it can be accessed
   * by the catch statement.
   * 
   * @param message Human readable error message of what happened
   * @param cause name of Exception object to be created
   */
  public InvalidRegexException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs an Exception Object with a human readable message of what went
   * wrong. Also constructs the Exception Object, such that it can be accessed
   * by the catch statement. Also allows for choosing if the Exception will
   * allow writing to the StackTrace. Also allows for choosing if the Exception
   * can be suppressed or not. (useful in case when Exceptions are used in the
   * 'finally' block with the try-with-resources statement)
   * 
   * @param message human readable message of what happened
   * @param cause name of Exception Object to be created
   * @param enableSupression if the Exception can be suppressed
   * @param writableStackTrace if writing is allowed to the Stack Trace.
   */
  public InvalidRegexException(String message, Throwable cause,
      boolean enableSupression, boolean writableStackTrace) {
    super(message, cause, enableSupression, writableStackTrace);
  }
}
