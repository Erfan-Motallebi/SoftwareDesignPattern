package principles.IoC;

public class CustomerService {

	IBusinessLogic _bLogic;

//	 Injecting Service to the Client using Method I
//	public CustomerService() {
//		_bLogic = new BusinessLogic(new DataAccess());
//	}

//	 Injecting Service to the Client using Method II
//	public CustomerService() {
//		_bLogic = new BusinessLogic().setDataAccess(new DataAccess());
//	}

//	 Injecting Service to the Client using Method III
	public CustomerService() {
		_bLogic = new BusinessLogic();
		_bLogic.setDependency(new DataAccess());
	}

	int getCustomerId(int customerId) {
		return _bLogic.getCustomerId(customerId);
	}
}
