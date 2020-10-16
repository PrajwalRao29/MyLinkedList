import com.cg.mylinkedlist.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMyLinkedList {
    MyLinkedList l = new MyLinkedList();

    @Test
    public void test1SearchValid() {
        l.addToEnd(56);
        l.addToEnd(30);
        l.addToEnd(70);
        Assert.assertTrue(l.search(56));
    }

    @Test
    public void test2SearchInValid() {
        l.addToEnd(56);
        l.addToEnd(30);
        l.addToEnd(70);
        Assert.assertFalse(l.search(90));
    }

    @Test
    public void test3AddAfterElement() {
        l.addToEnd(56);
        l.addToEnd(30);
        l.addAfter(30, 40);
        l.addToEnd(70);
        Assert.assertTrue(l.search(40));
    }
    @Test
    public void test4DeleteElement() {
        l.addToEnd(56);
        l.addToEnd(30);
        l.addToEnd(40);
        l.addToEnd(70);
        l.delete(40);
        Assert.assertEquals(l.size(),3);
    }
}

