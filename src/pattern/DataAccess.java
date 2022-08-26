package pattern;

public class DataAccess implements IDataAccess{
	
	public DataAccess() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getUserInfo(String name, int tel) {
		System.out.println("Name: " + name + " - " + "Tel: " + tel);
		
	}
}
