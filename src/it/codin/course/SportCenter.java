package it.codin.course;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import it.codin.course.model.Customer;
import it.codin.course.model.Field;
import it.codin.course.model.Reservation;

public class SportCenter {
	public static void main(String args[]) {
		System.out.println("benvenuto al centro sportivo Codin");
		
		//creare una lista di campi da gioco
		List<Field> fields = new ArrayList<>();
		fields.add(new Field("Campo - Est", Field.ERBA));
		fields.add(new Field("Campo - Nord", Field.SINTETICO));
		fields.add(new Field("Campo - Sud", Field.TERRA));
		fields.add(new Field("Campo - Ovest", Field.SABBIA));
		
		//stampare la lista dei campi da gioco
		System.out.println();
		System.out.println("campi disponibili:");
		for (Field f: fields) {
			System.out.printf("%s\n", f);
		}	
	
		//creare una lista di utenti
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Alessandro", "Mancini", "alem1979@gmail.com"));
		customers.add(new Customer("Cinzia", "Bocconotti", "c.bocconotti@gmail.com"));
		
		//stampare la lista degli utenti
		System.out.println();
		System.out.println("utenti registrati:");
		for (Customer c: customers) {
			System.out.printf("%s\n", c);
		}	
		
		//creare una lista di prenotazioni
		List<Reservation> reservations = new ArrayList<>();

		Customer c = customers.get(0);
		Field f = fields.get(2);
		LocalDateTime startEvent = LocalDateTime.of(2017, 12, 25, 20, 00);
		LocalDateTime endEvent = LocalDateTime.of(2017, 12, 25, 21, 30);
		Reservation reservation = new Reservation(c, f, startEvent, endEvent);		
		reservation.setEndEventDate(LocalDateTime.of(2017, 12, 25, 22, 00));	
		
		reservations.add(reservation);
		
		//stampare la lista delle prenotazioni
		System.out.println();
		System.out.println("lista delle prenotazioni:");
		for (Reservation r: reservations) {
			System.out.printf("%s\n", r);
		}	

		//TODO:
		//aggiungi un'altra prenotazione
		//cancella la prima prenotazione
		//modifica il campo da gioco dell'ultima prenotazione
		//ristampa la lista aggiornata delle prenotazioni
		//varie ed eventuali...
	}
}
