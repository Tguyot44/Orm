import model.Channel;
import model.Message;
import model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChannelDaoTest {

    @Test
    public void insertChannel(){
        Channel c = new Channel();
        List<Message> messages = new ArrayList<Message>();
        c.setMessages(messages);
        c.setPrivacyEnabled(false);
        List<User> users = new ArrayList<User>();
        c.setUsers(users);
        c.setName("bob");

        //long channelId = new
    }

}
