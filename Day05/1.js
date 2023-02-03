function check() {
    id = "root"
    pw = "1234"
   
    
    id2 = document.getElementById('id2').value //"root"
    pw2 = document.getElementById('pw2').value //"1234"
    //id2가 id와 일치, pw2가 pw와 일치 둘다 만족하면
    //로그인성공!!
    //result안에 오른쪽에 있는 내용을 html 코드로 안쪽에 집어넣어요
    result = document.getElementById('result')
    if(id2 == id && pw2 == pw){
       result.innerHTML ="<font color =green><h3>로그인성공<h3> <img src = ss.jpg width='50px';>" 

    } else{
        result.innerHTML ="<font color =blue><h3>아이디 및 비밀번호가 틀립니다</h3> <br><img src = ff.jpg width='50px'>"
    }
    
}





