package holmos.dbtest.database.datasetloadstrategy;

import holmos.dbtest.database.connecion.HolmosDataBaseConnection;
import holmos.webtest.exceptions.HolmosFailedError;

import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
/**只将DataSet里的记录插入,有可能违反主键约束
 * @author 吴银龙(15857164387)
 * */
public class HolmosInsertLoadStrategy implements HolmosDataSetLoadStrategy{

	public void excute(HolmosDataBaseConnection conn, IDataSet dataset) {
		try {
			DatabaseOperation.INSERT.execute(conn, dataset);
		} catch (DatabaseUnitException e) {
			throw new HolmosFailedError("CLEAN_INSERT执行异常");
		} catch (SQLException e) {
			throw new HolmosFailedError("CLEAN_INSERT执行异常");
		}
	}

}
