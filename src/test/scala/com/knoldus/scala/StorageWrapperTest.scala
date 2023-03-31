package com.knoldus.scala

import org.scalatest.flatspec.AnyFlatSpec

class StorageWrapperTest extends AnyFlatSpec {

  val storage = new StorageWrapper()

  "StorageWrapper" should "add an element to the storage" in {
    storage.addElement("hello")
    assert(storage.checkIfContains("hello"))
  }

  it should "remove an element from the storage" in {
    storage.addElement("world")
    assert(storage.checkIfContains("world"))
    storage.removeElement("world")
    assert(!storage.checkIfContains("world"))
  }

  it should "remove all elements from the storage" in {
    storage.addElement("hello")
    storage.addElement("world")
    storage.removeAll()
    assert(!storage.checkIfContains("hello"))
    assert(!storage.checkIfContains("world"))
  }

  it should "check if an element is present in the storage" in {
    storage.addElement(1)
    storage.addElement(2)
    assert(storage.checkIfContains(1))
    assert(storage.checkIfContains(2))
    assert(!storage.checkIfContains(3))
  }

}
