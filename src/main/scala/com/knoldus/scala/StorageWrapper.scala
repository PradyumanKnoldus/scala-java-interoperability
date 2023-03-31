package com.knoldus.scala

import com.knoldus.java.Storage

class StorageWrapper extends StorageTrait {

  private val storage = new Storage()

  // implement the addElement method of the StorageTrait interface using the addElement method of the Storage class
  def addElement(element: Any): Unit = storage.addElement(element)

  // implement the removeElement method of the StorageTrait interface using the removeElement method of the Storage class
  def removeElement(element: Any): Unit = storage.removeElement(element)

  // implement the removeAll method of the StorageTrait interface using the removeAll method of the Storage class
  def removeAll(): Unit = storage.removeAll()

  // implement the checkIfContains method of the StorageTrait interface using the checkIfContains method of the Storage class
  def checkIfContains(element: Any): Boolean = storage.checkIfContains(element)

}
