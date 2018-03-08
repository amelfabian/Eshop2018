package model.beans;

public class orderLine {

		int idOrderLine;
		int refOrder;
		int refProduct;
		int quantity;
		Double priceLine;
		public int getIdOrderLine() {
			return idOrderLine;
		}
		public void setIdOrderLine(int idOrderLine) {
			this.idOrderLine = idOrderLine;
		}
		public int getRefOrder() {
			return refOrder;
		}
		public void setRefOrder(int refOrder) {
			this.refOrder = refOrder;
		}
		public int getRefProduct() {
			return refProduct;
		}
		public void setRefProduct(int refProduct) {
			this.refProduct = refProduct;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Double getPriceLine() {
			return priceLine;
		}
		public void setPriceLine(Double priceLine) {
			this.priceLine = priceLine;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idOrderLine;
			result = prime * result + ((priceLine == null) ? 0 : priceLine.hashCode());
			result = prime * result + quantity;
			result = prime * result + refOrder;
			result = prime * result + refProduct;
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
			orderLine other = (orderLine) obj;
			if (idOrderLine != other.idOrderLine)
				return false;
			if (priceLine == null) {
				if (other.priceLine != null)
					return false;
			} else if (!priceLine.equals(other.priceLine))
				return false;
			if (quantity != other.quantity)
				return false;
			if (refOrder != other.refOrder)
				return false;
			if (refProduct != other.refProduct)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "orderLine [idOrderLine=" + idOrderLine + ", refOrder=" + refOrder + ", refProduct=" + refProduct
					+ ", quantity=" + quantity + ", priceLine=" + priceLine + "]";
		}
		
	
}
