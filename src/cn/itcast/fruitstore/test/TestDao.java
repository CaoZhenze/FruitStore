package cn.itcast.fruitstore.test;
import java.util.ArrayList;
import cn.itcast.fruitstore.dao.AdminDao;
import cn.itcast.fruitstore.domain.FruitItem;
/**
 * 测试JDBC
 */
public class TestDao {
	public static void main(String[] args) {
		AdminDao ad = new AdminDao();
		System.out.println(ad.queryAllData());
		ArrayList<FruitItem> list = new ArrayList<FruitItem>();
		list = ad.queryAllData();
		for (FruitItem fruitItem : list) {
			System.out.println(fruitItem.getNumber());
			System.out.println(fruitItem.getName());
			System.out.println(fruitItem.getPrice());
			System.out.println(fruitItem.getUnit());
		}
	}

}
