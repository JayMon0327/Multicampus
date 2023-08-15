package com.multi.weka22;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.CSVLoader;

public class WekaTitanicService {

	public String[] ml(double[] values) throws Exception {
		System.out.println("service>> " + values[0]);

		// 1. 데이터 로딩(수집)
		// Instances data = new Instances(new BufferedReader(new
		// FileReader("data/titanic2_pre.arff")));
		String path = "C:\\Users\\a\\Documents\\multi-backend\\wekaProject22";
		String file = path + "\\data\\titanic2_pre.csv";
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File(file));
		Instances data = loader.getDataSet(); // arff형식으로 변환해서 가지고 온다.

		// 1. Attribute리스트를 만들자.
		ArrayList attributes = new ArrayList();

		// 2. attributes리스트를 만들어서 Instances객체에 셋팅
		Enumeration<Attribute> attr_list = data.enumerateAttributes();

		while (attr_list.hasMoreElements()) {
			attributes.add(attr_list.nextElement());
		}
		System.out.println(attributes); // [attr, attr, attr, attr, attr, ..]

		// 3. arff를 나타내는 Instances객체를 만들자.
		Instances instances = new Instances("test", attributes, 0);
		// target(분류할 대상, 분류할 항목, 정답)이 되는 인덱스를 설정
		instances.setClassIndex(instances.numAttributes() - 1);
		instances.add(new DenseInstance(1, values));

		System.out.println("=== 여기까지 만든 arff(instances) 확인 ===");
		System.out.println(instances);

		// 모델을 읽어와서, test데이터에 있는 것 꺼내서 검증해보자.
		Classifier model = (Classifier) SerializationHelper.read(path + "\\model\\titanic_rf.model");

		double result = model.classifyInstance(instances.firstInstance());

		System.out.println("============== 분류기의 결과>> " + result);
		if (result != 0) { // 살았다면
			System.out.println("살았습니다");
		} else {
			System.out.println("죽었습니다");
		}
		System.out.println("============== 추천내용 ============");
		String[] yes = { "또 다른 여행 가자", "집에서 다시는 안나오겠어", "파티를 열자", "죽은 사람들을 추모하겠어" };
		String[] no = { "좋은 생이었다", "남은 가족이 걱정된다", "수영을 배워둘걸", "다음 생은 어떨까" };

		Random r = new Random();
		int index = r.nextInt(4); //0~3
		
		//리턴해야할 데이터가 추천하는 내용/이미지 2개 이므로 String[]을 만들어줌.
		String[] returnValues = new String[2];
		if (result != 0) {
			System.out.println(">>>생존자 : " + yes[index]); 
			returnValues[0] = ">>>생존자 : " + yes[index]; //추천하는 내용
			returnValues[1] = "yes" + index; //추천하는 이미지 
		} else {
			System.out.println(">>>사망자 : " + no[index]);
			returnValues[0] = ">>>사망자 : " + no[index];
			returnValues[1] = "no" + index;
		}
		return returnValues;
	}
}
