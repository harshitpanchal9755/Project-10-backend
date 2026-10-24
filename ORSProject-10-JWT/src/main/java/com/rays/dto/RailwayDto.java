package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "railway")
public class RailwayDto extends BaseDTO {
	
	private String passengerName;
	private String trainNumber;
	private String seatNumber;
	private double ticketPrice;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String getValue() {
		return "passengerName";
	}

	@Override
	public String getUniqueKey() {
		return "passengerName";
	}

	@Override
	public String getUniqueValue() {
		return "passengerName";
	}

	@Override
	public String getLabel() {
		return "railway";
	}

	@Override
	public String getTableName() {
		return "railway";
	}

}
