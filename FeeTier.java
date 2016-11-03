/**
 * 
 */
package com.bnymellon.wmservice;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author xbbl3c2
 *
 */
public class FeeTier implements Serializable {
	
	@JsonProperty("rateType")
	String rateType;	
	@JsonProperty("min")
	double min;
	@JsonProperty("max")
	double max;
	@JsonProperty("rateValue")
	double rateValue;
	
	
	
	@JsonProperty("rateType")
	public String getRateType() {
		return rateType;
	}
	@JsonProperty("rateType")
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	@JsonProperty("min")
	public double getMin() {
		return min;
	}
	@JsonProperty("min")
	public void setMin(double min) {
		this.min = min;
	}
	@JsonProperty("max")
	public double getMax() {
		return max;
	}

	@JsonProperty("max")
	public void setMax(double max) {
		this.max = max;
	}
	@JsonProperty("rateValue")
	public double getRateValue() {
		return rateValue;
	}
	@JsonProperty("rateValue")
	public void setRateValue(double rateValue) {
		this.rateValue = rateValue;
	}

	public FeeTier(String rateType, double min, double max, double rateValue) {
		this.rateType= rateType;
		this.min=min;
		this.max=max;
		this.rateValue=rateValue;		
	}
	

	/**
	 * 
	 */
	public FeeTier() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
