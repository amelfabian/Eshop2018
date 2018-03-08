package model.beans;

import java.sql.Date;

public class OrderCust {
	
	int idOrder;
	Date dateOrder;
	Double totalAmount;
	Double deliveryCost;
	Date deliveryDate;
	Date paymentDate;
	int refCustomer;
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getDeliveryCost() {
		return deliveryCost;
	}
	public void setDeliveryCost(Double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getRefCustomer() {
		return refCustomer;
	}
	public void setRefCustomer(int refCustomer) {
		this.refCustomer = refCustomer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOrder == null) ? 0 : dateOrder.hashCode());
		result = prime * result + ((deliveryCost == null) ? 0 : deliveryCost.hashCode());
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + idOrder;
		result = prime * result + ((paymentDate == null) ? 0 : paymentDate.hashCode());
		result = prime * result + refCustomer;
		result = prime * result + ((totalAmount == null) ? 0 : totalAmount.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderCust other = (OrderCust) obj;
		if (dateOrder == null) {
			if (other.dateOrder != null)
				return false;
		} else if (!dateOrder.equals(other.dateOrder))
			return false;
		if (deliveryCost == null) {
			if (other.deliveryCost != null)
				return false;
		} else if (!deliveryCost.equals(other.deliveryCost))
			return false;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (idOrder != other.idOrder)
			return false;
		if (paymentDate == null) {
			if (other.paymentDate != null)
				return false;
		} else if (!paymentDate.equals(other.paymentDate))
			return false;
		if (refCustomer != other.refCustomer)
			return false;
		if (totalAmount == null) {
			if (other.totalAmount != null)
				return false;
		} else if (!totalAmount.equals(other.totalAmount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderCust [idOrder=" + idOrder + ", dateOrder=" + dateOrder + ", totalAmount=" + totalAmount
				+ ", deliveryCost=" + deliveryCost + ", deliveryDate=" + deliveryDate + ", paymentDate=" + paymentDate
				+ ", refCustomer=" + refCustomer + "]";
	}
	
	
}
