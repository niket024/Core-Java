/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c45.preprocess;

/**
 *
 * @author admin
 */
public class UnassignedClassException extends RuntimeException {

  /**
   * Creates a new UnassignedClassException with no message.
   *
   */
  public UnassignedClassException() {

    super();
  }

  /**
   * Creates a new UnassignedClassException.
   *
   * @param message the reason for raising an exception.
   */
  public UnassignedClassException(String message) {

    super(message);
  }
}

