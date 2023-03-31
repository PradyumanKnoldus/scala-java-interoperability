package com.knoldus.scala

// Trait that can be implemented by other classes to provide a storage functionality.
trait StorageTrait {

  def addElement(element: Any): Unit
  def removeElement(element: Any): Unit
  def removeAll(): Unit
  def checkIfContains(element: Any): Boolean
}
