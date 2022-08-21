package principles.IoC;

interface IDataAccess {
	int getCustomerId(int customerId);
}

interface IBusinessDependency {

	void setDependency(IDataAccess dataAccess);
}

interface IBusinessLogic extends IBusinessDependency {
	int getCustomerId(int customerId);
}