package com.example.demo.layer4;

import java.util.Set;

import com.example.demo.layer2.Cancelticket;
import com.example.demo.layer4.exceptions.*;


public interface CancelticketService {
	

		void addCancelticket(Cancelticket ctRef) throws TicketNumberAlreadyExistsException;  //C - add/create
		Cancelticket findCancelticket(int cancelid) throws TicketNumberNotFoundException;    //R - find/reading
		Set<Cancelticket> findCancelticket();     //R - find all/reading all
		void modifyCancelticket(Cancelticket ctRef) throws TicketNumberNotFoundException; //U - modify/update
		void removeCancelticket(int cancelid) throws TicketNumberNotFoundException; //D - remove/delete
		
		
	}


