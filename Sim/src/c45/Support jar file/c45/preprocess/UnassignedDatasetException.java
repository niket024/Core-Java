package c45.preprocess;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brindha
 */
public class UnassignedDatasetException extends RuntimeException {
     /**
   * Creates a new UnassignedDatasetException with no message.
   *
   */
  public UnassignedDatasetException() {

    super();
  }

  /**
   * Creates a new UnassignedDatasetException.
   *
   * @param message the reason for raising an exception.
   */
  public UnassignedDatasetException(String message) {

    super(message);
  }

}
