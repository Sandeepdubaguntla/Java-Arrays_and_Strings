package arrayspackage;

public class StoreObjects_InAnArray {
		String name,id,role;
		double sal;
		int exp;
		public StoreObjects_InAnArray(String name, String id, String role, double sal, int exp) {
			super();
			this.name = name;
			this.id = id;
			this.role = role;
			this.sal = sal;
			this.exp = exp;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", role=" + role + ", sal=" + sal + ", exp="
					+ exp + "]";
		}
		
		public static void main(String[] args) {
			StoreObjects_InAnArray emp[] = new StoreObjects_InAnArray[3];
			emp[0] = new StoreObjects_InAnArray("Sandeep", "Goog123", "SDE", 200000, 2);
			emp[1] = new StoreObjects_InAnArray("RajKumar", "AMAZ123", "SDE",150000, 2);
			emp[2] = new StoreObjects_InAnArray("Shayam", "FLK123", "SDE", 100000, 1);
			
			for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i]);
			}
		}
}

	

