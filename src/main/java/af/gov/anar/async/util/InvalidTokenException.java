
package af.gov.anar.async.util;


@SuppressWarnings("WeakerAccess")
public class InvalidTokenException extends RuntimeException {

  public InvalidTokenException(final String reason) {
    super(reason);
  }
}
