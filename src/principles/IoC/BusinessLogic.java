package principles.IoC;

public class BusinessLogic implements IBusinessLogic {

	private IDataAccess dataAccess;

//	public BusinessLogic() {
//		Concrete of dependent object creation
//		dataAccess = new DataAccess();
//		dataAccess = DataFactory.getDataAccess();

//	}

//		DI Pattern - Approach I -> Constructor Injection
//	public BusinessLogic(IDataAccess dataAccess) {
//		this.dataAccess = dataAccess;
//	}

//		DI Pattern - Approach II -> Property Injection
	public BusinessLogic() {
//		this.dataAccess = dataAccess;
	}

//		DI Pattern - Approach II -> Property Injection
//	public void setDataAccess(IDataAccess dataAccess) {
//			this.dataAccess = dataAccess;
//		}

	public int getCustomerId(int customerId) {
		return dataAccess.getCustomerId(customerId);
	}

//		DI Pattern - Approach III -> Method Injection

	@Override
	public void setDependency(IDataAccess dataAccess) {

		this.dataAccess = dataAccess;
	}

}

/*
 * 1. new keyword - creation of the object of DataAccess class 2.
 * add/rename/remove methods of DataAccess Class 3. Dependent Object Creation [
 * Concrete mode of DataAccess Class [ TDD ] - can't mock the DataAccess API 4.
 * change the Database Access [ Different DBMS / RDBMS ]
 */