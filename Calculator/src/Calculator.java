import java.util.Scanner;

//���⿡ �ʿ��� �⺻ ���(����, ����, ����, ������)�� ������ Ŭ���� �ۼ�
class Add {
	//�ǿ�����(����) ����
	private int num1, num2;
	//[�����ʿ�] setValue() �޼ҵ带 �̿��Ͽ� ���� ����� ����
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//���� ���(+)�� int ������ ���ϵǴ� cal() �޼ҵ�
	public int cal() {
		return num1 + num2;
	}
}

class Sub {
	//�ǿ�����(����) ����
	private int num1, num2;
	//[�����ʿ�] setValue() �޼ҵ带 �̿��Ͽ� ���� ����� ����
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//���� ���(-)�� int ������ ���ϵǴ� cal() �޼ҵ�
	public int cal() {
		return num1 - num2;
	}
}

class Mul {
	//�ǿ�����(����) ����
	private int num1, num2;
	//[�����ʿ�] setValue() �޼ҵ带 �̿��Ͽ� ���� ����� ����
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	//���� ���(*)�� int ������ ���ϵǴ� cal() �޼ҵ�
	public int cal() {
		return num1 * num2;
	}
}

class Div {
	//�ǿ�����(����) ����
	private int num1, num2;
	//[�����ʿ�] setValue() �޼ҵ带 �̿��Ͽ� ���� ����� ����
	public void setValue(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	//���� ���(/)�� int ������ ���ϵǴ� cal() �޼ҵ�
	public int cal() {
		return num1 / num2;
	}
}


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("�⺻ ��� �����Դϴ�.");
		System.out.println("�� ������ ������(+, -, *, /)�� �Է��ϼ���.");
		
		//����ڰ� �Է��� ���� �� ���ڿ� �ش��ϴ� int���� �Է¹ޱ����� nextInt() ���
		//�Է��� �����ڸ� char Ÿ������ ��ȯ�����ִ� charAt() ���
		int insertNum1 = s.nextInt();
        int insertNum2 = s.nextInt();
        char c = s.next().charAt(0);
        
        //switch-case���� ���� ����ȭ�� ��(' ')�� � ������ �ǹ��ϴ��� ����
        switch(c) {
        case '+' : 
        //Add Ŭ���� ����� ���� ��ü ����
            Add add = new Add();
            //�ش� ��ü���� setValue() ȣ��
            add.setValue(insertNum1, insertNum2);
            System.out.println(add.cal());
            break;
        
        case '-' : 
        //Sub Ŭ���� ����� ���� ��ü ����
            Sub sub = new Sub();
            sub.setValue(insertNum1, insertNum2);
            System.out.println(sub.cal());
            break;
            
        case '*' : 
        //Sub Ŭ���� ����� ���� ��ü ����
            Mul mul = new Mul();
            mul.setValue(insertNum1, insertNum2);
            System.out.println(mul.cal());
            break;
        
        case '/' : 
        //Div Ŭ���� ����� ���� ��ü ����
            Div div = new Div();
            div.setValue(insertNum1, insertNum2);
            System.out.println(div.cal());
            break;
            
            default : System.out.println("������ ������ �߻��Ͽ����ϴ�.");
        }//switch end
        
        System.out.println();
	}//main end
}//class end