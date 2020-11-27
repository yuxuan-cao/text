import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class email {
    Email email = new SimpleEmail();
    String mailbox_rece;
    String title;
    String content;
    public void prepare(String name){
        this.mailbox_rece=name;
    }
    public void set_email(String title1,String title2,String content1,String content2)throws EmailException {

        email.setHostName("smtp.163.com");
        //email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("yuxuan7419@163.com", "OTUWLQOUFMHVKFRL"));
        //email.setSSLOnConnect(true);
        email.setFrom("yuxuan7419@163.com");
        if (title1.length()<title2.length()){//将主题和内容长的作为发邮件的主题和内容T
            title=title1;
        }
        else {
            title=title2;
        }
        if (content1.length()<content2.length()){
            content=content1;
        }
        else {
            content=content2;
        }
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(this.mailbox_rece);
    }
    public void send_email()throws EmailException {
       // if (this.mailbox_rece=="997845792@qq.com")
            email.send();
    }
}
