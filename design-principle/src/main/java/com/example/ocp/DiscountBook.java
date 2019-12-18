package com.example.ocp;

import java.math.BigDecimal;

public class DiscountBook extends Book {
	
	public DiscountBook(String name, String desc, BigDecimal price) {
		super(name, desc, price);
	}

	private BigDecimal dicount;

	
	
	public BigDecimal getDicount() {
		return dicount;
	}

	public void setDicount(BigDecimal dicount) {
		this.dicount = dicount;
	}

	@Override
	public BigDecimal getPrice() {
		return super.getPrice().multiply(dicount);
	}

	public BigDecimal getOriPrice() {
		return super.getPrice();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dicount == null) ? 0 : dicount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscountBook other = (DiscountBook) obj;
		if (dicount == null) {
			if (other.dicount != null)
				return false;
		} else if (!dicount.equals(other.dicount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DiscountBook [dicount=" + dicount + ", toString()=" + super.toString() + "]";
	}
	
}
