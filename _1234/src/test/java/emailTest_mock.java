import org.apache.commons.mail.EmailException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;
public class emailTest_mock {


    @Test
    public void prepare() {
    }

    @Test
    public void set_email() throws EmailException {
       // email list = mock(email.class);
        /* 设置预期，当调用 get(0) 方法时返回 "111" */
       // when(list.prepare("997845792@qq.com")).thenReturn("111");

        /* 设置后返回期望的结果 */
        //System.out.println(list.get(0));
        /* 没有设置则返回 null */
       // System.out.println(list.get(1));
        email list = new email();
        //email spy = spy(list);
       // email list = spy(email.class);
        email spy = spy(list);
       spy.prepare("997845792@qq.com");
     //   System.out.println(0);
        spy.set_email("test","test1","this is test","this is test1");
      //  System.out.println(0);
        //doNothing().when(spy).send_email();
        assertEquals("test1",spy.title);
        doThrow(new RuntimeException("异常")).when(spy).send_email();
//use mock object
        //when(mockedList.prepare("99")).thenReturn();
        //verify(mockedList).send_email();

      /* doNothing().when(list).prepare("997845792@qq.com");
        System.out.println(0);
        doNothing().when(list).set_email("test","test1","this is test","this is test1");
        System.out.println(0);
        doThrow(new RuntimeException("异常")).when(list).send_email();
        System.out.println(0);888*/
       // verify(mockedList, times(1)).send_email();

      // verify(mockedList).send_email();
        //verify(mockedList, times(0)).prepare("997845792@qq.com");
    }


    @Test
    public void send_email() {
    }
}