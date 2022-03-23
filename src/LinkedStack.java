import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>
{
  LinkedList<T> list = new LinkedList<T>();

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public void push(T elm) {
    list.addToFront(elm);
  }

  @Override
  public T pop() throws EmptyStackException {
    try{
      return list.removeFirst();
    }catch(EmptyStackException e){
      e.printStackTrace();
      throw e;
    }
  }
}
