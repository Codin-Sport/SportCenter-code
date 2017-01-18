package it.codin.course.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Field {
	public static final int TERRA = 0;
	public static final int ERBA = 1;
	public static final int SINTETICO = 2;
	public static final int SABBIA = 3;
	
	private final String id;
	private final String name;	
	private final List<String> sports;
	private final List<Character> lockerRooms;
	private final int type;
		    
	public Field(String name, int type) {
		super();
		
			this.id = UUID.randomUUID().toString();
			this.name = name;
			this.type = type;
			this.sports = new ArrayList<>();
			this.lockerRooms = new ArrayList<>();

	}
	

	public String getId() {		
		return this.id;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getSports() {
		return sports;
	}

	public String getSport(int idx) {
		return sports.get(idx);
	}
	
	public List<Character> getLockerRooms() {
		return lockerRooms;
	}
	
	public Character getLockerRoom(int idx) {
		return lockerRooms.get(idx);
	}
	
	public int getType() {
		return type;
	}
	
	public void addSport(String sport) {
		this.sports.add(sport);
	}
	
	public void addLockerRoom(Character lockerRoom) {
		this.lockerRooms.add(lockerRoom);
	}

	//TODO implementare la toString per tutte e due le classi di model
	@Override
	public String toString() {
		return this.name;
	}
}
