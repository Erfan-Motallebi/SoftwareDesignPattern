package pattern;

// Method I - Lazy Instantiation

//public class DBSingleton {
//
//		private static IDataAccess _dbSingleton;
//		
//		private DBSingleton() {
//			// TODO Auto-generated constructor stub
//		}
//		
//		public static IDataAccess getDBInstance() {
//			if(_dbSingleton == null) {
//				return new DataAccess();
//			} else {
//				return _dbSingleton;
//			}
//		}
//}

// Method II - Synchronization in Java [ Thread-safe Approach I ]

//public class DBSingleton {
//	private static IDataAccess _dbSingleton;
//
//	private DBSingleton() {
//		// TODO Auto-generated constructor stub
//	}
//
////	Synchronized Method - I
////	public static synchronized IDataAccess getDBInstance() {
////		if (_dbSingleton == null) {
////			return new DataAccess();
////		}
////		return _dbSingleton;
////	}
//
////	Synchronized Block - II
////	public static IDataAccess getDBInstance() {
////		if (_dbSingleton == null) {
////			synchronized (DBSingleton.class) {
////				if (_dbSingleton == null) {
////					_dbSingleton = new DataAccess();
////				}
////			}
////		}
////		return _dbSingleton;
////
////	}
//
//}


// Method III - Eager Instantiation

//public class DBSingleton {
//	
//	private static IDataAccess _dbSingleton = new DataAccess();
//	
//	public static IDataAccess getDBInstance() {
//		if (_dbSingleton == null) {
//			return _dbSingleton;
//		}
//		return _dbSingleton;
//	}
//}


// Method IV - Volatile - Double Check Locking

public class DBSingleton {
	private static volatile IDataAccess _dbSingleton;
	
	public static IDataAccess getDBInstance() {
		if (_dbSingleton == null) {
			synchronized (DBSingleton.class) {
				if (_dbSingleton == null) {
					_dbSingleton = new DataAccess();
				}
			}
		}
		return _dbSingleton;
	}
}
