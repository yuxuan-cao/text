import org.apache.commons.mail.EmailException;
import org.junit.Test;

import static org.junit.Assert.*;

public class emailTest {
   public email option=new email();
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("测试开始");

    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @org.junit.Test
    public void prepare() {
        option.prepare("997845792@qq.com");
        assertEquals("997845792@qq.com",option.mailbox_rece);
    }

    @org.junit.Test
    public void set_email() throws EmailException {
        option.prepare("997845792@qq.com");
        assertEquals("997845792@qq.com",option.mailbox_rece);
        option.set_email("test","test1","this is test","this is test1");
        assertEquals("test1",option.title);
        assertEquals("this is test1",option.content);

    }

    @Test
    public void send_email() throws EmailException{
        option.prepare("997845792@qq.com");
        assertEquals("997845792@qq.com",option.mailbox_rece);
        option.set_email("test","test1","this is test","this is test1");
        assertEquals("test1",option.title);
        assertEquals("this is test1",option.content);
        option.send_email();
    }
}