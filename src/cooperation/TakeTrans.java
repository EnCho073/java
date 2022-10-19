package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  Student studentKim = new Student("Kim",20000);
		  //본인이름 생성하기 
		  //버스,지하철타보기
		  
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		  studentJames.showInfo();           // james 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		  
		  Subway subwayline2 = new Subway("2호선");  
		  studentTomas.takeSubway(subwayline2);  // Tomas가 2호선을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayline2.showInfo();
		  
		  Bus bus200 = new Bus(200);
		  studentKim.takeBus(bus200);
		  studentKim.takeSubway(subwayline2);
		  studentKim.showInfo();
		  bus200.showInfo();
		  subwayline2.showInfo();
	}
}
