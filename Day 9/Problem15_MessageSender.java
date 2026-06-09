interface MessageSender{ void sendMessage(String msg); }
class WhatsAppSender implements MessageSender{
    public void sendMessage(String msg){ System.out.println("WhatsApp: "+msg); }
}
class EmailSender implements MessageSender{
    public void sendMessage(String msg){ System.out.println("Email: "+msg); }
}
class TelegramSender implements MessageSender{
    public void sendMessage(String msg){ System.out.println("Telegram: "+msg); }
}
public class Problem15_MessageSender{
    public static void main(String[] args){
        MessageSender[] s={new WhatsAppSender(),new EmailSender(),new TelegramSender()};
        for(MessageSender x:s) x.sendMessage("Hello");
    }
}