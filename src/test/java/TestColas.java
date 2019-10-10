import java.util.List;

public class TestColas{

    @Before
    public void SetUp () {
        Queue <String> l = new QueueImpl<String>(10);


        Queue <Integer> l2 = new QueueImpl<Integer>(4);


    }
    @Test
    public void TestPush() {
        
    }

    @Test(expected = QueueFullException.class)
    public void testCuaPlena() throws QueueFullException {
       Queue<Integer> qi = new QueueImpl<Integer>(2);
       qi.push(2);
       qi.push(3);
       qi.push(4);
    }

}
