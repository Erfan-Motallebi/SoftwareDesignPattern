package principles.IoC;

public class DataFactory {

	public static IDataAccess getDataAccess() {
		return new DataAccess();
	}
}
