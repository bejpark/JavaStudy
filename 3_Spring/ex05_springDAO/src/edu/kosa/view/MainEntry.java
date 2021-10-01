package edu.kosa.view;

import java.util.Scanner;

import edu.kosa.dao.GiftDAO;
import edu.kosa.dao.GiftDAOImpl;
import edu.kosa.model.GiftVO;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		GiftDAO dao = new GiftDAOImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요 : 1.insert\n2.selectAll\n3.select\n4.update\n5.delete\n6.close");
		
		switch(sc.nextInt()) {
		case 1:
			GiftVO vo = new GiftVO();
			System.out.print("gno = ");
			vo.setGno(sc.nextInt());
			System.out.print("gname = ");
			vo.setGname(sc.next());
			System.out.print("최하 = ");
			vo.setG_start(sc.nextInt());
			System.out.print("최고 = ");
			vo.setG_end(sc.nextInt());
			dao.insert(vo);
			System.out.print(vo.getGname()+" 추가 성공");
			break;
		case 2:		
			dao.selectAll();
			break;
		case 3:
			System.out.print("gno select : ");
			int gno = sc.nextInt();
			vo = dao.select(gno);
			System.out.println(vo.getGno()+"/"+vo.getGname()+"/"+vo.getG_start()+"/"+vo.getG_end());
			break;
		case 4:
			GiftVO vo2 = new GiftVO();
			System.out.print("update call : ");
			vo2.setGno(sc.nextInt());
			System.out.print("gname = ");
			vo2.setGname(sc.next());
			System.out.print("최하 = ");
			vo2.setG_start(sc.nextInt());
			System.out.print("최고 = ");
			vo2.setG_end(sc.nextInt());
			dao.update(vo2);
			System.out.print(vo2.getGname()+" update 성공");
			break;
		case 5:
			System.out.print("delete call : ");
			int gno3 = sc.nextInt();
			dao.delete(gno3);
			System.out.println(gno3+" 삭제완료");
			break;
		case 6:
			System.out.println("Exit");
			System.exit(0);
		default:
			System.out.println("없는 번호");
			break;
		}
		
		
		
		
		
		

	}

}
