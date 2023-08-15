## 메서드 선언부
#def div_func( n1, n2 ):
#    res = n1/n2
#    return res

def mul_func( n1, n2 ):
    res = n1*n2
    return res

def add_func( n1, n2 ):
    res = n1+n2
    return res

def min_func( n1, n2 ):
    res = n1-n2
    return res

def double_func( n1, n2 ):
    res = n1**n2
    return res

##전역변수 (인스턴스 변수, 클래스변수)
num1,num2,result = 100,200,0

##메인 코드부 ( main() 메서드 )
##result = num1 + num2
#result = div_func(num1,num2)
#print(num1,'/',num2,'=',result)

result = mul_func(num1,num2)
print(num1,'*',num2,'=',result)

result = double_func(num1,num2)
print(num1,'**',num2,'=',result)

result = add_func(num1,num2)
print(num1,'+',num2,'=',result)

result = min_func(num1,num2)
print(num1,'-',num2,'=',result)
