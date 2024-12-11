package com.example.dbtestprj;

public class TestMainClass {
    /*

  import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class OrchestratorEmailServiceTest {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private OrchestratorEmailService emailService;

    public OrchestratorEmailServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSendMail() throws Exception {
        // Mock de MimeMessage
        MimeMessage mimeMessage = mock(MimeMessage.class);
        when(mailSender.createMimeMessage()).thenReturn(mimeMessage);

        // Création des paramètres
        OrchestratorEmailParameters emailParameters = new OrchestratorEmailParameters();
        emailParameters.setTo("test@example.com");
        emailParameters.setFrom("from@example.com");
        emailParameters.setSubject("Test Subject");

        // StringWriter pour le contenu
        StringWriter mergedContent = new StringWriter();
        mergedContent.write("Ceci est un email de test.");

        // Appel de la méthode à tester
        emailService.sendMail(emailParameters, mergedContent, 1);

        // Capture de l'email envoyé
        ArgumentCaptor<MimeMessage> messageCaptor = ArgumentCaptor.forClass(MimeMessage.class);
        verify(mailSender, times(1)).send(any(MimeMessage.class));

        // Vérifications
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        assertEquals("test@example.com", helper.getTo()[0]);
        assertEquals("from@example.com", helper.getFrom());
        assertEquals("Test Subject", helper.getSubject());
        assertEquals("Ceci est un email de test.", helper.getMimeMessage().getContent().toString());
    }
}


    * */
}
