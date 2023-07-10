package Mock;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class requestChaining {
	@Test
	public void test() {
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(1);
		lis.add(1);
		lis.add(2);
		lis.add(2);
		lis.add(3);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (Integer i : lis) {
			map.put(i, 1);

		}
		System.out.println(map);
		for (Integer j : map.keySet()) {
			int count = 0;
			for (Integer i : lis) {
				if (i == j) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(j);
		}
	}

}