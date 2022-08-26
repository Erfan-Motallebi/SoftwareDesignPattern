package pattern;


// Method I - Lazy Instantiation

public class DBSingleton {

		private static IDataAccess _dbSingleton;
		
		private DBSingleton() {
			// TODO Auto-generated constructor stub
		}
		
		public static IDataAccess getDBInstance() {
			if(_dbSingleton == null) {
				return new DataAccess();
			} else {
				return _dbSingleton;
			}
		}
}
