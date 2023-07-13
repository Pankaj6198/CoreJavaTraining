package collections;

public class Emp {

	
		// TODO Auto-generated method stub
		private int empId;
		private String name;
		private double sal;
		
		
		public Emp() {
			empId=0;
			name=" ";
			sal = 0;
				
		}


		public Emp(int empId, String name, double sal) {
			
			this.empId = empId;
			this.name = name;
			this.sal = sal;
		}


		public int getEmpId() {
			return empId;
		}


		public void setEmpId(int empId) {
			this.empId = empId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getSal() {
			return sal;
		}


		public void setSal(double sal) {
			this.sal = sal;
		}


		@Override
		public String toString() {
			return "Emp [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
		}
		
		
		
	

}
