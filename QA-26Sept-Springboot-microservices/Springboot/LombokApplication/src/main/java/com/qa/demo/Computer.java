package com.qa.demo;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Data
@RequiredArgsConstructor

public class Computer {

	private int Id;
	private String brand;
	private String cpu;
	private int RAM;
	private float price;
	private int storage;
	private String OS;
	private String graphicCard;
	private int noofProc;
	private float weight;
	private int Size;
	@NotNull
	private float battery;
	private int noOfPorts;
	private boolean HDMI;
	private String resolution;
	private final String typeOfKeyboard="wired";


}
