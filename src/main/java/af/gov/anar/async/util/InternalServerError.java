
package af.gov.anar.async.util;

@SuppressWarnings("WeakerAccess")
public class InternalServerError extends RuntimeException {

  InternalServerError(final String reason) {
    super(reason);
  }
}
