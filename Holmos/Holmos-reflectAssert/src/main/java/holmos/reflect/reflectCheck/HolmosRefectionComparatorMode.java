package holmos.reflect.reflectCheck;

import holmos.reflect.reflectCheck.comparator.HolmosDateComparator;
import holmos.reflect.reflectCheck.comparator.HolmosIgnoreDefaultComparator;

/**宽松式反射比较器的类别
 * @author 吴银龙(15857164387)
 * */
public enum HolmosRefectionComparatorMode {
	/**{@link HolmosIgnoreDefaultComparator}}*/
	IGNORE_DEFAULT,
	/**{@link HolmosDateComparator}}*/
	DATE,
	/**{@link HolmosIgnoreOrderCollectionOperator}}*/
	IGNORE_COLLECTION_ORDER;
}
