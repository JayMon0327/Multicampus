package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.CSVLoader;

public class WekaTest_titanic_4 {

	public static void main(String[] args) throws Exception {
		// 1. 데이터 로딩(수집)
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("data/titanic2_pre.csv"));
		Instances data = loader.getDataSet(); // arff형식으로 변환해서 가지고 온다.
		// System.out.println(data);

		// 모델을 읽어와서, test데이터에 있는 것 꺼내서 검증해보자.
		Classifier model = (Classifier) SerializationHelper.read("model/titanic_rf.model");

		// 나의 데이터를 넣어서, 내가 타이타닉호에 탔을 때, 죽었을지 살았을지 판단해보자.@@@
		// arff형식으로 내 데이터를 만들어주어야 한다.
		// Instances객체(arff)
//		@relation titanic-weka.filters.AllFilter-weka.filters.MultiFilter-Fweka.filters.AllFilter-S1-weka.filters.unsupervised.attribute.Remove-R11-weka.filters.unsupervised.attribute.Remove-R12-weka.filters.unsupervised.attribute.Remove-R6-weka.filters.unsupervised.attribute.Remove-R7-weka.filters.unsupervised.attribute.Remove-R8-weka.filters.unsupervised.attribute.Remove-R8-weka.filters.unsupervised.attribute.Remove-R9-weka.filters.supervised.attribute.NominalToBinary-weka.filters.supervised.attribute.NominalToBinary-weka.filters.unsupervised.attribute.Remove-R1-2
//
//		@attribute sex=female numeric
//		@attribute age numeric
//		@attribute sibsp numeric
//		@attribute fare numeric
//		@attribute class=Third numeric
//		@attribute class=First numeric
//		@attribute class=Second numeric
//		@attribute alive {no,yes}
//
//		@data
//		0,22,1,7.25,1,0,0

		// 1. Attribute리스트를 만들자.
		ArrayList attributes = new ArrayList();

		// 2. attributes리스트를 만들어서 Instances객체에 셋팅
		Enumeration<Attribute> attr_list = data.enumerateAttributes();
		// System.out.println(attr_list);
		// 목록이 계속 있니? 물어보고 true이면 하나씩 attribute를 꺼내서, arraylist에 옮기자.
		// hasMoreElements() : 목록중에 다음 항목(element,요소)가 있는지 체크
		// nextElement() : 목록중에 하나의 항목을 꺼내오자
		// attributes.add(항목)
		while (attr_list.hasMoreElements()) {
			attributes.add(attr_list.nextElement());
		}
		System.out.println(attributes); // [attr, attr, attr, attr, attr, ..]

		// 3. arff를 나타내는 Instances객체를 만들자.
		Instances instances = new Instances("test", attributes, 0);
		// target(분류할 대상, 분류할 항목, 정답)이 되는 인덱스를 설정
		instances.setClassIndex(instances.numAttributes() - 1);

		// 4. 분류할 데이터의 값들을 double[]에 넣어주자.!
		// {여자여부, 나이, 형제자매수, 클래스1, 클래스2, 클래스3}
		// DenseInstance객체는 한사람의 데이터들을 나타내는 객체 <-구현- Instance인터페이스
		// double[] values = {1, 88, 0, 55, 0, 0, 1 };
//		0,22,1,7.25,1,0,0,no
//		1,38,1,71.2833,0,1,0,yes
//		1,26,0,7.925,1,0,0,yes

		// double[] values = { 0, 22, 1, 7.25, 1, 0, 0 }; //0
		// double[] values = { 1, 38, 1, 71, 0, 1, 0 }; //1
		double[] values = { 1, 26, 0, 7.925, 1, 0, 0 }; //1
		instances.add(new DenseInstance(1, values));

		System.out.println("=== 여기까지 만든 arff(instances) 확인 ===");
		System.out.println(instances);

		// 5. read해온 model로 위에서 만든 사람을 분류해보자.
		// 분류기(classfier), 모델, 학습기
		double result = model.classifyInstance(instances.firstInstance());
		System.out.println("분류기의 결과>> " + result);
	}
}
