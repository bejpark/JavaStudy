package Quiz;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class VideoController {
	private Scanner sc;
	private HashMap<Integer, VideoClass> video;
	
	public VideoController() {
		sc = new Scanner(System.in);
		video = new HashMap();
	}
	
	public void run() throws NumberFormatException, IOException{
		int idx=1;
		System.out.println("** 비디오 대여** ");
		while(true) {
			System.out.println("[ 메뉴를 선택하세요 ]");
			System.out.println("[1:추가], [2:삭제], [3:리스트 출력], [4:수정], [5:프로그램 종료]");
			switch(sc.nextInt()) {
			case 1:
				insertVideo(idx++);
				break;
			case 2:
				deleteVideo();
				break;
			case 3:
				showList();
				break;
			case 4:
				modVideo();
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("1 ~ 5 사이로 입력하세요.");
				break;
			}
			System.out.println();
		}
	}

	private void insertVideo(int idx) {
		String title="";
		String category="";
		Boolean lend=false;
		String lendName="";
		System.out.println("<< 1:추가를 선택하셨습니다. >>");
		
		System.out.print("비디오 제목을 입력하세요 : ");
		title=sc.next();
		System.out.print("비디오 장르를 입력하세요 : ");
		category=sc.next();
		System.out.print("대여자 이름을 입력하세요 : ");
		lendName=sc.next();
		Date date =  new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm월 dd일 hh시");
		String strdate = simpleDateFormat.format(date);
		VideoClass v = new VideoClass(idx,title,category,true,lendName,strdate);
		video.put(idx, v);
		System.out.println();
	}
	private void deleteVideo() {
		System.out.println("<< 2:삭제를 선택하셨습니다. >>");
		System.out.print("삭제할 비디오 번호를 입력하세요 : ");
		int n = sc.nextInt();
		if(video.containsKey(n)) {
			video.remove(n);
			System.out.println(n+"번 비디오 정보를 삭제하였습니다.");
		}
		else {
			System.out.println(n+"번 비디오 정보가 없습니다.");
		}
	}

	private void modVideo() {
		String title="";
		String category="";
		Boolean lend=false;
		String lendName="";
		System.out.println("<< 4:수정을 선택하셨습니다. >>");
		System.out.print("수정할 비디오 번호를 입력하세요 : ");
		int n = sc.nextInt();
		if(video.containsKey(n)) {
			System.out.print("변경할 비디오 제목을 입력하세요 : ");
			title=sc.next();
			System.out.print("변경할 비디오 장르를 입력하세요 : ");
			category=sc.next();
			System.out.print("변경할 대여자 이름을 입력하세요 : ");
			lendName=sc.next();
			Date date =  new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm월 dd일 hh시");
			String strdate = simpleDateFormat.format(date);
			video.get(n).setTitle(title);
			video.get(n).setCategory(category);
			video.get(n).setLendName(lendName);
			video.get(n).setLendDate(strdate);
			System.out.println();		
		}
		else {
			System.out.println(n+"번 비디오 정보가 없습니다.");
		}
		
		

	}

	private void showList() {
		System.out.println("<< 3:리스트 출력을 선택하셨습니다. >>");
		Iterator it = video.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry subE = (Map.Entry)it.next();
			System.out.println(subE.getValue().toString() );
		}

	}

	
	private void exit() {
		System.out.println("[종료]");
		System.exit(0);
		// TODO Auto-generated method stub
		
	}
	
}
