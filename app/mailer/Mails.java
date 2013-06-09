package mailer;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import play.data.validation.Required;
import play.mvc.Mailer;

public class Mails extends Mailer {
	
	public static void welcome(models.Commande user, int valeur) throws EmailException {
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setAuthentication("csid2013c@gmail.com", "testeur1");
		email.setSSL(true);
		email.setDebug(true);
		email.setSubject("Commande "+user.modelProd);
		email.addTo("vik93150@gmail.com", user.getNomCli());
		email.setFrom("noreply@telephone.com", "Administrateur");
		email.setMsg("Bonjour, votre commande a bien été validée. Pour confirmer votre commande, veuillez cliquer sur le lien suivant : http://localhost:9000/Application/validerId/"+valeur);
		email.send();
	   }
	
	public static void verif(@Required String Id)
	{
		
		System.out.println("VALEUR = "+Id);	

	
	}

}
