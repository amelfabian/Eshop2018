package model.beans;

public class Product {

		int idProduct;
		Double priceProduct;
		int stockLevel;
		String brand;
		String descriptionProduct;
		int refDiscount;
		public int getIdProduct() {
			return idProduct;
		}
		public void setIdProduct(int idProduct) {
			this.idProduct = idProduct;
		}
		public Double getPriceProduct() {
			return priceProduct;
		}
		public void setPriceProduct(Double priceProduct) {
			this.priceProduct = priceProduct;
		}
		public int getStockLevel() {
			return stockLevel;
		}
		public void setStockLevel(int stockLevel) {
			this.stockLevel = stockLevel;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getDescriptionProduct() {
			return descriptionProduct;
		}
		public void setDescriptionProduct(String descriptionProduct) {
			this.descriptionProduct = descriptionProduct;
		}
		public int getRefDiscount() {
			return refDiscount;
		}
		public void setRefDiscount(int refDiscount) {
			this.refDiscount = refDiscount;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((brand == null) ? 0 : brand.hashCode());
			result = prime * result + ((descriptionProduct == null) ? 0 : descriptionProduct.hashCode());
			result = prime * result + idProduct;
			result = prime * result + ((priceProduct == null) ? 0 : priceProduct.hashCode());
			result = prime * result + refDiscount;
			result = prime * result + stockLevel;
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
			Product other = (Product) obj;
			if (brand == null) {
				if (other.brand != null)
					return false;
			} else if (!brand.equals(other.brand))
				return false;
			if (descriptionProduct == null) {
				if (other.descriptionProduct != null)
					return false;
			} else if (!descriptionProduct.equals(other.descriptionProduct))
				return false;
			if (idProduct != other.idProduct)
				return false;
			if (priceProduct == null) {
				if (other.priceProduct != null)
					return false;
			} else if (!priceProduct.equals(other.priceProduct))
				return false;
			if (refDiscount != other.refDiscount)
				return false;
			if (stockLevel != other.stockLevel)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Product [idProduct=" + idProduct + ", priceProduct=" + priceProduct + ", stockLevel=" + stockLevel
					+ ", brand=" + brand + ", descriptionProduct=" + descriptionProduct + ", refDiscount=" + refDiscount
					+ "]";
		}
		
		
}
