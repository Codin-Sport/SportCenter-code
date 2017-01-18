package it.codin.course.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reservation {
	private final String id;
	private final Customer customer;
	private Field field;
	private final LocalDateTime createReservationDate;
	private LocalDateTime updateReservationDate;
	private LocalDateTime startEventDate;
	private LocalDateTime endEventDate;
	private final List<String> notes;
	
	public Reservation(Customer customer, Field field, LocalDateTime startEventDate, LocalDateTime endEventDate) {
		super();
	
		this.id = UUID.randomUUID().toString();
		this.customer = customer;
		this.field = field;
		this.createReservationDate = LocalDateTime.now();
		this.updateReservationDate = LocalDateTime.now();
		this.startEventDate = startEventDate;
		this.endEventDate = endEventDate;
		this.notes = new ArrayList<>();
	}

	public void setField(Field field) {
		this.notes.add(String.format("aggiorato campo da %s a %s",  this.field, field));
		
		this.updateReservationDate = LocalDateTime.now();
		this.field = field;
	}
	
	public LocalDateTime getUpdateReservationDate() {
		return updateReservationDate;
	}

	public void setUpdateReservationDate(LocalDateTime updateReservationDate) {
		this.updateReservationDate = updateReservationDate;
	}

	public LocalDateTime getStartEventDate() {
		return startEventDate;
	}

	public void setStartEventDate(LocalDateTime startEventDate) {
		this.notes.add(String.format("aggiorato data di inizio da %s a %s",  this.startEventDate, startEventDate));

		this.updateReservationDate = LocalDateTime.now();
		this.startEventDate = startEventDate;
	}

	public LocalDateTime getEndEventDate() {
		return endEventDate;
	}

	public void setEndEventDate(LocalDateTime endEventDate) {
		this.notes.add(String.format("aggiorato data di fine da %s a %s",  this.endEventDate, endEventDate));

		this.updateReservationDate = LocalDateTime.now();
		this.endEventDate = endEventDate;
	}

	public List<String> getNotes() {
		return notes;
	}

	public String getLastNote() {
		return notes.get(notes.size() - 1); //TODO to check
	}
	
	public void addNote(String note) {
		this.notes.add(note);
	}

	public String getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Field getField() {
		return field;
	}

	public LocalDateTime getCreateReservationDate() {
		return createReservationDate;
	}
	
	public String toString() {
		return String.format("[%s] ha prenotato il campo [%s]:\n\tda %s\n\ta %s\n\t%s", this.customer, this.field, this.startEventDate, this.endEventDate, this.notes);
	}
}
