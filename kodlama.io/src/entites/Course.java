package entites;

public class Course {

	    private int id;
		private String category;
		private String name;
		private double fiyat;
		
		
		public Course(){
			
			
		}
		public Course(int id,String category,String name,double fiyat) {
			this.id=id;
			this.category=category;
			this.name=name;
			this.fiyat=fiyat;
			
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public double getFiyat() {
			return fiyat;
		}
		public void setFiyat(double fiyat) {
			this.fiyat = fiyat;
		}
		
}
