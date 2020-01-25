/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package c45.preprocess;

/**
 *
 * @author admin
 */
interface Copyable {
     /**
   * This method produces a shallow copy of an object.
   * It does the same as the clone() method in Object, which also produces
   * a shallow copy.
   */
  Object copy();

}
