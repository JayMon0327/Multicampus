function 로그인() {
	id2 = 'root';
	id = prompt('아이디 입력')
	if (id == id2) { //==
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
	}
function 비교(){
	n1 = prompt('숫자입력1')
	n2 = prompt('숫자입력2')
	
	if(n1>n2){
		alert('첫번째 숫자가 두번째 숫자보다 큽니다')
	}else if(n2>n1) {
		alert('첫번째 숫자가 두번째 숫자보다 작습니다')
	}else if(n1 == n2){
		alert('두 수가 동일합니다.')
	}else if(n1 != n2){
		alert('두 수가 동일하지 않습니다')
	}
	}
function 기분비교(){
	ff = prompt('친구 기분입력(굿, 별로, 나빠)')
	mf = prompt('나의 기분입력(굿, 별로, 나빠)')
	
	if(ff==mf){
		alert('친구분과 본인이 기분이 같습니다')
	}else{
		alert('친구분과 본인의 기분이 동일하지 않습니다')
	}
	}
	
	//두 숫자가 큰지/작은지/동일한지 동일하지 않은지 판별
	
	//친구의 기분(굿,별로,나빠)
	//나의 기분(굿,별로,나빠)입력
	//동일한지/하지 않은지 판별하여 프린트



