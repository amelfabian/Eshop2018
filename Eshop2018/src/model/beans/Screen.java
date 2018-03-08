package model.beans;

public class Screen {

		int idScreen;
		String size;
		String definitionScreen;
		public int getIdScreen() {
			return idScreen;
		}
		public void setIdScreen(int idScreen) {
			this.idScreen = idScreen;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getDefinitionScreen() {
			return definitionScreen;
		}
		public void setDefinitionScreen(String definitionScreen) {
			this.definitionScreen = definitionScreen;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((definitionScreen == null) ? 0 : definitionScreen.hashCode());
			result = prime * result + idScreen;
			result = prime * result + ((size == null) ? 0 : size.hashCode());
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
			Screen other = (Screen) obj;
			if (definitionScreen == null) {
				if (other.definitionScreen != null)
					return false;
			} else if (!definitionScreen.equals(other.definitionScreen))
				return false;
			if (idScreen != other.idScreen)
				return false;
			if (size == null) {
				if (other.size != null)
					return false;
			} else if (!size.equals(other.size))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Screen [idScreen=" + idScreen + ", size=" + size + ", definitionScreen=" + definitionScreen + "]";
		}
		
		
}
