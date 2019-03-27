import java.util.Scanner;

//계산기에 필요한 기본 기능(덧셈, 뺄셈, 곱셈, 나눗셈)을 구현한 클래스 작성
class Add {
	//피연산자(숫자) 설정
	private int num1, num2;
	//[이해필요] setValue() 메소드를 이용하여 연산 대상을 설정
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//연산 결과(+)가 int 값으로 리턴되는 cal() 메소드
	public int cal() {
		return num1 + num2;
	}
}

class Sub {
	//피연산자(숫자) 설정
	private int num1, num2;
	//[이해필요] setValue() 메소드를 이용하여 연산 대상을 설정
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//연산 결과(-)가 int 값으로 리턴되는 cal() 메소드
	public int cal() {
		return num1 - num2;
	}
}

class Mul {
	//피연산자(숫자) 설정
	private int num1, num2;
	//[이해필요] setValue() 메소드를 이용하여 연산 대상을 설정
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	//연산 결과(*)가 int 값으로 리턴되는 cal() 메소드
	public int cal() {
		return num1 * num2;
	}
}

class Div {
	//피연산자(숫자) 설정
	private int num1, num2;
	//[이해필요] setValue() 메소드를 이용하여 연산 대상을 설정
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	//연산 결과(/)가 int 값으로 리턴되는 cal() 메소드
	public int cal() {
		return num1 / num2;
	}
}


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("기본 기능 계산기입니다.");
		System.out.println("두 정수와 연산자(+, -, *, /)를 입력하세요.");
		
		//사용자가 입력한 내용 중 숫자에 해당하는 int값을 입력받기위해 nextInt() 사용
		//입력한 연산자를 char 타입으로 변환시켜주는 charAt() 사용
		int insertNum1 = s.nextInt();
        int insertNum2 = s.nextInt();
        char c = s.next().charAt(0);
        
        //switch-case문을 통해 문자화된 값(' ')이 어떤 연산을 의미하는지 구분
        switch(c) {
        case '+' : 
        //Add 클래스 사용을 위한 객체 생성
            Add add = new Add();
            //해당 객체에서 setValue() 호출
            add.setValue(insertNum1, insertNum2);
            System.out.println(add.cal());
            break;
        
        case '-' : 
        //Sub 클래스 사용을 위한 객체 생성
            Sub sub = new Sub();
            sub.setValue(insertNum1, insertNum2);
            System.out.println(sub.cal());
            break;
            
        case '*' : 
        //Sub 클래스 사용을 위한 객체 생성
            Mul mul = new Mul();
            mul.setValue(insertNum1, insertNum2);
            System.out.println(mul.cal());
            break;
        
        case '/' : 
        //Div 클래스 사용을 위한 객체 생성
            Div div = new Div();
            div.setValue(insertNum1, insertNum2);
            System.out.println(div.cal());
            break;
            
            default : System.out.println("연산자 오류가 발생하였습니다.");
        }//switch end
        
        System.out.println();
	}//main end
}//class end