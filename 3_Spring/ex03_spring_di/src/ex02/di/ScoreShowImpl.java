package ex02.di;

import java.util.Scanner;

public class ScoreShowImpl implements ScoreShow {
	
	private ScoreImpl score;
	
	public void setScore(ScoreImpl score) {
		this.score = score;
	}

	@Override
	public void print() {
		System.out.println("국어 : "+score.getKor());
		System.out.println("영어 : "+score.getEng());
		System.out.println("전산 : "+score.getCom());
		System.out.println("합  : "+score.total());
		System.out.println("평균 : "+score.avg());
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kor,eng,com = ");
		score.setKor(sc.nextInt());
		score.setEng(sc.nextInt());
		score.setCom(sc.nextInt());

	}


}
