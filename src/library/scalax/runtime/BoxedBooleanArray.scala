/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: BoxedByteArray.scala 17000 2009-01-29 13:05:53Z odersky $


package scalax.runtime

@serializable
final class BoxedBooleanArray(val value: Array[Boolean]) extends BoxedArray[Boolean] {

  def length: Int = value.length

  def apply(index: Int): Boolean = value(index)

  def update(index: Int, elem: Boolean) {
    value(index) = elem
  }
  def unbox(elemClass: Class[_]): AnyRef = value
}