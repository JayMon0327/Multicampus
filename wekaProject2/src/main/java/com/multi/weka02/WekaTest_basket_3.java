package com.multi.weka02;

import java.io.File;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.CSVLoader;

public class WekaTest_basket_3 {

	public static void main(String[] args) throws Exception {
		// 1. 데이터 로딩(수집)
		//Instances data = new Instances(new BufferedReader(new FileReader("data/titanic2_pre.arff")));
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("data/basketball_stat2.csv"));
		Instances data = loader.getDataSet(); //arff형식으로 변환해서 가지고 온다.
		//System.out.println(data);

		//Instances는 arff파일 형식!!
		Instances train = data.trainCV(5, 0, new Random(50)); //씨앗값, seed값
		Instances test = data.testCV(5, 0);

		// 2. 데이터 전처리(weka나 엑셀, 메모장)
		// 3. 분석 방법을 제시
		RandomForest model = new RandomForest();

		//target지정
		train.setClassIndex(train.numAttributes() - 1); 
		test.setClassIndex(test.numAttributes() - 1);
		
		// 4. 교차검증(Cross-Validation)설정
		Evaluation eval = new Evaluation(train);
		eval.crossValidateModel(model, train, 5, new Random(100));

		// 5. 분석을 시작 --> 제일 좋은 공식을 찾아냈을 것임.
		model.buildClassifier(train);
		
		// 6. 찾아낸 방법(모델)을 통해 test로 검증해보자.
		eval.evaluateModel(model, test);
		
		// 7. 검증한 결과를 출력
		System.out.println(eval.toSummaryString());
		System.out.println(eval.toMatrixString());
		
		SerializationHelper.write("model/titanic_rf.model", model);
		System.out.println("학습결과로 모델로 저장했습니다.!!");
		
	}
}
