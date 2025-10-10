import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarEmail {

    public static void enviar(String mensagem) {
        String to = "moreiraconegundesangelica@gmail.com";
        String from = "moreiraconegundesangelica@gmail.com";
        String password = "knhackqhchvarcwe"; // DICA: Coloque essas infos em variável de ambiente ou arquivo externo em
                                              // sistemas reais!

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Informação de Login");
            message.setText(mensagem);

            Transport.send(message);
            System.out.println("Email enviado.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
