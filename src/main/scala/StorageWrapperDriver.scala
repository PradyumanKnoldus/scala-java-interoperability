import com.knoldus.scala.StorageWrapper

object StorageWrapperDriver extends App {
  private val storageWrapper = new StorageWrapper()

  // Add an element to storage
  storageWrapper.addElement("Sentence")
  storageWrapper.addElement(741)

  // Check if storage contains an element
  private val containsSentence = storageWrapper.checkIfContains("Sentence")
  println(s"Contains Sentence: $containsSentence")

  // Remove an element from storage
  storageWrapper.removeElement("Sentence")

  // Check if storage contains an element
  private val containsSentenceAfterRemoval = storageWrapper.checkIfContains("Sentence")
  println(s"Contains Sentence after removal: $containsSentenceAfterRemoval")

  // Remove all elements from storage
  storageWrapper.removeAll()

  // Check if storage is empty
  private val isContainsAnything = storageWrapper.checkIfContains(741)
  println(s"Is it contains anything: $isContainsAnything")
}

