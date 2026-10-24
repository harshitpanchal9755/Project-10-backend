package com.rays.form;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RailwayDto;

public class RailwayForm extends BaseForm{
	
	@NotEmpty(message = "PassengerName is required")
	private String passengerName;
	
	@NotEmpty(message = "TrainNumber is required")
	private String trainNumber;
	
	@NotEmpty(message = "SeatNumber is required")
	private String seatNumber;
	
	@NotNull(message = "TicketPrice is required")
	@DecimalMin(value = "0.0", message = "TicketPrice must be greater than or equal to 0.0")
	@DecimalMax(value = "10.0", message = "TicketPrice must be less than or equal to 10.0")
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
	public BaseDTO getDto() {
		
		RailwayDto dto = (RailwayDto) initDTO(new RailwayDto());
		
		dto.setId(id);
		dto.setPassengerName(passengerName);
		dto.setSeatNumber(seatNumber);
		dto.setTicketPrice(ticketPrice);
		dto.setTrainNumber(trainNumber);
		
		return dto;
	}

}
