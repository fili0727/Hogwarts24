package edu.hogwarts.application;

public class DynamicArray<T> {

  private T[] objectArray;
  private int arraySize;

  public DynamicArray() {
    // This unchecked cast is necessary and safe because the array is internally used and not exposed.
    objectArray = (T[])new Object[4];
    arraySize = 0;
  }

  public void add(T obj) {
    if (arraySize == objectArray.length) {
      reSize();
    }
    objectArray[arraySize++] = obj;
  }

  public T get(int index) {
    if (index < 0 || index >= arraySize) {
      return null;
    }
    return objectArray[index];
  }

  public int size() {
    return arraySize;
  }

  public void remove() {
    if (arraySize > 0) {
      objectArray[--arraySize] = null;
    }
  }

  public void remove(int index) {
    if (index < 0 || index >= arraySize) {
      return;
    }
    System.arraycopy(
            objectArray,
            index + 1,
            objectArray,
            index,
            arraySize - index - 1
    );
    objectArray[--arraySize] = null;
  }

  public void set(int index, T obj) {
    if (index >= 0 && index < arraySize) {
      objectArray[index] = obj;
    }
  }

  public void clear() {
    for (int i = 0; i < arraySize; i++) {
      objectArray[i] = null;
    }
    arraySize = 0;
  }

  private void reSize() {
    T[] newObjectArray = (T[]) new Object[objectArray.length * 2];
    System.arraycopy(objectArray, 0, newObjectArray, 0, arraySize);
    objectArray = newObjectArray;
  }
}
